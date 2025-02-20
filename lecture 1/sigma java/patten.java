import java.util.Scanner;

public class patten {
//    public static void rectangle(int totrow,int totcol){
//        for (int i = 1; i <= totrow; i++) {
//            for (int j = 1; j <= totcol; j++) {
//                if (i ==1 || i == totrow || j == 1 || j == totcol){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//    public  static  void invertedroteted(int n){
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//public  static void halfpramidnumber(int n){
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n-i+1; j++) {
//            System.out.print(j+" ");
//        }
//        System.out.println();
//    }
//}
//    public static void floyedtrigle(int n){
//        int counter = 1;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(counter+" ");
//                counter++;
//            }
//            System.out.println();
//        }
//
//    }
//    public static void trigle(int n){
//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= i; j++) {
//                if((i+j)%2 == 0) {
//                    System.out.print("1");
//                }else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//
//    }

//    public static void butterfly_pattern(int n){
//        for (int i = 1 ; i <= n ; i++) {
//
//            for (int j = 1 ;  j <= i ; j++) {
//                 System.out.print("*");
//            }
//            for (int j= 1; j <= 2*(n-i) ; j++ ){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n ; i >= 1 ; i--) {
//
//            for (int j = 1 ;  j <= i ; j++) {
//                 System.out.print("*");
//            }
//            for (int j= 1; j <= 2*(n-i) ; j++ ){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void solid_rhombus(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void hollow_rhombus(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n ; j++) {
//                if (i ==1 || i == n || j == 1 || j == n){
//                   System.out.print("*");
//                }else {
//                   System.out.print(" ");
//               }
//            }
//            System.out.println();
//        }
//    }

    public static void dimond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//           System.out.print("\n");
//        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        //int b = sc.nextInt();
        //rectangle(a,b);
        //invertedroteted(a);
        //halfpramidnumber(a);
        //floyedtrigle(a);
        //trigle(5);
        //butterfly_pattern(5);
        // solid_rhombus(5);
       // hollow_rhombus(5);
        dimond(4);
    }
}
