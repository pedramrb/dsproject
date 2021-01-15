import java.io.*;
import java.util.Scanner;

public class phase_one {
    public static void main(String[] args) {
        File f=new File("dataSample");
        File []subfiles=f.getAbsoluteFile().listFiles();
        for(File x:subfiles){
            System.out.print(x.getPath()+"\t");
            System.out.println(x.getName().replaceAll(".csv",""));
        }
    }
}
