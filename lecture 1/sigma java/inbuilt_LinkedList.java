import java.util.LinkedList;

public class inbuilt_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
    }
}
