import java.util.ArrayList;

public class fingd_cycle_problem {
    static class Edge1{
        int src;
        int dest;

        public Edge1(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void creategraph(ArrayList<Edge1> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge1(0,1));
        graph[0].add(new Edge1(0,2));
        graph[0].add(new Edge1(0,3));

        graph[1].add(new Edge1(1,0));
        graph[1].add(new Edge1(1,2));

        graph[2].add(new Edge1(2,0));
        graph[2].add(new Edge1(2,1));

        graph[3].add(new Edge1(3,0));
        graph[3].add(new Edge1(3,4));

        graph[4].add(new Edge1(4,3));
    }
    public static boolean detectCycle(ArrayList<Edge1>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                if (detectCycleUtile(graph,vis,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtile(ArrayList<Edge1>[] graph,boolean vis[],int curr,int par){
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge1 e = graph[curr].get(i);
            if (!vis[e.dest]){
                if (detectCycleUtile(graph,vis,e.dest,curr)) {
                    return true;
                }
            } else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge1> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.println(detectCycle(graph));
    }
}
