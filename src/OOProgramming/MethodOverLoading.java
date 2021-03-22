package OOProgramming;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.sum();
        obj.sum(10);
        obj.sum(12,34);

    }
    // method over loading is when the methods name are the same ,
    // but with different parameters or input parameters within the same class
    public void sum(){
        System.out.println("live and die on this day");
    }
    public void sum(int x){
        System.out.println("be patient for the decision of your lord(allah)");
    }
    public void sum(int x, int y){
        System.out.println("for indeed, you are in our eyes");
    }
}
