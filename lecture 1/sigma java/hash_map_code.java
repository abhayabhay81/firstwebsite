import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class hash_map_code {
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashfunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInll(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldbucket.length; i++) {
                LinkedList<Node> ll = oldbucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
            int bi = hashfunction(key);
            int di = searchInll(key,bi);

            if (di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else {
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double)n/N;
            if (lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashfunction(key);
            int di = searchInll(key,bi);

            if (di != -1){
               return true;
            }else {
                return false;
            }
        }
        public V get(K key){
            int bi = hashfunction(key);
            int di = searchInll(key,bi);

            if (di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else {
                return null;
            }
        }
        public V remove(K key){
            int bi = hashfunction(key);
            int di = searchInll(key,bi);

            if (di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else {
                return null;
            }
        }
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length ; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isempty(){
            return n == 0;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india",87);
        hm.put("usa",8);
        hm.put("nepal",80);
        hm.put("bhutan",90);

        ArrayList<String> keys =  hm.keyset();
        for (String key : keys){
            System.out.println(key);
        }
        System.out.println(hm.get("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm.get("india"));
    }
}
