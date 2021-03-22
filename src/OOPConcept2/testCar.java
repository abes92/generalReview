package OOPConcept2;

public class testCar {
    public static void main(String[] args) {
        bmw obj=new bmw();// static polymorphism .... compile time polymorphism
        obj.Safety();
        obj.start();
        obj.stop();
        obj.fuel();
        obj.engine();
        System.out.println("**********");
        car c=new car();
        c.fuel();
        c.start();
        c.stop();
        c.engine();
        System.out.println("**********");
        // top casting
        car c1=new bmw();//child class can be referred by parent class reference variable
        c1.stop();// ..dynamic polymorphism..run time polymorphism
        c1.start();
        c1.fuel();

        //down casting
        bmw b1=(bmw)new car();// you will get exception class cast exception

        vehicle v=new vehicle();
        v.engine();





    }
}
