import java.io.*;
import java.util.Scanner;

public class phase_one {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(new File("dateSample"))
        File f=new File("dataSample");
        String ap=f.getAbsolutePath();
        File []subfiles=f.getAbsoluteFile().listFiles();
        System.out.println(f.getAbsolutePath());
        for(File x:subfiles){
            System.out.print(x.getPath()+"\t");
            System.out.println(x.getName().replaceAll(".csv",""));
        }
    }
}
