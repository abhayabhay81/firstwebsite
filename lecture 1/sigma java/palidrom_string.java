public class palidrom_string {
    public static boolean palidrom(String str){
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getshortestpart(String path){
        int x = 0,y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            }else {
                x++;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float)Math.sqrt(X+Y);
    }
    public static String substirng(String arr,int si,int ei){
        String strr = "";
        for (int i = si; i < ei; i++) {
            strr += arr.charAt(i);
        }
        return strr;
    }
    public static void main(String[] args) {
        String fruit[] = {"zpplegfgcv","banana","papa"};

        String larget = fruit[0];
        for (int i = 1; i < fruit.length; i++) {
            if (larget.compareTo(fruit[i]) < 0){
                larget = fruit[i];
            }
        }
        System.out.println(larget);

    }
}
