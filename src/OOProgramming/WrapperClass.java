package OOProgramming;

public class WrapperClass {
    public static void main(String[] args) {
        //convert string to integer
        String x="200";
        System.out.println(x+20);
        int a=Integer.parseInt(x);
        System.out.println(a+20);
        // string to double
        double d=Double.parseDouble(x);
        System.out.println(d+20.5);
        // string to boolean
        String e="true";
        boolean b=Boolean.parseBoolean(e);
        System.out.println(b);
        //integer to string
        int re=100;
        System.out.println(re);
        String sx=String.valueOf(re);
        System.out.println(sx+10);
        String xc="100A";
        Integer.parseInt(xc);// you can not will get  number format exception....


    }

}
