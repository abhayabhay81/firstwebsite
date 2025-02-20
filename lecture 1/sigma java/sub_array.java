public class sub_array {
    public static void sub_array_number(int number[]){
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                ts++;
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array is "+ts);
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19,20};
        sub_array_number(marks);
    }
}
