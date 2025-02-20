import java.util.ArrayList;

public class tarjon_alorithums {
    static class Eage{
        int src;
        int dest;

        public Eage(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<Eage> graph[]){
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
        graph[3].add(new Eage(3,5));

        graph[4].add(new Eage(4,3));
        graph[4].add(new Eage(4,5));

        graph[5].add(new Eage(5,3));
        graph[5].add(new Eage(5,4));
    }
    public static void dfs(ArrayList<Eage>graph[],int curr,int par,int dt[],int low[],boolean vis[],int time){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Eage e = graph[curr].get(i);
            int neighbour = e.dest;
            if (neighbour == par){
                continue;
            } else if (!vis[neighbour]) {
                dfs(graph,neighbour,curr,dt,low,vis,time);
                low[curr] = Math.min(low[curr],low[neighbour]);
                if (dt[curr] < low[neighbour]){
                    System.out.println("bridge : "+curr+"----"+neighbour);
                }
            }else {
                low[curr] = Math.min(low[curr],dt[neighbour]);
            }
        }
    }
    public static void tarjanbridge(ArrayList<Eage>graph[],int v){
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]){
                dfs(graph,i,-1,dt,low,vis,time);
            }
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Eage> graph[] =new ArrayList[v];
        creategraph(graph);
        tarjanbridge(graph,v);
    }
}
