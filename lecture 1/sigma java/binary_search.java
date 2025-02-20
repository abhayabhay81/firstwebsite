public class binary_search {
    public static int bin_first_search(int numaber[],int key){
        int start = 0;
        int end = numaber.length-1;
        int mid = 0;
        for (int i = 0; i < numaber.length; i++) {
            while (start < end) {
                mid = (start + end) / 2;
                if (numaber[mid] == key) {
                    return mid;
                }
                if (numaber[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(bin_first_search(marks,18));



    }
}
