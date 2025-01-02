import java.util.Scanner;

public class StringTest {

    static String answer;

    public static void main(String[] args) {    
        int[] x = new int[3];
        x[0] = 1;
        System.err.println(x[0]);
        hello(x);
        System.out.println(x[0]);
    }

    public static void hello(int[] x){
        x[0]=1111;
        System.out.println(x[0]);
    }


    
}
