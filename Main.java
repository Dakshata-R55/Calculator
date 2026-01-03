package SuperCalculator;
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]){
        UserInt user1=new User();
        UserInt user2=new User();

        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to add or multiply");
        String typ=sc.nextLine();
        System.out.println("Enter the number 1");
        BigInteger n1 =new BigInteger(sc.nextLine());
        System.out.println("Enter the number 2");
        BigInteger n2 =new BigInteger(sc.nextLine());
        System.out.println("Enter the number 3");
        BigInteger n3 =new BigInteger(sc.nextLine());


user1.setCalTyp(typ);
user1.setNum1(n1.intValue());
user1.setNum2(n2.intValue());
user1.setNum2(n3.intValue());

        System.out.println("Do you want to add or multiply");
        String typ1=sc.nextLine();
        System.out.println("Enter the number 1");
        BigInteger n11 =new BigInteger(sc.nextLine());
        System.out.println("Enter the number 2");
        BigInteger n21 =new BigInteger(sc.nextLine());
        System.out.println("Enter the number 3");
        BigInteger n31 =new BigInteger(sc.nextLine());

        user2.setCalTyp(typ1);
        user2.setNum1(n11.intValue());
        user2.setNum2(n21.intValue());
        user2.setNum2(n31.intValue());



        if(user1.getCalTyp().equals("Add")){
            CommomInt add=new Adder("a234");
add.setUse(user1);
CommomInt[] cal=user1.getCal();
cal[0]=add;
System.out.println("overoloaded");
add.cal(2,3);
System.out.println("ID :" +cal[0].getCalId());
add.res();
        }
       else if(user1.getCalTyp().equals("Multiply")){
            CommomInt mul=new Multiplier("A4");
            mul.setUse(user1);
            CommomInt[] cal=user1.getCal();
            cal[1]=mul;
            System.out.println("ID :" +cal[1].getCalId());
            System.out.println(mul.getResult());
    }
        if(user2.getCalTyp().equals("Add")){
            CommomInt add=new Adder("34");
            add.setUse(user2);
            CommomInt[] cal=user2.getCal();
            cal[0]=add;
            System.out.println("overoloaded");
            add.cal(2,3,5);
            System.out.println("ID :" +cal[0].getCalId());
            System.out.println(add.getResult());
}
        else if(user2.getCalTyp().equals("Multiply")){
            CommomInt mul=new Multiplier("A4");
            mul.setUse(user2);
            CommomInt[] cal=user2.getCal();
            cal[1]=mul;
            System.out.println("ID :" +cal[1].getCalId());
            System.out.println(mul.getResult());

    }}}
