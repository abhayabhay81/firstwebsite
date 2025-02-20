class stident{
    String name;
    int roll;
    static String schoolname;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return  this.name;
    }
}
public class static_keywords {
    public static void main(String[] args) {
         stident s1 = new stident();
         s1.schoolname = "abhay";

         stident s2 = new stident();
         System.out.println(s2.schoolname);

         stident s3 = new stident();
         System.out.println(s2.schoolname);
    }
}
