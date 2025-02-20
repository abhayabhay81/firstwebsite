public class prefix_problem {
    static class Node{
        Node[] childern = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for (int i = 0; i < childern.length; i++) {
                childern[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }else {
                curr.childern[idx].freq++;
            }
            curr = curr.childern[idx];
        }
    }

    // problem 1
    public static void findprefix(Node root,String ans){
        if (root == null){
            return;
        }
        if (root.freq == 1){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < root.childern.length; i++) {
            if (root.childern[i] != null){
                findprefix(root.childern[i],ans+(char)(i+'a'));
            }
        }
    }

    //problem 2
    public static boolean startswith_problem(String prefix){
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if (curr.childern[idx] == null){
                return false;
            }
            curr = curr.childern[idx];
        }
        return true;
    }

    // problem 3
    public static int countNode(Node root){
        if (root == null){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null){
                count += countNode(root.childern[i]);
            }
        }
        return count+1;
    }
//    problem 4
    public static String ans ="";
    public static void longest_string(Node root,StringBuilder temp){
        if (root == null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null && root.childern[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if (temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longest_string(root.childern[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
//        problem 1

//        String arr[] = {"zebra","dog","duck","dove"};
//        for (int i = 0; i < arr.length; i++) {
//            insert(arr[i]);
//        }
//        root.freq = -1;
//        findprefix(root," ");

//        problem 2

//        String words[] = {"apple","app","mango","man","woman"};
//        String prefix1 = "app";
//        String prefix2 = "moon";
//
//        for (int i = 0; i < words.length; i++) {
//            insert(words[i]);
//        }
//        System.out.println(startswith_problem(prefix1));
//        System.out.println(startswith_problem(prefix2));


//        problem 3

//        String str = "ababa";
//        for (int i = 0; i < str.length(); i++) {
//            String suffix = str.substring(i);
//            insert(suffix);
//        }
//        System.out.println(countNode(root));

//        problem 4

        String words[] = {"a","banana","app","appl","ap","apply","apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longest_string(root,new StringBuilder(""));
        System.out.println(ans);

        // ans = apple

    }
}
