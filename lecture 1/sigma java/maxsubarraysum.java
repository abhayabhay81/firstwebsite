public class maxsubarraysum {
    public static void max_sub_array_sum(int number[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += number[k];
                }
                System.out.println(currentsum);
                if(maxsum < currentsum){
                    maxsum = currentsum;
                }
            }
        }
        System.out.println("max sub array sum is "+maxsum);
    }

    public static void main(String[] args) {
         int list[] = {2,4,6,8,10};
         max_sub_array_sum(list);
    }
}
