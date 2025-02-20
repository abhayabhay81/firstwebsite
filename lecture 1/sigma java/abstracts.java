//abstract class aanimal{
//    String  color;
//
//    aanimal(){
//        color = "brown";
//    }
//    void eat(){
//        System.out.println("animal eats");
//    }
//    abstract void walk();
//}
//
//class horse extends aanimal{
//    void changecolor(){
//        color = "black";
//    }
//    void walk(){
//        System.out.println("walks on 4 lesgs");
//    }
//}
//
//class chiken extends aanimal{
//    void changecolor(){
//        System.out.println("yello");
//    }
//    void walk(){
//        System.out.println("walks on 2 legs");
//    }

abstract class aanimal{
    String color;
    aanimal(){
        System.out.println("animal class connstructor coll");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class horse extends aanimal{
    horse(){
        System.out.println("horse class constuctor call");
    }
    void changecolor(){
        color = "black";
    }
    void walk(){
        System.out.println("walks on 4 lesgs");
    }
}
class mastang extends horse{
    mastang(){
        System.out.println("mastang constructor is called");
    }
}

class chiken extends aanimal{
    void changecolor(){
        System.out.println("yello");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class abstracts {
    public static void main(String[] args) {
//   horse h = new horse();
//   h.walk();
//   System.out.println(h.color);
//   chiken c = new chiken();
//   c.walk();

        mastang m = new mastang();

    }
}
