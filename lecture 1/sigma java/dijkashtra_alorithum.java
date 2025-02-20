import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkashtra_alorithum {
    static class Edge3{
        int src;
        int dest;
        int wt;
        public Edge3(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n,int path){
            this.n =n;
            this.path = path;
        }

        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    static void creaetegraph(ArrayList<Edge3>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //prim s alogorithums
        graph[0].add(new Edge3(0,1,10));
        graph[0].add(new Edge3(0,2,15));
        graph[0].add(new Edge3(0,3,30));

        graph[1].add(new Edge3(1,0,10));
        graph[1].add(new Edge3(1,3,40));

        graph[2].add(new Edge3(2,0,15));
        graph[2].add(new Edge3(2,3,50));

        graph[3].add(new Edge3(3,1,40));
        graph[3].add(new Edge3(3,2,50));


//        // bellman ford
//
//        graph[0].add(new Edge3(0,1,2));
//        graph[0].add(new Edge3(0,2,4));
//
//        graph[1].add(new Edge3(1,2,-4));
//
//        graph[2].add(new Edge3(2,3,2));
//
//        graph[3].add(new Edge3(3,4,4));
//
//        graph[4].add(new Edge3(4,1,-1));

//        // dijkastra
//        graph[0].add(new Edge3(0,1,2));
//        graph[0].add(new Edge3(0,2,4));
//
//        graph[1].add(new Edge3(1,3,7));
//        graph[1].add(new Edge3(1,2,1));
//
//        graph[2].add(new Edge3(2,4,3));
//
//        graph[3].add(new Edge3(3,5,1));
//
//        graph[4].add(new Edge3(4,3,2));
//        graph[4].add(new Edge3(4,5,5));
    }

    static void creategraph2(ArrayList<Edge3>graph){
        graph.add(new Edge3(0,1,2));
        graph.add(new Edge3(0,2,4));
        graph.add(new Edge3(1,2,-4));
        graph.add(new Edge3(2,3,2));
        graph.add(new Edge3(3,4,4));
        graph.add(new Edge3(4,1,-1));

    }
    public static void dijkstra(ArrayList<Edge3>graph[],int src){
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq =  new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if (!vis[curr.n]){
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge3 e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    public static void bellmanford_alorithum_1(ArrayList<Edge3>graph[],int src){
        // does not for negative weight cycle
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge3 e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    public static void bellmanford_alorithum_2(ArrayList<Edge3>graph,int src,int V){
        // does not for negative weight cycle
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.size(); j++) {
                Edge3 e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }

        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
    }

    static class Pair1 implements Comparable<Pair1>{
        int v;
        int cost;

        public Pair1(int v,int cost){
            this.v = v;
            this.cost = cost;
        }
        public int compareTo(Pair1 p2){
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge3>graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair1> pq = new PriorityQueue<Pair1>();
        pq.add(new Pair1(0,0));
        int finalcost = 0;

        while (!pq.isEmpty()){
            Pair1 curr = pq.remove();
            if (!vis[curr.v]){
                vis[curr.v] = true;
                finalcost += curr.cost;

                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge3 e = graph[curr.v].get(i);
                    pq.add(new Pair1(e.dest,e.wt));
                }
            }
        }
        System.out.println("final cost of mst "+finalcost);
    }
    public static void main(String[] args) {
//        //dijkastra
//        int v = 6;
//        int src = 0;
//        ArrayList<Edge3> graph[] = new ArrayList[v];
//        creaetegraph(graph);
//        dijkstra(graph,src);

        //bellman fords first
//        int v = 5;
//        ArrayList<Edge3>graph[] = new ArrayList[v];
//        creaetegraph(graph);
//        bellmanford_alorithum_1(graph,0);

////   bellman fords
//        ArrayList<Edge3>graph = new ArrayList<>();
//        creategraph2(graph);
//        bellmanford_alorithum_2(graph,0,5);

        // prims alorithums
        int v = 4;
        ArrayList<Edge3>graph[] = new ArrayList[v];
        creaetegraph(graph);
        prims(graph);

   }
}
