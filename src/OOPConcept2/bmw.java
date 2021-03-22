package OOPConcept2;

public class bmw extends car{
    //when the same method is presenting in parent class as well as in child class with the same name
    // and same number of argument is called method overriding
    public void start(){// start is a method overriding
        System.out.println("bmw start method");
    }
    public void Safety (){
        System.out.println("bmw safety method");
    }

}
