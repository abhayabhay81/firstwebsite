public class function {
    public static int factorial(int n){
        int i = 1;
        for (int j = 1; j <= n ; j++) {
            i = i*j;
        }
        return i;
    }
    public static int binomial(int n,int r){
        int bin = factorial(n)/factorial(r)*(factorial(n-r));
        return bin;
    }
    public  static int sum (int a,int b){
        return a+b;
    }
    public  static int sum (int a,int b,int c){
        return a+b+c;
    }
    public  static int mulipli (int a,int b){
        return a*b;
    }
//    public static boolean prime(int n){
//        boolean isprime = true;
//        for (int i = 2; i <= n-1 ; i++) {
//            if(n%i == 0){
//                isprime = false;
//                break;
//            }
//        }
//        return isprime;
//    }
//
//    public static boolean prime(int n){
//        boolean isprime = true;
//        for (int i = 2; i <= n-1 ; i++) {
//            if(n%i == 0){
//                isprime = false;
//                return isprime;
//            }
//        }
//        return true;
//    }

//    public static boolean prime(int n){
//        boolean isprime = true;
//        if (n==2){
//            return  true;
//        }
//        for (int i = 2; i <= n-1 ; i++) {
//            if(n%i == 0){
//                isprime = false;
//                return isprime;
//            }
//        }
//        return true;
//    }
    
    public static boolean prime(int n){
        if (n==2){
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primerange(int n){
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public  static void bin_decimal(int n){
        int my = n;
        int pow = 0;
        int decnum = 0;
        while (n > 0){
            int last = n%10;
            decnum = decnum  + (last * (int)Math.pow(2,pow));

            pow++;
            n = n/10;
        }
        System.out.println("decimal of "+my +" = " + decnum);
    }
    public static void decimal_bin(int n){
        int dec = n;
        int bin = 0;
        int pow = 0;
        int rem ;
        while (n>0){
            rem = n%2;
            bin = bin + (rem * (int)Math.pow(10,pow));

            pow++;
            n= n/2;
        }
        System.out.println("decimal of "+dec +" = " + bin);

    }
    public static void main(String[] args) {

//         System.out.println(binomial(5,4));
//         System.out.println(sum(2,4));
//         System.out.println(sum(4,3,5));
//         System.out.println(mulipli(4,6));
//         System.out.println(prime(20));
//         primerange(20);

        bin_decimal(1011);
        decimal_bin(11);




    }
}
