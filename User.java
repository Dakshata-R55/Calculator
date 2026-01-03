package SuperCalculator;

public class User implements UserInt {
    private int num1;
    private int num2;
    private int num3;
    private String calTyp;
   private CommomInt[] cal=new CommomInt[2];


    public User(int num1,int n2,int n3,String calTyp){
        this.setNum1(num1);
        this.setNum2(n2);
        this.setNum3(n3);
        this.setCalTyp(calTyp);
    }

    public User(){}
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getCalTyp() {
        return calTyp;
    }

    public void setCalTyp(String calTyp) {
        this.calTyp = calTyp;
    }

    public CommomInt[] getCal() {
        return cal;
    }

    public void setCal(CommomInt[] cal) {
        this.cal = cal;
    }
}
