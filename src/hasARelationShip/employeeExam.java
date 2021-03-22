package hasARelationShip;

class Name {
    String FirstName;
    String LastName;
    String Country;

    public Name(String FN,String LN,String CT){
        this.FirstName=FN;
        this.LastName=LN;
        this.Country=CT;
    }
}


public class employeeExam {
    int age;
    Name n;

    public  void display(int age,Name n){
        System.out.println("age: "+age);
        System.out.println("Full Name: "+n.LastName+" "+n.FirstName+" \ncountry name: "+n.Country);
    }



    public static void main(String[] args) {
        employeeExam e=new employeeExam();
        Name n=new Name("Abes","Taieb","Algeria");
        e.display(28,n);
    }
}
