class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breth(){
        System.out.println("breathing");
    }
}
  // single level
//class  fish extends animal{
//    int fins;
//    void swim(){
//        System.out.println("swim the fish");
//    }
//}

// mulliple inheritance
//
//class mamals extends animal{
//    void walks(){
//        System.out.println("my name is mamas");
//    }
//}
//class dog extends mamals{
//    void mams(){
//        System.out.println("i ama dog");
//    }
//}

// hierarchial inheritance
class mamals extends animal{
    void walks(){
        System.out.println("my name is mamas");
    }
}
class dog extends animal{
    void mams(){
        System.out.println("i ama dog");
    }
}
// hybrid innheritance




public class inheritence {
    public static void main(String[] args) {
//        fish f1 = new fish();
//        f1.breth();
//        f1.breth();
//        f1.swim();


    }
}
