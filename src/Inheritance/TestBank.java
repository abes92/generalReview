package Inheritance;

public class TestBank {// we are achieving multiple inheritance

    public static void main(String[] args) {
        /*if a class is impementing any interface then it is mandatory to define /override
        all the methods of an interface
        */
        System.out.println(USBank.min);
//static polymorphism
        ChaseBank ch=new ChaseBank();
        ch.credit();
        ch.debit();
        ch.studentsLoan();
        ch.transferMoney();
    System.out.println("**************");
        USBank us=new ChaseBank();
        us.credit();
        us.debit();
        System.out.println("**************");
        CanadaBank ca=new ChaseBank();
        ca.transferMoney();






    }
}
