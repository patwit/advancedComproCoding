import java.util.ArrayList;
import java.util.Collections;

public class PetShop {
    final int MAX = 100;
    public static void main(String[] args) {
        CW c1 = new CW("A", 0, 0.1);
        CW c2 = new CW("B", 1, 1.2);
        CW c3 = new CW("C", 2, 0.8);
        if(CompareWeight.compare(c1, c2) > 0)
            System.out.println("O1");
    }
}
