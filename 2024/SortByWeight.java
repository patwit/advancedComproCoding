import java.util.Comparator;

public class SortByWeight implements Comparator<CW>{

    @Override
    public int compare(CW o1, CW o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        } else if(o1.getWeight() == o2.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
