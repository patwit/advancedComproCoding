public class SH extends Dog{ // inherite from Dog
    private String eyeCol;

    public String getEyeCol() {
        return this.eyeCol;
    }

    public void setEyeCol(String eyeCol) {
        this.eyeCol = eyeCol;
    }

    @Override
    void bark(){
        System.out.println("Wooff");
    }
    
    public String toString(){
        return super.toString()+
        " eye color = " + getEyeCol();
    }
}
