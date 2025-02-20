import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_inbuilt {
    static class Queue1{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isempty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if (isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if (isempty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }
    }
    static class Queue2{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isempty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if (!q1.isEmpty()){
                q1.add(data);
            }else {
                q2.add(data);
            }
        }
        public static int pop(){
            if (isempty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top = q1.remove();
                    if (q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else {
                while (!q2.isEmpty()){
                    top = q2.remove();
                    if (q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            if (isempty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else {
                while (!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void priintNonrepting(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void interLeave(Queue<Integer> q){
            Queue<Integer> firstHalf = new LinkedList<>();
            int size = q.size();

            for (int i = 0; i < size/2; i++) {
                firstHalf.add(q.remove());
            }
            while (!firstHalf.isEmpty()){
                q.add(firstHalf.remove());
                q.add(q.remove());
            }
    }
    public static void Queue_revercel(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()){
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
////        Queue<Integer> q = new LinkedList<>(); // ArrayDqueue
//        Queue<Integer> q = new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q);

//        Queue1 q = new Queue1();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isempty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//        Queue2 q = new Queue2();
//        q.push(1);
//        q.push(2);
//        q.push(3);
//
//        while (!q.isempty()){
//            System.out.println(q.peek());
//            q.pop();
//        }

//        String str = "aabccxb";
//        priintNonrepting(str);

//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);       // value must be in even order
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        q.add(9);
//        q.add(10);
//        interLeave(q);
//        while (!q.isEmpty()){
//            System.out.println(q.remove());
//        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue_revercel(q);
        while (!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
