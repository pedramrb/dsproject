import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

         *//*

        LocalDate x=LocalDate.parse("1991-11-24");
        LocalDate y=LocalDate.parse("1993-11-24");
        //System.out.println(Period.between(x,LocalDate.now()).getYears());
        System.out.println(Math.abs(Period.between(y,x).getYears()));

       */
        graph g=new graph();
        //System.out.println(g.getCallnum());
        //System.out.println(g.getvertices().get("974208"));
        //System.out.println(g.getvertices().put("974208",new call((vertex)g.getvertices().get("09320708544"),(vertex)g.getvertices().get("09128025949"),"974208","1983-10-10T09:00:39","21:13")));
        //System.out.println(g.getvertices().get("974208"));
        System.out.println(g.getvertices().get("974208").toString());
        //new print_graph(g);
        /*
        File f=new File("dataSample/calls.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String s=scan.nextLine();
                //System.out.println(s);
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]);

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

         */
    }
}
