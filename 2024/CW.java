import java.util.Comparator;

public class CW extends Dog implements Movable, Barkable, Pooable{

    private double weight;

    public CW(){
        super();
        super.CW();
        this.weight = 0;
    }

    public CW(String name, int age, double weight){
       super(name, age);
        this.weight = weight;
        super.getAge();
    }

    public void move(){
        System.out.println("slowing on 4 legs");
    }

    

    public CW(double weight){
        super();
        this.weight = weight;
    }

   


    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double compare(CW d1){
        return this.getWeight() - d1.getWeight();
    }

    
}
