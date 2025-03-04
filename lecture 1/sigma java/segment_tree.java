public class segment_tree {
    static int tree[];

    public static void initialize(int n){
        tree = new int[4*n];
    }
    public static int builttree(int arr[],int i,int start,int end){
        if (start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start+end)/2;
        builttree(arr,2*i+1,start,mid);  // left subtree
        builttree(arr,2*i+2,mid+1,end);  // right subtree
        tree[i] = tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }
    public static int getsumutill(int i,int si,int sj,int qi,int qj){
        if (qj <= si || qi >= sj){
            return 0;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        }else {
            int mid = (si+sj)/2;
            int left = getsumutill(2*i+1,si,mid,qi,qj);
            int right = getsumutill(2*i+2,mid+1,sj,qi,qj);
            return left+right;
        }
    }
    public static int getsum(int arr[],int qi,int qj){
        int n = arr.length;
        return getsumutill(0,0,n-1,qi,qj);
    }
    
    public static void updateutill(int i,int si,int sj,int idx,int diff){
        if (idx > sj || idx < si){
            return ;
        }
        tree[i] += diff;
        if (si != sj){
            int mid = (si+sj)/2;
            updateutill(2*i+1,si,mid,idx,diff);
            updateutill(2*i+2,mid+1,sj,idx,diff);
        }
    }
    public static void getupdate(int arr[],int idx,int neval){
        int n = arr.length;
        int diff =  neval-arr[idx];
        arr[idx] = neval;
        updateutill(0,0,n-1,idx,diff);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        initialize(n);
        builttree(arr,0,0,n-1);

//        for (int i = 0; i < tree.length; i++) {
//            System.out.print(tree[i]+" ");
//        }
//        System.out.println();

        System.out.println(getsum(arr,2,5));
        getupdate(arr,2,2);
        System.out.println(getsum(arr,2,5));
    }
}
