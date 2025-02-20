import java.util.PriorityQueue;

public class connecting_cities_problem {
    static class Eage implements Comparable<Eage>{
        int dest;
        int cost;

        public Eage(int d,int c){
            this.dest = d;
            this.cost = c;
        }

        public int compareTo(Eage t2){
            return this.cost-t2.cost;
        }
    }

    public static int connenctingcities(int cities[][]){
        PriorityQueue<Eage> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Eage(0,0));
        int finalcost = 0;

        while (!pq.isEmpty()){
            Eage curr = pq.remove();
            if (!vis[curr.dest]){
                vis[curr.dest] = true;
                finalcost += curr.cost;

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0){
                        pq.add(new Eage(i,cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalcost;
    }
    public static void main(String[] args) {
        int cities[][] = {{0,1,2,3,4},
                {1,0,5,0,7},
                {2,5,0,6,0},
                {3,0,6,0,0},
                {4,7,0,0,0}};
        System.out.println(connenctingcities(cities));
    }
}
