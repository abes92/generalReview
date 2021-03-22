package OOProgramming;



public class GlobalVSLocal {

    // Global variable are existing inside the class
    // if you want to access those variables you need to creat an object of the class
    int age=28;
    String name="abes";

    public static void main(String[] args) {
        GlobalVSLocal obj=new GlobalVSLocal();
        // local variable are existing only inside methods and can only use by this method
        int a=98;
       String ad= obj.name;
       System.out.println(ad);
       obj.sum();
    }
    public void sum(){
        int age=28;
        String ar="try";
    }
}
