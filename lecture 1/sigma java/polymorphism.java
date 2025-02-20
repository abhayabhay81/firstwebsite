// compile type polymaphism
class calculater{
    int sum (int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
}
// run time polymarphism
class animmal{
    void eat(){
        System.out.print("eat");
    }
}
class deer extends animal{
    void eat(){
        System.out.print("grass");
    }
}
public class polymorphism {
    public static void main(String[] args) {
//       calculater ca = new calculater();
//       System.out.println(ca.sum(1,2));
//       System.out.println(ca.sum((float)1.5,(float)2.4));
//       System.out.println(ca.sum(1,2,8));

        deer d = new deer();
        d.eat();
    }
}
