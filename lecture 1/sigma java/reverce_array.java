public class reverce_array {
    public static void reverce(int number[]){
        int first = 0 , last = number.length-1;
        while (first < last){
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19,20};
        reverce(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
