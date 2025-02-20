import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedy_activity_selection {
    public static void main(String[] args) {
        //already shorted
//        int start[] = {1,3,0,5,8,5};
//        int end[] = {2,4,6,7,9,9};
//        //end basis
//        int maxact = 0;
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        // 1st activity
//        maxact = 1;
//        ans.add(0);
//        int lastend = end[0];
//        for (int i = 0; i < end.length; i++) {
//            if (start[i] >= lastend){
//                //activity selection
//                maxact++;
//                ans.add(i);
//                lastend = end[i];
//            }
//        }
//        System.out.println("max activity = "+maxact);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.print("A"+ans.get(i)+" ");
//        }
//        System.out.println();

        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        //sorting
        int activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        //end basis
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxact = 1;
        ans.add(activity[0][0]);
        int lastend = activity[0][2];
        for (int i = 0; i < end.length; i++) {
            if (activity[i][1] >= lastend){
                //activity selection
                maxact++;
                ans.add(activity[i][0]);
                lastend = activity[i][2];
            }
        }
        System.out.println("max activity = "+maxact);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
