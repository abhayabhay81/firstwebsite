public class grodways {
    public static int gridway(int i,int j,int n,int m){
        if (i == n-1 && j == m-1){
            return 1;
        } else if (i == n || j == n){
            return 0;
        }
        int w1 = gridway(i+1,j,n,m);
        int w2 = gridway(i,j+1,n,m);
        return w1+w2;
    }
    //time comlexity (2 power n+m)
    public static void main(String[] args) {
        int n = 2,m = 2;
        System.out.println(gridway(0,0,n,m));
    }
}
//formula {(n-1)(m-1)!/(n-1)!(m-1)!}

