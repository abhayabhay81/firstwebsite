public class selection_short {
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
           int item = i;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[item] < arr[j]) {
                    item = j;
                }
            }
            int temp = arr[item];
            arr[item] = arr[i];
            arr[i] = temp;

        }
    }
//public static void selection(int arr[]){
//        for (int i = 0; i < arr.length-1; i++) {
//           int item = i;
//            for (int j = i+1 ; j < arr.length; j++) {
//                if (arr[item] > arr[j]) {
//                    item = j;
//                }
//            }
//            int temp = arr[item];
//            arr[item] = arr[i];
//            arr[i] = temp;
//
//        }
//    }
    public static void main(String[] args) {
        int arr[] = {12,3,7,76,887,23};
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
