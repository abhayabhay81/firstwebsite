import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binarytree{
        static int idx = -1;
        public static Node builttree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            Node newnode =new Node(nodes[idx]);
            newnode.left =builttree(nodes);
            newnode.right =builttree(nodes);
            return newnode;
        }
        // preorder
        public static void preorder(Node root){
            if (root == null){
                //System.out.print("-1");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        // inorder
        public static void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //postorder
        public static void postorder(Node root){
            if (root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void level_order(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null) {
                   // System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }else {
                        System.out.print(currNode.data+" ");
                        if (currNode.left != null){
                            q.add(currNode.left);
                        }
                        if (currNode.right != null){
                            q.add(currNode.right);
                        }
                }

            }
        }
    }
    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){
        if (root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int sum(Node root){
        if (root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum + rightsum + root.data;
    }
    public static int diameter_tree_apporoch_1(Node root){
        if (root == null){
            return 0;  // 0(n*n)
        }
        int leftdiam = diameter_tree_apporoch_1(root.left);
        int leftdHt = height(root.left);
        int rightdiam = diameter_tree_apporoch_1(root.right);
        int rightHt = height(root.right);

        int selDiam = leftdHt + rightHt + 1;

        return Math.max(selDiam,Math.max(leftdiam,rightdiam));
    }
    static class Info{
        int dim;
        int ht;

        public Info(int diam,int ht){
            this.dim = diam;
            this.ht = ht;
        }
    }
    public static Info diameter_tree_apporoch_2(Node root){
        if (root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter_tree_apporoch_2(root.left);
        Info rightInfo = diameter_tree_apporoch_2(root.right);

        int diam = Math.max(Math.max(leftInfo.dim, rightInfo.dim), leftInfo.ht + rightInfo.ht + 1);
        int ht  = Math.max(leftInfo.ht, rightInfo.ht + 1);

        return new Info(diam,ht);
    }

    public static boolean sub_tree(Node root,Node subroot){
        if (root == null){
            return false;
        }
        if (root.data == subroot.data){
            if (isIdentical(root,subroot)){
                return true;
            }
        }
        return sub_tree(root.left,subroot) || sub_tree(root.right,subroot);
    }

    public static boolean isIdentical(Node node,Node subroot){
        if (node == null && subroot == null){
            return true;
        }else if (node == null || subroot ==  null || node.data != subroot.data){
            return false;
        }
        if (!isIdentical(node.left,subroot.left)){
            return false;
        }
        if (!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }

    static class Info1{
        Node node;
        int hd;

        public Info1(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void top_view_of_a_tree(Node root){
        Queue<Info1> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0,max = 0;
        q.add(new Info1(root,0));
        q.add(null);

        while (!q.isEmpty()){
            Info1 curr = q.remove();
            if (curr == null){
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info1(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info1(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max ; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void Kth_levael(Node root,int level,int k){
        if (root == null){
            return;
        }
        if (level == k){
            System.out.print(root.data+" ");
            return;
        }
        Kth_levael(root.left,level+1,k);
        Kth_levael(root.right,level+1,k);
    }

    public static Node lowest_common_ancestor_1(Node root,int n1 ,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i =0;
        for (; i<path1.size() && i<path2.size();i++){
            if (path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }

    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if (root == null){
            return false;
        }
        path.add(root);
        if (root.data == n){
            return true;
        }
        boolean foundleft = getpath(root.left,n,path);
        boolean foundright = getpath(root.right,n,path);

        if (foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lowest_common_ancestor_2(Node root,int n1,int n2){
        if (root == null ||root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lowest_common_ancestor_2(root.left,n1,n2);
        Node rightLca = lowest_common_ancestor_2(root.right,n1,n2);

        if (rightLca == null){
            return leftLca;
        }

        if (leftLca == null){
            return rightLca;
        }
        return root;
    }
    public static int min_distance_between_nodes(Node root,int n1,int n2){
        Node lca = lowest_common_ancestor_2(root,n1,n2);
        int dist1 = lcadist(lca,n1);
        int dist2 = lcadist(lca,n2);

        return dist1+dist2;
    }
    public static int lcadist(Node root,int n){
        if (root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = lcadist(root.left,n);
        int rightdist = lcadist(root.right,n);

        if (leftdist == -1 && rightdist == -1){
            return -1;
        } else if (leftdist == -1) {
            return rightdist+1;
        }else {
            return leftdist+1;
        }
    }

    public static int Kth_ancestor_of_node(Node root,int n,int k){
        if (root == null){
            return -1;
        }
        if (root.data == n){
            return 0;
        }
        int leftdist= Kth_ancestor_of_node(root.left,n,k);
        int rightdist = Kth_ancestor_of_node(root.right,n,k);

        if (leftdist == -1 && rightdist == -1){
            return -1;
        }
        int max = Math.max(leftdist,rightdist);
        if (max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    public static int tranceform_to_sum_tree(Node root){
        if (root == null){
            return 0;
        }
        int leftchild = tranceform_to_sum_tree(root.left);
        int rightchild = tranceform_to_sum_tree(root.right);

        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;

        root.data = newleft + leftchild + newright +rightchild;
        return data;
    }
    public static void preorder(Node root){
        if (root == null){
            //System.out.print("-1");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
//        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        binarytree b = new binarytree();
//        Node root = b.builttree(nodes);
//        System.out.print("root ");
//        System.out.println(root.data);
//
//        System.out.print("preorder ");
//        b.preorder(root);
//        System.out.println();
//        System.out.print("inorder ");
//        b.inorder(root);
//        System.out.println();
//        System.out.print("postorder ");
//        b.postorder(root);
//        System.out.println();
//        System.out.print("levelorder ");
//        b.level_order(root);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node rootSUB= new Node(1);
        rootSUB.left = new Node(2);
        rootSUB.right = new Node(3);

//        System.out.print("height is tree is ");
//        System.out.println(height(root));

//        System.out.print("number of nodes in a tree is ");
//        System.out.println(count(root));

//        System.out.print("sum of all nodes in a tree is ");
//        System.out.println(sum(root));

//        System.out.print("the diameter of a tree is ");
//        System.out.println(diameter_tree_apporoch_1(root));

//        System.out.println(diameter_tree_apporoch_2(root).dim);
//        System.out.print(sub_tree(root,rootSUB));

//        top_view_of_a_tree(root);

//        int k = 2;
//        Kth_levael(root,1,k);

//        int n1 = 2,n2 = 5;
//        System.out.println( lowest_common_ancestor(root,n1,n2).data); // 0(n) + space
//       System.out.println( lowest_common_ancestor_2(root,n1,n2).data); // 0(n)
//       System.out.println(min_distance_between_nodes(root,n1,n2));

//        int k = 1,n= 5;
//        System.out.println(Kth_ancestor_of_node(root,n,k));
        tranceform_to_sum_tree(root);
        preorder(root);


    }
}
