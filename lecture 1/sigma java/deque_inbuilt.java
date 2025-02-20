import java.util.Deque;
import java.util.LinkedList;

public class deque_inbuilt {
    public static void main(String[] args) {
        Deque d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);
    }
}
