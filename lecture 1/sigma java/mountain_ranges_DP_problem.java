public class mountain_ranges_DP_problem {
    public static int mountainranges(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] =  1;

        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outsiide = dp[i-j-1];
                dp[i] += inside*outsiide;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainranges(n));
    }
}
