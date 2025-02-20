import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju_algorithum {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void creategraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length ; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        vis[curr] = true;
        System.out.print(curr+" ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void toposort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                toposort(graph,e.dest,vis,s);
            }
        }
        s.push(curr);
    }

    public static void kosaraju(ArrayList<Edge>graph[],int v){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]){
                toposort(graph,i,vis,s);
            }
        }
        ArrayList<Edge> trancepost[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            trancepost[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                trancepost[e.dest].add(new Edge(e.dest,e.src));
            }
        }
        while (!s.isEmpty()){
            int curr = s.pop();
            if (!vis[curr]){
                System.out.print("scc->");
                dfs(trancepost,curr,vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);

        kosaraju(graph,v);
    }
}
