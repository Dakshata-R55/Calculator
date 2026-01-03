package SuperCalculator;

public class Multiplier extends CommonFun{
    public Multiplier(String calId){
        this.setCalId(calId);
    }
    public Multiplier(){}
@Override
    public void res(){
    int res=use.getNum1()*use.getNum2()* use.getNum3();
    this.setResult(res);
    }

}
