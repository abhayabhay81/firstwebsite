import java.util.ArrayList;

public class merge_two_bst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if (root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static Node mergebst(Node root1,Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);

        int i=0,j=0;
        ArrayList<Integer> finalarray = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()){
            if (arr1.get(i) <= arr2.get(j)){
                finalarray.add(arr1.get(i));
                i++;
            }else {
                finalarray.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()){
            finalarray.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()){
            finalarray.add(arr2.get(j));
            j++;
        }
        return createbst(finalarray,0,finalarray.size()-1);
    }
    public static Node createbst(ArrayList<Integer> arr,int st,int ed){
        if (st > ed){
            return null;
        }
        int mid = (st+ed)/2;
        Node root = new Node(arr.get(mid));
        root.left = createbst(arr,st,mid-1);
        root.right = createbst(arr,mid+1,ed);
        return root;
    }
    public static void preorder(Node root){
        if (root ==  null){
            return;
        }
        System.out.print(root.data +"-->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergebst(root1,root2);
        preorder(root);

    }
}
