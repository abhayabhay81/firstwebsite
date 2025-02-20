import java.util.Arrays;
import java.util.Collections;

public class greedy_Chocola {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costvar[] = {2,1,3,1,4};
        Integer costHar[] = {4,1,2};

        Arrays.sort(costvar, Collections.reverseOrder());
        Arrays.sort(costHar, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHar.length && v < costvar.length){
            if (costvar[v] <= costHar[h]){
                cost += (costHar[h]*vp);
                hp++;
                h++;
            }else {
                cost += (costvar[v]*hp);
                vp++;
                v++;
            }
        }
        while (h < costHar.length){
            cost += (costHar[h]*vp);
            hp++;
            h++;
        }
        while (v < costvar.length){
            cost += (costvar[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = "+cost);
        //spoj
    }
}
