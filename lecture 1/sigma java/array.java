import java.util.Scanner;

public class array {
    public static void update(int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {

//          int marks[] = new int[3];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            marks[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(marks[i]);
//        }
//          System.out.println(marks.length);
        int marks[] = {11,12,13,14};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


    }
}
