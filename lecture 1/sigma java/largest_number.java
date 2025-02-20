public class largest_number {
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(largest < number[i]){
                largest= number[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int number[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("largest value of array is "+getlargest(marks));
        System.out.println("smallest value of array is "+getsmallest(marks));

    }
}
