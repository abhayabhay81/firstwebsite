import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp = list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list  =  new ArrayList<>();
//        ArrayList<String> list1  =  new ArrayList<>();
//        ArrayList<Boolean> list2  =  new ArrayList<>();
//
//        list.add(12);
//        list.add(24);
//        list.add(39);
//        list.add(14);
//        list.add(5);

//        System.out.println(list);
//        int elemrnt = list.get(3);
//        System.out.println(elemrnt);
//        System.out.println(list.size());
//
//        for (int i = 0; i < list.size(); i++) {
//        System.out.println(list.get(i));
//        }

        // reverce print
//        for (int i = list.size()-1 ; i >= 0; i--) {
//        System.out.println(list.get(i));
//        }

        // find maximum

//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++)
////            if (max < list.get(i)) {
////                max = list.get(i);
////            }
//            max = Math.max(max,list.get(i));
//        System.out.println(max);

//        // swap number
//        int ind1 = 1,ind2 = 3;
//        System.out.println(list);
//        swap(list,ind1,ind2);
//        System.out.println(list);

//     //   sorting an arraylist
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println(list);

//        2-d Arraylist
//       ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//
//       ArrayList<Integer> list = new ArrayList<>();
//       list.add(1);list.add(2);
//       mainlist.add(list);
//
//       ArrayList<Integer> list1 = new ArrayList<>();
//       list1.add(1);list1.add(3);
//       mainlist.add(list1);
//
//       ArrayList<Integer> list2 = new ArrayList<>();
//       list2.add(1);list2.add(4);
//       mainlist.add(list2);
//
//        for (int i = 0; i < mainlist.size(); i++) {
//            ArrayList<Integer> currlist = mainlist.get(i);
//            for (int j = 0; j < currlist.size(); j++) {
//                System.out.print(currlist.get(j)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(mainlist);

//        3-d arraylist
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i <= 5 ; i++) {
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainlist);
    }
}