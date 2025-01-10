public abstract class Dog {

    private String name;
    private int age;

    public Dog() {
        this.name = "xxx";
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name){
        this.name = name;
        this.age = 1;
    }

    public Dog(int age){
        this.name = "unknown";
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + getName() + "'" +
            ", age='" + getAge() + "'";
    }

}
