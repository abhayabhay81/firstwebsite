import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cheapest_flight_with_K_stops {
    static class Eage{
        int src;
        int dest;
        int wt;

        public Eage(int s,int d,int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static void creategraph(int flight[][],ArrayList<Eage>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];

            Eage e = new Eage(src,dest,wt);
            graph[src].add(e);
        }
    }

    public static int cheapestflight(int n,int flight[][],int src,int dest,int k){
        ArrayList<Eage>graph[] = new ArrayList[n];
        creategraph(flight,graph);

        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));

        while (!q.isEmpty()){
            Info curr = q.remove();
            if (curr.stops > k){
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Eage e = graph[curr.v].get(i);
                int u =e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] +wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        if (dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else {
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int flight[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0,dst = 3,k = 1;

        ArrayList<Eage> graph[] = new ArrayList[n];
        creategraph(flight,graph);
        System.out.println(cheapestflight(n,flight,src,dst,k));

    }
}
