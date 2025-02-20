import java.util.Arrays;

public class greedy_Min_Absolute_diffrence_pairs {
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        // o(n*log n)
        int minBiff = 0;
        for (int i = 0; i < A.length; i++) {
            minBiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min abosolute doffrence of pairs = "+minBiff);
    }
}
