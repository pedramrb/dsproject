import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class phase_one {
    public static void main(String[] args) {
        /*
        File f=new File("dataSample");
        File []subfiles=f.getAbsoluteFile().listFiles();
        for(File x:subfiles){
            String s=x.getName();
            System.out.print(x.getPath()+"\t");
            s=s.replaceAll(".csv","");
            System.out.println(s.replaceAll("s",""));
        }

         */

        LocalDate x=LocalDate.parse("1991-11-24");
        LocalDate y=LocalDate.parse("1993-11-24");
        //System.out.println(Period.between(x,LocalDate.now()).getYears());
        System.out.println(Math.abs(Period.between(y,x).getYears()));
    }
}
