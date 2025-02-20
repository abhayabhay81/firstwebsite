public class recursion_program {
//    public static void decressing_order(int n){
//        if (n==1){
//            System.out.println(n);
//            return ;
//        }
//        System.out.println(n);
//          decressing_order (n-1);
//    }

//    public static void increasind_order(int n){
//        if (n==1){
//            System.out.println(n);
//            return ;
//        }
//        increasind_order (n-1);
//        System.out.println(n);
//    }

//    public static int factorial(int n){
//        if (n==1)
//            return n;
//        else {
//            return n * factorial(n-1);
//        }
//    }

//    public static int sum(int n){
//        if (n==1)
//            return n;
//        else {
//            return n + sum(n-1);
//        }
//    }

//    public static int fact(int n){
//        if(n == 0){
//            return 1;
//        }
//        int fnm1 =  fact(n-1);
//        int fn = n * fact(n-1);
//        return fn;
//    }

//    public static int sum1(int n){
//        if(n == 1){
//            return 1;
//        }
//        int snm1 =  sum1(n-1);
//        int sn = n + snm1;
//        return sn;
//    }

//    public static int fibonacci(int n){
//        if(n==1){
//            return 0;
//        } else if (n==2) {
//            return 1;
//        }else {
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }

//    public static int FIBONACCI_sum(int n){
//        if (n==0 || n==1){
//            return n;
//        }
//        int fnm1 = FIBONACCI_sum(n-1);
//        int fnm2 = FIBONACCI_sum(n-2);
//        int fn = fnm1+fnm2;
//        return fn;
//    }
    public static boolean is_shorted(int n[] ,int i){
        if (i == n.length - 1) {
            return true;
        }
        if(n[i] > n[i+1]){
            return false;
        }
        return is_shorted(n,i+1);
    }

    public static int first_occorence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first_occorence(arr,key,i+1);
    }

    public static int last_occorence(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int isfound = last_occorence(arr,key,i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }

    public static int power(int m,int n){
        if(n==0){
            return 1;
        }
//        int xnml = power(m,n-1);
//        int xn = m*xnml;
//        return xn;
        return m*power(m,n-1);
    }

    public static int optimazerdpower(int a,int n){
        //first
//        if(n==0){
//            return 1;
//        }
//        int halfpowersq = optimazerdpower(a,n/2) * optimazerdpower(a,n/2);
//        if (n %2 != 0){
//            halfpowersq = a*halfpowersq;
//        }
//        return halfpowersq;

        // second
        if(n==0){
            return 1;
        }
        int halfpower = optimazerdpower(a,n/2);
        int halfpowersq = halfpower*halfpower;
        if (n %2 != 0){
            halfpowersq = a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(is_shorted(a,0));
        System.out.println(first_occorence(a,5,0));
        System.out.println(last_occorence(a,5,0));
        System.out.println(power(2,10));
        System.out.println(optimazerdpower(2,10));
    }
}
