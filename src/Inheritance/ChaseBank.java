package Inheritance;

public class ChaseBank implements USBank,CanadaBank{
    public void credit(){
        System.out.println(" chase bank credit");
    }
    public void debit(){
        System.out.println(" chase bank credit");
    }
    public void studentsLoan(){
        System.out.println(" chase bank student loan");
    }
    public void transferMoney(){
        System.out.println(" chase bank transfer money");
    }

}
