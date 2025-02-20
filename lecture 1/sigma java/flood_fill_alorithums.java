public class flood_fill_alorithums {
    public void helper(int[][] image,int sr,int sc,int color,boolean vis[][],int orgcol){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcol){
            return ;
        }
        // left
        helper(image,sr,sc-1,color,vis,orgcol);
        //right
        helper(image,sr,sc+1,color,vis,orgcol);
        //up
        helper(image,sr-1,sc,color,vis,orgcol);
        //down
        helper(image,sr+1,sc,color,vis,orgcol);
    }
    public int[][] flooffill(int [][] image,int sr,int sc,int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {

    }
}
