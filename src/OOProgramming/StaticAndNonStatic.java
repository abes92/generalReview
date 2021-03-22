package OOProgramming;

public class StaticAndNonStatic {
    String name="abes";// non static global variable
     static int age=28;// static global variable
    public static void main(String[] args) {
//to call a static method
        //direct call
        read();
        System.out.println(age);
        //calling by class name
        StaticAndNonStatic.read();
        System.out.println(StaticAndNonStatic.age);
        // to call anon static method or variable yu have to create an object
        StaticAndNonStatic obj=new StaticAndNonStatic();
        obj.sum();
        System.out.println(obj.name);
        fate();


    }
    public void sum(){
        System.out.println("wasbir lihokmi rabika ");
    }
    public static void  read(){
        System.out.println("fainaka bi ayounina ya ");
    }
    public static void fate(){
        System.out.println(" one day you will be a millionaire ");
    }
}
