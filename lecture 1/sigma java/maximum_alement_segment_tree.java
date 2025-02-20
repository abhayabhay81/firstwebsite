public class maximum_alement_segment_tree{
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static void builttree(int i,int si,int sj,int arr[]){
        if (si == sj){
            tree[i] = arr[si];
            return;
        }
        int mid = (si+sj)/2;
        builttree(2*i+1,si,mid,arr);
        builttree(2*i+2,mid+1,sj,arr);

        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);
    }

    public static int getmax(int arr[],int qi,int qj){
        int n = arr.length;
        return getmaxutill(0,0,n-1,qi,qj);
    }
    public static int getmaxutill(int i,int si,int sj,int qi,int qj){
        if (si > qj || sj < qi){
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        }else {
            int mid = (si+sj)/2;
            int leftans =  getmaxutill(2*i+1,si,mid,qi,qj);
            int rightans = getmaxutill(2*i+2,mid+1,sj,qi,qj);
            return Math.max(leftans,rightans);
        }
    }

    public static void updateutill(int i,int si,int sj,int idx,int newval){
        if (idx < si || idx > sj){
            return;
        }
        tree[i] = Math.max(tree[i],newval);
        if (si != sj){
            int mid = (si+sj)/2;
            updateutill(2*i+1,si,mid,idx,newval);
            updateutill(2*i+2,mid+1,sj,idx,newval);
        }

    }
    public static void update(int arr[],int idx,int newval){
        arr[idx] = newval;
        int n = arr.length;
        updateutill(0,0,n-1,idx,newval);
    }
    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        builttree(0,0,n-1,arr);

//        for (int i = 0; i < tree.length; i++) {
//            System.out.print(tree[i]+" ");
//        }
//        System.out.println();

        int max  = getmax(arr,2,5);
        System.out.println(max);

        update(arr,2,20);

        max  = getmax(arr,2,5);
        System.out.println(max);
    }
}
