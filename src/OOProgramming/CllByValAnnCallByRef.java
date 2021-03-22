package OOProgramming;

public class CllByValAnnCallByRef {
    int p;
    int f;

    public static void main(String[] args) {
        CllByValAnnCallByRef obj=new CllByValAnnCallByRef();
        int x=23;
        int y=43;
  System.out.println(sum(x,y));
  obj.p=40;
  obj.f=23;
  obj.test(obj);
  //after swap
        System.out.println(obj.p);
        System.out.println(obj.f);

    }// call by value
    public static  int sum(int a,int b){
        a=20;
        b=12;
        int c=a+b;
        return c;
    }//call by reference
    public void test(CllByValAnnCallByRef t){
        int temp;
        temp=t.p;//temp=40
        t.p=t.f;//t.p=23
        t.f=temp;//40

    }

    public static class If_else_concept {
        public static void main(String[] args) {
            int a=5;
    //        if(((a>=10) && (a<12)) || (a !=10)){
    //            System.out.println("the condition is true");
    //
    //        }else {
    //            System.out.println("the condition is false");
    //        }
    //        int number=14;
    //        //Using ternary operator
    //        String result=(number%2==0)?"even number":"odd number";
    //        System.out.println("the output result is:"+result);
    //    if(a<23){
    //        System.out.println("the 1 condition is true");
    //    } else if (a>3){
    //        System.out.println("the 2 condition is true");
    //    }else{
    //        System.out.println("the 3 condition is true");
    //    }
        //for loop/nested/pyramid example
    //        for(a=1;a<=5;a++) {
    //            for (int i = 1; i <= a; i++) {
    //
    //                    System.out.print("*");
    //
    //            }
    //                System.out.println();
    //            }
            //flipped pyramid
    //        for(int s=1;s<=a;s++) {
    //            for (int i=a; i>=s; i--) {
    //
    //                System.out.print("*");
    //            }
    //            System.out.println();
    //        }
    //        int ta=1;
    //        while(ta<=10){
    //            System.out.println(ta);
    //            ta++;
    //        }
    //        int ta=1;
    //        do {
    //            System.out.println(ta);
    //            ta++;
    //        }while(ta<=10);

            //switch statement
            int ab=10;
            switch(ab){
                case 1: System.out.println("try again");
                break;
                case 4: System.out.println("try one more time");
                break;
                case 15: System.out.println("you almost there ");
                break;
                case 9: System.out.println("never give up");
                break;
                case 16: System.out.println("congratulation you did it");
                break;
                default: System.out.println(" not this time by next time for sure");
            }
            for(int i=1;i<=10;i++){
                if((i==5)||(i==7)){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
