import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class graph {
    HashMap <String,vertex> vertices;

    HashMap <String,edge> edges;

    public graph(){
        vertices=new HashMap<String, vertex>();
        edges=new HashMap<String, edge>();


        readaccounts();
        System.out.println(this.vertex_numbers());
    }
    private void readaccounts(){
        File f=new File("dataSample/accounts.csv");
        try{
            Scanner scan=new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[2],new account(data[0],data[1],data[2],data[3]));/*
                for(int i=0;i<data.length;i++){
                    System.out.print("data["+i+"]= "+data[i]+"\t");
                }
                System.out.println();
                */
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int vertex_numbers(){
        return vertices.size();
    }
    public int edge_numbers(){
        return edges.size();
    }/*
    private void addvertex(String key,vertex v){
        if(vertices.putIfAbsent(key,v).equals("Yes"))
            System.out.println("Same vertex exist !");
    }
    */
}
