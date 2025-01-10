import java.util.Comparator;

public class CompareWeight implements Comparator<CW>{
    @Override
    public static int compare(CW o1, CW o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        } else if (o1.getWeight() < o2.getWeight()){
            return -1;
        } else {
            return 0;
        }
    }
}
