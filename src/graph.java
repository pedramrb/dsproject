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
        readcars();
        readhomes();
        readphones();
        readcalls();
        readownerships();
        readtransactions();
        readrelationships();
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
    private void readcars(){
        File f = new File("dataSample/cars.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[] = scan.nextLine().replaceAll("\"" , "").split(",");
                vertices.put(data[0] , new car(data[0],data[1],data[2],data[3]));
            }
            System.out.println("Done");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readhomes(){
        File f=new File("dataSample/home.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[2] , new home(data[0] , data[1] , data[2], data[3] , data[4]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readphones(){
        File f=new File("dataSample/phone.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[1] , new phone(data[0] , data[1] , data[2]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readcalls(){
        File f=new File("dataSample/call.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[2] , new call(data[0] , data[1] , data[2] , data[3] , data[4]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readownerships(){
        File f=new File("dataSample/ownership.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[2] , new ownership(data[0] , data[1] , data[2] , data[3] , data[4]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readtransactions(){
        File f=new File("dataSample/transactions.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[2] , new transaction(data[0] , data[1] , data[2] , data[3] , data[4]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readrelationships(){
        File f=new File("dataSample/relationships.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[2] , new relationship(data[0] , data[1] , data[2] , data[3]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public HashMap getedges(){
        return edges;
    }
    public HashMap getvertices(){
        return vertices;
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
