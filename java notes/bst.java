public class bst{

    static class Info{
        boolean isbst;
        int size;
        int min;
        int max;

        public Info(boolean isbst,int size,int min,int max){
            this.isbst = isbst;
            this.size = size;
            this.min = min;
            this.max =  max;
        }
    }
    public static int maxbst = 0;

    public static Info size_of_largest_bst_in_bt(Node root){
        if (root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = size_of_largest_bst_in_bt(root.left);
        Info rightInfo = size_of_largest_bst_in_bt(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if (leftInfo.isbst && rightInfo.isbst){
            maxbst = Math.max(maxbst,size);
            return new Info(true,size,min,max);
        }
       return new Info(false,size,min,max);
    }
    public static void main(String[] args){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(65);

        Info info = size_of_largest_bst_in_bt(root);
        System.out.println(maxbst);

    }
}