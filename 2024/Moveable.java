public interface Moveable {
    int age = 10;
    static void move(){
        System.out.println("move");
    }

    void walk();
    void run(){
        System.out.println("Hey");
    }
}
