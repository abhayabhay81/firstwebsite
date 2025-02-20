import java.util.ArrayList;

public class container_with_most_water {
    public static int storewater(ArrayList<Integer> heigth){
        int maxwater = 0;

        for (int i = 0; i < heigth.size() ; i++) {
            for (int j = i+1 ; j < heigth.size(); j++) {
                int ht = Math.min(heigth.get(i),heigth.get(j));
                int width = j-i;
                int currwater = ht*width;
                maxwater = Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }

    public static int  storewaters(ArrayList<Integer>height){
        int maxwwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp < rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            maxwwater = Math.max(maxwwater,currwater);

            if (height.get(lp) < height.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }
        return maxwwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(11);
        hight.add(31);
        hight.add(121);
        hight.add(81);
        hight.add(91);
        hight.add(21);
        hight.add(61);
        hight.add(41);

        System.out.println(storewater(hight));
        System.out.println(storewaters(hight));
    }
}
