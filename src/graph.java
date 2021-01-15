import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class graph {
    private HashMap <String,vertex> vertices;
    private String []carkeys;
    private int carnum=0;
    private String []phonekeys;
    private int phonenum=0;
    private String []homekeys;
    private int homenum=0;
    private String []peoplekeys;
    private int peoplenum=0;
    private String []accountkeys;
    private int accountnum=0;
    private String []ownershipkeys;
    private int ownershipnum=0;
    private String []transactionkeys;
    private int transactionnum=0;
    private String []callkeys;
    private int callnum=0;
    private String []relationshipkeys;
    private int relationshipnum=0;
    private HashMap <String,edge> edges;

    public graph(){
        vertices=new HashMap<String, vertex>();
        edges=new HashMap<String, edge>();

        readpeoples();
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
    private void readpeoples(){
        File f = new File("dataSample/people.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[] = scan.nextLine().replaceAll("\"" , "").split(",");
                vertices.put(data[2] , new people(data[0],data[1],data[2],data[3] , data[4] , data[5]));
                peoplekeys[peoplenum++] = data[2];
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readaccounts(){
        File f=new File("dataSample/accounts.csv");
        try{
            Scanner scan=new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[2],new account(data[0],data[1],data[2],data[3]));
                accountkeys[accountnum++]=data[2];
                vertices.put(data[2],new account(data[0],data[1],data[2],data[3]));
                accountkeys[accountnum++] = data[2];
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
                carkeys[carnum++]=data[0];
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
                homekeys[homenum++]=data[2];
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
                phonekeys[phonenum++]=data[1];
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
                edges.put(data[2] , new call(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3] , data[4]));
                callkeys[callnum++]=data[2];
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
                edges.put(data[2] , new ownership(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3] , data[4]));
                ownershipkeys[ownershipnum++]=data[2];
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
                edges.put(data[2] , new transaction(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3] , data[4]));
                transactionkeys[transactionnum++]=data[2];
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
                edges.put(data[2] , new relationship(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3]));
                relationshipkeys[relationshipnum++]=data[2];
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
