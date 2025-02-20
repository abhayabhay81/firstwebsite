public class word_break_problem {
    static class Node{
        trie_data_structure.Node children[] = new trie_data_structure.Node[26];
        boolean eow = false;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static trie_data_structure.Node root = new trie_data_structure.Node();
    public static void insert(String word){
        trie_data_structure.Node curr = root;
        for (int level = 0;level < word.length();level++){
            int idx = word.charAt(level)-'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new trie_data_structure.Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        trie_data_structure.Node curr = root;
        for (int level = 0;level < key.length();level++){
            int idx = key.charAt(level)-'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordbreake(String key){
        if (key.length() == 0){
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0,i)) && wordbreake(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i","like","sam","samsung","mobile","ice"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordbreake(key));
    }
}
