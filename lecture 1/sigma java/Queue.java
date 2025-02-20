public class Queue {
    static class QueueA{
        static int arr[];
        static int size;
        static int rear;

        QueueA(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isempty(){
            return rear == -1;
        }
        public static void add(int data){
            if (rear == size-1){
                System.out.println("Queue if full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int remove(){
            if (isempty()){
                System.out.println("empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear= rear-1;
            return front;
        }
        public static int peek(){
            if (isempty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        QueueA a = new QueueA(5);
        a.add(1);
        a.add(2);
        a.add(3);
        while (!a.isempty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
}
