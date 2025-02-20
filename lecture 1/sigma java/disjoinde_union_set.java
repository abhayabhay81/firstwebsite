public class disjoinde_union_set {
    static int n = 7;
    static int per[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            per[i] = i;
        }
    }
    public static int find(int x){
        if (x == per[x]){
            return x;
        }
        return per[x] =find(per[x]);
    }
    //      OR
//    public static int find(int x){
//        if (x == per[x]){
//            return x;
//        }
//        return find(per[x]);
//    }

    public static void union(int a,int b){
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]){
            per[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            per[parA] = parB;
        }else {
            per[parB] = parA;
        }
    }
    public static void main(String[] args) {
        init();
        union(1,3);
        System.out.println(find(3));
        union(2,4);
        union(3,6);
        union(1,4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);

    }
}
