 class animals{
        String color;
    animals(){
        System.out.println("animal constructor coll");
    }
 }
 class horses extends animals{
    horses(){
        super.color = "abhay";
        System.out.println("horse constructor coll");
    }
 }
public class super_keyword {
    public static void main(String[] args) {
      horses h = new horses();
      System.out.println(h.color);

    }
}
