import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedy_imdean_coine {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int countCoins = 0;
        int amout = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amout){
                while (coins[i] <= amout){
                    countCoins++;
                    ans.add(coins[i]);
                    amout -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = "+countCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
