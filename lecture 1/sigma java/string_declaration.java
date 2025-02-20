import java.util.Scanner;

// String are inmutable
public class string_declaration {
    public static void printlaters(String sr){
        for (int i = 0; i < sr.length(); i++) {
            System.out.println(sr.charAt(i));
        }
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c','d'};
//        String str1 = "abhay";
//        String str2 = new String("abjnjnvvjnvjn");
//
//        Scanner sc = new Scanner(System.in);
//        String na = sc.nextLine();
//        System.out.print(na);

        String str = "my nam is bhxgh";
        printlaters(str);
    }
}
