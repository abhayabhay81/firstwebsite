public class qwick_short {
    public static void quickshort(int arr[],int si,int ei){
        if (si >= ei){
            return;
        }
        int pidx = partionindex(arr,si,ei);
        quickshort(arr,si,pidx-1);
        quickshort(arr,pidx+1,ei);
    }
    public static int partionindex(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {44,22,77,11,99,33,56,100};
        quickshort(arr,0,arr.length-1);
        printarr(arr);

    }
}
