package SuperCalculator;

public abstract class CommonFun implements CommomInt {
    private String calId;
    private int result;
public UserInt use;




    public String getCalId() {
        return calId;
    }

    public void setCalId(String calId) {
        this.calId = calId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public UserInt getUse() {
        return use;
    }

    public void setUse(UserInt use) {
        this.use = use;
    }
    public void res() {
        int res=use.getNum1() + use.getNum2() + use.getNum3();
        this.setResult(res);
    }
    public int cal(int a,int b){
        return a+ b;
    }
    public int cal(int a,int b,int c){
        return a+ b+c;
   }
}
