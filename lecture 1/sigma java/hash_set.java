import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        set.add(4);
//        set.add(1);
//        set.add(5);
//        System.out.println(set);

        HashSet<String> set = new HashSet<>();
        set.add("abhaya");
        set.add("noida");
        set.add("mumbai");
        set.add("akumar");
        set.add("gurugram");

//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        for (String city : set){
            System.out.println(city);
        }
    }
}
