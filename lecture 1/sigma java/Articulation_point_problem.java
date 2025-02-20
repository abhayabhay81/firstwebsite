import java.util.ArrayList;

public class Articulation_point_problem {
    static class Eage{
        int src;
        int dest;

        public Eage(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void creategraph(ArrayList<Eage>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Eage>();
        }
        graph[0].add(new Eage(0,1));
        graph[0].add(new Eage(0,2));
        graph[0].add(new Eage(0,3));

        graph[1].add(new Eage(1,0));
        graph[1].add(new Eage(1,2));

        graph[2].add(new Eage(2,0));
        graph[2].add(new Eage(2,1));

        graph[3].add(new Eage(3,0));
        graph[3].add(new Eage(3,4));

        graph[4].add(new Eage(4,3));
    }
    public static void getAP(ArrayList<Eage>graph[],int v){
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]){
                dfs(graph,i,-1,dt,low,time,vis,ap);
            }
        }
        for (int i = 0; i < v; i++) {
            if (ap[i]){
                System.out.println("AP : "+i);
            }
        }
    }
    public static void dfs(ArrayList<Eage>graph[],int curr,int par,int dt[],int low[],int time,boolean vis[],boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int childern = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Eage e = graph[curr].get(i);
            int neighbour = e.dest;

            if (par == neighbour){
                continue;
            } else if (vis[neighbour]) {
                low[curr] = Math.min(low[curr],dt[neighbour]);
            }else {
                dfs(graph,neighbour,curr,dt,low,time,vis,ap);
                low[curr] = Math.min(low[curr],low[neighbour]);
                if (par != -1 && dt[curr] <= low[neighbour]){
                    ap[curr] = true;
//                    System.out.println("ap : "+curr);
                }
                childern++;
            }
        }
        if (par == -1 && childern > 1){
            ap[curr] = true;
//            System.out.println("ap : "+curr);
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Eage>graph[] = new ArrayList[v];
        creategraph(graph);
        getAP(graph,v);


    }
}
