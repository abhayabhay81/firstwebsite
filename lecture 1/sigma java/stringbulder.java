public class stringbulder {
    public static String touperrcase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' &&  i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        String newstr = "";

        for (int i = 0; i < str.length() ; i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        for (char i = 'a'; i <= 'z' ; i++) {
//            sb.append(i);
//        }
//        System.out.println(sb);

//        String str = "hi,i am abhhay";
//        System.out.println(touperrcase(str));

        String str = "aaabbbbhhgjllleee";
        System.out.println(compress(str));
    }
}
