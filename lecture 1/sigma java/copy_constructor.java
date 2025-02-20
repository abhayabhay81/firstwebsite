class student{
    String name;
    int roll;
    String password;
    int marks[];


//     shallow copy constructor
//    student(student s1){
//        marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//    }

    // deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    student(){
        marks = new int[3];
        System.out.println("constructor is colled");
    }
    student(String name){
        marks = new int[3];
        this.name = name;
    }
    student(int roll){
        marks = new int[3];
        this.roll = roll;
    }


}
public class copy_constructor {
    public static void main(String[] args) {

        // lazy copy

        student s1 = new student();
        s1.name = "abahy";
        s1.roll = 667;
        s1.password = "kumar";


        s1.marks[0] = 87787;
        s1.marks[1] = 888;
        s1.marks[2] = 647;


        student s2 = new student(s1);
        s2.password = "nvjjvb";
        s1.marks[2] =  76565;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
// constructor chaning

    }
}
