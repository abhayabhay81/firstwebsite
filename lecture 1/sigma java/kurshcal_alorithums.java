import java.util.ArrayList;
import java.util.Collections;

public class kurshcal_alorithums {
    static class Eage implements Comparable<Eage>{
        int src;
        int dest;
        int wt;

        public Eage(int s,int d,int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }

        public int compareTo(Eage t2){
            return this.wt - t2.wt;
        }
    }

    static void creategtaph(ArrayList<Eage> edges){
        edges.add(new Eage(0,1,10));
        edges.add(new Eage(0,2,15));
        edges.add(new Eage(0,3,30));
        edges.add(new Eage(1,3,40));
        edges.add(new Eage(2,3,50));
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }
    public static int find(int x){
        if (par[x] == x){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a,int b){
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        } else if (par[parA] < par[parB]) {
            par[parA] = parB;
        }else {
            par[parB] = parA;
        }
    }
    public static void kurshcalMST(ArrayList<Eage> eges,int v){
        init();
        Collections.sort(eges);
        int mstcost = 0;
        int count = 0;

        for (int i = 0; count < v-1; i++) {
            Eage e = eges.get(i);

            int parA = find(e.src);
            int parB = find(e.dest);

            if (parA != parB){
                union(e.src,e.dest);
                mstcost += e.wt;
                count++;
            }
        }
        System.out.println(mstcost);
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Eage> e = new ArrayList<>();
        creategtaph(e);
        kurshcalMST(e,v);
    }
}
