import java.util.Comparator;
import java.util.PriorityQueue;

public class priority_queue {
    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("a",4));
        pq.add(new student("b",5));
        pq.add(new student("c",2));
        pq.add(new student("d",14));


        while (!pq.isEmpty()){
            System.out.println(pq.peek().name+" "+pq.peek().rank);
            pq.remove();
        }
    }
}
