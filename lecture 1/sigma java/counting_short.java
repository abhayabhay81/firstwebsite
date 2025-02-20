public class counting_short {
//    public static void countingshort(int arr[]){
//        int larger = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            larger = Math.max(larger,arr[i]);
//        }
//        int count[] = new int[larger+1];
//        for (int i = 0; i < arr.length; i++) {
//            count[arr[i]]++;
//        }
//        int j = 0;
//        for (int i = 0; i < count.length; i++) {
//            while (count[i] > 0){
//                arr[j] = i;
//                j++;
//                count[i]--;
//
//            }
//
//        }
//   }
    public static void main(String[] args) {
       int arr[] = {12,3,7,76,887,12,7,23};
//        countingshort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int larger = Integer.MIN_VALUE;
        int largerr = Integer.MAX_VALUE;
           System.out.println(larger);
           System.out.println(largerr);
        for (int i = 0; i < arr.length; i++) {
            larger = Math.max(larger,arr[i]);
        }
           System.out.println(larger);

    }
}
