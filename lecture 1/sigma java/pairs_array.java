public class pairs_array {
    public  static void pair_number(int number[]){
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19,20};
        pair_number(marks);
    }
}
