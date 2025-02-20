import java.util.TreeMap;
//use in redblack tree
public class tree_map {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("india",10000);
        tm.put("indi",1000);
        tm.put("ind",100);
        tm.put("in",10);

        System.out.println(tm);
    }
}
