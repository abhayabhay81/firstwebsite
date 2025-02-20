import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class insertion_short {
    // decending order
    public static void insertionshort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    // asending order
//    public static void insertionshort(int arr[]){
//        for (int i = 1; i < arr.length; i++) {
//            int curr = arr[i];
//            int prev = i-1;
//            while (prev >= 0 && arr[prev] > curr) {
//                arr[prev + 1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = curr;
//        }
//    }
    public static void main(String[] args) {
        //int arr[] = {12,3,7,76,887,23};
        Integer arrr[] = {12,3,7,76,887,23};
//        insertionshort(arr);
        //Arrays.sort(arr);
        //Arrays.sort(arr,2,4);
       // Arrays.sort(arrr, Comparator.reverseOrder());
        Arrays.sort(arrr,2,4, Comparator.reverseOrder());
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }


    }
}
