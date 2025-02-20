public class friends_pairing_problem {
    public static int friendpairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

//        //single {
//        int fnm1 = friendpairing(n - 1);
//        int fnm2 = friendpairing(n - 2);
//        // pair
//        int pairwways = (n - 1) * fnm2;
//
//        int totways = fnm1 + pairwways;
//        return totways;
    //    }
       // or
        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendpairing(3));
    }
}
