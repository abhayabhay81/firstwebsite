class pen {
    String color;
    pen(){
        System.out.println("this is amezing text");
    }
    int tip;
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
public class oop {
    public static void main(String[] args) {
         pen p = new pen();
         p.setcolor("abhay");
         System.out.println(p.color);
         p.settip(53);
         System.out.println(p.tip);

    }
}
