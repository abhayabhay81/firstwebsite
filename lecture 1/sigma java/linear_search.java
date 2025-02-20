public class linear_search {
    public static int linear(int number[],int key){
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {11,12,13,14,15,16,17,18,19};
        int key = 18;
        int index = linear(marks,key);
        if (index == -1){
            System.out.println("not found");
        }else {
            System.out.println("key is found " + index);
        }

    }
}
