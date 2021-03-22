package OOProgramming;

public class OOP {
    int horse;
    int dog;
    int bmw;
    // main method is a starting piont of an execution
    public static void main(String[] args) {
        OOP a=new OOP();
        OOP b=new OOP();
        OOP C=new OOP();

        a.horse=2;
        a.bmw=2;
        a.dog=1;

        b.dog=1;
        b.horse=3;
        b.bmw=4;

        C.dog=2;
        C.horse=1;
        C.bmw=5;


        a=b;
        b=C;
        C=a;


        a.horse=5;
        System.out.println(a.horse);
        C.horse=12;
        System.out.println(a.horse);
        OOP obj=new OOP();
        obj.test();
        System.out.println(obj.addition());
        System.out.println(obj.book());
        System.out.println(obj.division(3.0,2.0));

    } //void method means is not returning anything
    public void test(){
        System.out.println("i was testing you");
    }
    //type of int method is returning integer number
    public int addition(){
        int a=12;
        int b=34;
        int c=a+b;
        return c;
    }
// is returning string
    public String book(){
    String t="abes";
    String a="ld";
    String m=t+a;
     return m ;
    }
    //is returning double number
    public double division(double x,double b){
        double ta=x/b;
        return ta;
    }

}
