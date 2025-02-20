import java.util.HashMap;
import java.util.Set;

public class hash_map {
    public static void main(String[] args) {
//        HashMap<String,Integer> hm = new HashMap<>();
//
//        hm.put("india",198);
//        hm.put("abhay",18);
//        hm.put("pankaj",8);
//        System.out.println(hm);
//
//        int papulation = hm.get("india");
//        System.out.println(papulation);
//
//        System.out.println(hm.containsKey("india"));
//
//        System.out.println(hm.remove("india"));
//
//        System.out.println(hm);
//
//        System.out.println(hm.size());
//
//        System.out.println(hm.isEmpty());
//
//        hm.clear();
//        System.out.println(hm.isEmpty());

        // iterative method

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india",100);
        hm.put("usa",10);
        hm.put("china",50);
        hm.put("indonesia",590);
        hm.put("nepal",59);

        //hm.entryset
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k+",value = "+hm.get(k));
        }


    }
}
