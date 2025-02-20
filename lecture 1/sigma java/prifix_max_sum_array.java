public class prifix_max_sum_array {
    public static void max_sub_array_sum(int number[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0]; // calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;

                currentsum = start  == 0 ? prefix[end] : prefix[end] -prefix[start-1];

                if(maxsum < currentsum){
                    maxsum = currentsum;
                }

            }
        }
        System.out.println("max sum ="+maxsum);
    }

    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : "+ms);
    }
    public static void main(String[] args) {
        int list[] = {1,-1,6,-1,3};
        int list1[] = {-2,-1,4,-1,-2,1,5,-3};
        kadanes(list);
       // max_sub_array_sum(list);
    }
}
