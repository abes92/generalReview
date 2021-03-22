package studentAverageGrade;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class student_3_Grade_Average {

    public static void main(String[] args) {


        averageGrade("la moyenne de = ",9.25,10,7.5,8,6,8.25,4) ;
//        averageGrade("la moyenne de hamza= ",3.4,3,4.5,7,7,8,8) ;

    }
    public static void averageGrade(String name,double a, double b, double c, double d, double e, double f, double g){

        double result= (a+b+c+d+e+f+g)/7;
        System.out.println(name+" "+result);

    }

}
