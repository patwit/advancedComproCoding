public class Exception1 {
    public static void main(String[] args)  {
        try {
            f1();
        } catch (MyException e){
            System.err.println(e.toString());
        }
        
    }

    static void f1() throws MyException {
        throw new MyException("Test Error");
    }
}
