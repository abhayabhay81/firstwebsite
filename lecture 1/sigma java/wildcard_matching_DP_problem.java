public class wildcard_matching_DP_problem {
    public static boolean ismatch(String s,String p){
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];

        //ititalisation
        dp[0][0] = true;
        //pattern
        for (int i = 1; i < n+1; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i < m+1; i++) {
            if (p.charAt(i-1) == '*'){
                dp[0][i] = dp[0][i-1];
            }
        }
        //bottom up
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "a******ba******ab";
        System.out.println(ismatch(s,p));
    }
}
