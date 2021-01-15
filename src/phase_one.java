import java.io.*;
import java.util.Scanner;

public class phase_one {
    public static void main(String[] args) {
        File f=new File("dataSample");
        File []subfiles=f.getAbsoluteFile().listFiles();
        for(File x:subfiles){
            String s=x.getName();
            System.out.print(x.getPath()+"\t");
            s=s.replaceAll(".csv","");
            System.out.println(s.replaceAll("s",""));
        }
    }
}
