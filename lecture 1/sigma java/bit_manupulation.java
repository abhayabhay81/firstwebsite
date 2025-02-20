public class bit_manupulation {
    public static void oddoreven(int n){
        int bitmarks = 1;
        if(((n & bitmarks) == 0)){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static int getithbit(int n,int i){
        int bitmask = 1 << i;
        if(((n & bitmask) == 0)){
            return 0;
        }else {
            return 1;
        }
    }
    public static int setitgbit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n,int i,int newbit){
//        if(ithbit == 0){
//            return clearithbit(n,i);
//        }else {
//            return setitgbit(n,i);
//        }
        n = clearithbit(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;

    }
    public static int clearithbits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int clearrangeofbits(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1 << i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }
    public static boolean power_of_number_or_not(int n){
        // check  if a nummber is a power of 2 or not
        return (n&(n-1)) == 0;
    }
    public static int count_set_bits(int n){
        int count = 0;
        while (n>0){
            if((n & 1)!= 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fast_exponentiation(int n,int a){
        int ans = 1;
        while (n > 0){
            if((n & 1) != 0){
                ans =  ans * a;
            }
            a = a*a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
      System.out.println(getithbit(10,2));
      System.out.println(setitgbit(10,2));
      System.out.println(clearithbit(10,1));
      System.out.println(updateithbit(10,2,1));
      System.out.println(clearithbits(15,2));
      System.out.println(clearrangeofbits(10,2,4));
      System.out.println(power_of_number_or_not(10));
      System.out.println(count_set_bits(10));
      System.out.println(fast_exponentiation(5,3));
      // modular exponentiation
    }
}

