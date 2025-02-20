import org.w3c.dom.CDATASection;

import java.util.ArrayList;

public class binary_search_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            root.left = insert(root.left,val);
        }else {
            root.right = insert(root.right,val);
        }
        return root;
    }


    public static boolean search(Node root ,int key){
        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }

        if (root.data > key){
            return  search(root.left,key);
        }else {
            return search(root.right,key);
        }
    }
    public static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node delete(Node root,int key){
        if (root.data < key){
            root.right = delete(root.right,key);
        } else if (root.data > key) {
            root.left = delete(root.left,key);
        }else {
            if (root.left == null && root.right == null){
                return null;
            }
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }
            Node is = findinorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }
    public static Node findinorderSuccessor(Node root){
        while (root.left != null){
            root  = root.left;
        }
        return root;
    }
    public static void print_range(Node root,int k1,int k2){
        if (root ==  null){
            return;
        }
        if (root.data >= k1 && root.data <= k2){
            print_range(root.left,k1,k2);
            System.out.print(root.data + " ");
            print_range(root.right,k1,k2);
        } else if (root.data < k1) {
            print_range(root.left,k1,k2);
        }else {
            print_range(root.right,k1,k2);
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }
    public static void print_root_to_leef(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }
        path.add(root.data);
        if (root.left ==  null && root.right == null){
            printpath(path);
        }
        print_root_to_leef(root.left,path);
        print_root_to_leef(root.right,path);
        path.remove(path.size()-1);
    }


    public static boolean validate_BST(Node root,Node min,Node max){
        if (root == null){
            return true;
        }
        if (min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return validate_BST(root.left,min,root) && validate_BST(root.right,root,max);
    }



    public static Node create_mirror(Node root){
        if (root ==  null){
            return null;
        }
        Node leftsubtree  = create_mirror(root.left);
        Node rightsubtree  = create_mirror(root.right);

        root.left = rightsubtree;
        root.right = leftsubtree;
        return root;
    }
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }



    public static Node sorted_array_to_balanced_bst(int arr[],int st,int ed){
        if (st > ed){
            return null;
        }
        int mid = (st+ed)/2;
        Node root = new Node(arr[mid]);
        root.left = sorted_array_to_balanced_bst(arr,st,mid-1);
        root.right = sorted_array_to_balanced_bst(arr,mid+1,ed);
        return root;
    }



    public static Node balenced_bst_to_unbailence_bst(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root,inorder);
        root = createbst(inorder,0,inorder.size()-1);
        return root;
    }
    public static void getinorder(Node root,ArrayList<Integer> inorder){
        if (root == null){
            return;
        }
        getinorder(root.left,inorder);
        inorder.add(root.data);
        getinorder(root.right,inorder);
    }
    public static Node createbst(ArrayList<Integer> inoder, int st,int ed){
        if (st > ed){
            return null;
        }
        int mid = (st + ed)/2;
        Node root = new Node(inoder.get(mid));
        root.left =  createbst(inoder,st,mid-1);
        root.right = createbst(inoder,mid+1,ed);
        return root;
    }
    public static Node merger_2_bst(Node root1,Node root2){
            ArrayList<Integer> arr1 = new ArrayList<>();
            getinorder(root1,arr1);

            ArrayList<Integer> arr2 = new ArrayList<>();
            getinorder(root2,arr2);

            int  i = 0,j = 0;
            ArrayList<Integer> finalarr = new ArrayList<>();
            while (i < arr1.size() && j < arr2.size()){
                if (arr1.get(i) <= arr2.get(j)){
                    finalarr.add(arr1.get(i));
                    i++;
                }else {
                    finalarr.add(arr2.get(j));
                    j++;
                }
            }
            while (i < arr1.size()){
                finalarr.add(arr1.get(i));
                i++;
            }
            while (j < arr2.size()){
                finalarr.add(arr2.get(j));
                j++;
            }
            return create_bst(finalarr,0,finalarr.size()-1);
    }
    public static Node create_bst(ArrayList<Integer> arr,int st,int end){
            if (st > end){
                return null;
            }
            int mid = (st+end)/2;
            Node root = new Node(arr.get(mid));
            root.left = create_bst(arr,st,mid-1);
            root.right = create_bst(arr,mid+1,end);
            return root;
    }
    public static void main(String[] args) {
//       int values[] = {8,5,3,6,10,11,14};
//       Node root = null;
//        for (int i = 0; i < values.length; i++) {
//            root = insert(root,values[i]);
//        }
//
//        System.out.print("inorder sequence ");
//        inorder(root);
//        System.out.println();

//        if (search(root, 6)){
//            System.out.println("found");  // 0(h)  h = height
//        }else {
//            System.out.println("not found");
//        }

//        root = delete(root,1);
//        System.out.println();
//        inorder(root);

//        System.out.print("range of ");
//        print_range(root,5,15);
//        System.out.println();

//        print_root_to_leef(root,new ArrayList<>());

//        if (validate_BST(root,null,null)){
//            System.out.println("valied");
//        }else {
//            System.out.println("not valid");
//        }

//        Node root = new Node(8);
//        root.left = new Node(5);
//        root.right = new Node(10);
//        root.left.left = new Node(3);
//        root.left.right = new Node(6);
//        root.right.left = new Node(11);
//
//        root = create_mirror(root);
//        preorder(root);

//        int arr[] = {3,5,6,8,10,11,12};
//        Node root = sorted_array_to_balanced_bst(arr,0,arr.length-1);
//        preorder(root);

//        Node root = new Node(8);
//        root.left = new Node(6);
//        root.left.left = new Node(5);
//        root.left.left.left = new Node(3);
//
//        root.right = new Node(10);
//        root.right.right = new Node(11);
//        root.right.right.right = new Node(12);
//
//        root = balenced_bst_to_unbailence_bst(root);
//        preorder(root);

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node root1 = new Node(9);
        root1.left = new Node(3);
        root1.right = new Node(12);

        Node root2 =  merger_2_bst(root,root1);
        preorder(root2);


    }
}
