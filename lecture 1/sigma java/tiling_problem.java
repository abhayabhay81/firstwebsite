import javax.swing.plaf.PanelUI;

public class tiling_problem {
    public static int tillingproblem(int n){
        if (n == 0 || n==1){
            return 1;
        }
//        // vertical choice {
//        int fnm1 = tillingproblem(n-1);
//        // horizontal choice
//        int fnm2 = tillingproblem(n-2);
//
//        int totways = fnm1+fnm2;
//        return totways;

        return tillingproblem(n-1)+tillingproblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tillingproblem(3));
    }
}

// problem {2 X n}
