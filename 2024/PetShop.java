public class PetShop {
    public static void main(String[] args) {
        Dog puffy = new Dog("A", 1);
        Dog puffy2 = new Dog();
        puffy.setName("A");
        puffy2.setName("B");
        puffy.setAge(1);
        puffy2.setAge(12);
        puffy.bark();
        puffy.eat("bone");
        SH p3 = new SH();
        p3.setName("C");
        p3.setAge(4);
        p3.setEyeCol("blue");
        CW p4 = new CW();
        p4.setName("E");
        p4.setWeight(100);
        p3.bark();


        System.out.println(p3);

    }
}
