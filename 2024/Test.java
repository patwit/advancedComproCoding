import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //object / instance
        Student s1 = new Student();
        Student s2 = new Student();
        //s1.name = "Pattarawit";
        s1.setName("Pattarawit");
        s1.setId(1111111);
        //s1.id = 1111111;        // instance variable VS class variable

        //s2.name = "Superman";
        s2.setName("Superman");
        s2.setId(2222222);
        //s2.id = 2222222;
        s1.sayHello();
        s2.sayHello();


        Student s3 = new Student();
        Student s4 = new Student("MK");
        Student s3 = new Student("DK", 12345);

    }
}