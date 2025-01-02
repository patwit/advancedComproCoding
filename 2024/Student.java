class Student{
    //attributes
    private String name;
    private int id;

    //Constructor
    public Student(){
        name = "unknown";
        id = 999999;
    }

    public Student(String name){
        this.name = name;
        id = 999999;
    }

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    static String faculty = "Faculty of Engineering";
    //private, protected,    , public
    // instance variable VS class variable

    //methods
    void sayHello(){
        System.out.println("Hello. I'm " + name + "id : " + id + "\n");
    }

    public String getName(){
        return name;
    }


}

