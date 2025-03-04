import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void creategraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[5].add(new Edge(6,5,1));

    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                bfsutil(graph,vis);
            }
        }
    }
    public static void bfsutil(ArrayList<Edge>[] graph,boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()){
            int curr = q.remove();
            if (!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


//    public static void bfs(ArrayList<Edge>[] graph){
//        Queue<Integer> q = new LinkedList<>();
//        boolean vis[] = new boolean[graph.length];
//        q.add(0);
//        while (!q.isEmpty()){
//            int curr = q.remove();
//            if (!vis[curr]){
//                System.out.print(curr+" ");
//                vis[curr] = true;
//                for (int i = 0; i < graph[curr].size(); i++) {
//                    Edge e = graph[curr].get(i);
//                    q.add(e.dest);
//                }
//            }
//        }
//    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dfsutil(graph,i,vis);
        }
    }

    public static void dfsutil(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e =graph[curr].get(i);
            if (!vis[e.dest]){
                dfsutil(graph,e.dest,vis);
            }
        }
    }
//    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
//        System.out.print(curr+" ");
//        vis[curr] = true;
//
//        for (int i = 0; i < graph[curr].size(); i++) {
//            Edge e =graph[curr].get(i);
//            if (!vis[e.dest]){
//                dfs(graph,e.dest,vis);
//            }
//        }
//    }

    public static boolean has_path_problem(ArrayList<Edge>[] graph,int src,int dest,boolean vis[]){
        if (src == dest){
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
//            e.dest = neighbour
            if (!vis[e.dest] && has_path_problem(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int v = 5;
//        ArrayList<Edge>[] graph = new ArrayList[v];
//        for (int i = 0; i < v; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        graph[0].add(new Edge(0,1,5));
//
//        graph[1].add(new Edge(1,0,5));
//        graph[1].add(new Edge(1,2,1));
//        graph[1].add(new Edge(1,3,3));
//
//        graph[2].add(new Edge(2,1,1));
//        graph[2].add(new Edge(2,3,1));
//        graph[2].add(new Edge(2,4,4));
//
//        graph[3].add(new Edge(3,1,3));
//        graph[3].add(new Edge(3,2,1));
//
//        graph[4].add(new Edge(4,2,2));
//
//        for (int i = 0; i < graph[2].size(); i++) {
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest);
//        }

        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print("bfs of the graph ");
        bfs(graph);
        System.out.println();
        System.out.print("dfs of the graph ");
//        dfs(graph,0,new boolean[v]);

        System.out.println(has_path_problem(graph,0,5,new boolean[v]));



    }
}
