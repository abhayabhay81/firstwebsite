import java.util.HashMap;
import java.util.LinkedHashMap;

public class linked_hash_map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> llh = new LinkedHashMap<>();
        llh.put("india",12);
        llh.put("indi",2);
        llh.put("ind",92);
        llh.put("in",9);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india",12);
        hm.put("indi",2);
        hm.put("ind",92);
        hm.put("in",9);

        System.out.println(llh);
        System.out.println(hm);
    }
}
