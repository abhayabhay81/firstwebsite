// only 2 jumps are aloud (1,2)
import java.util.Arrays;

public class climbing_stayers_DP_problem {
    public static int countways(int n){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }
        return countways(n-1)+countways(n-2);
    }

    // memoigetion
    public static int countwaysmemo2(int n,int ways[]){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }
        if (ways[n] != -1){
            return ways[n];
        }
        ways[n] = countwaysmemo2(n-1,ways)+countwaysmemo2(n-2,ways);
        return ways[n];
    }
    public static int countwaystab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n ; i++) {
            if (i == 1){
                dp[i] = dp[i-1]+0;
            }else {
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countwaysmemo2(n,ways));
//        System.out.println(countways(n));
//        System.out.println(countwaystab(n));

    }
}
