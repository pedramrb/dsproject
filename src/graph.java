import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class graph {
    private HashMap <String,vertex> vertices;
    //private String []carkeys;
    private ArrayList<String> carkeys=new ArrayList<String>();
    private int carnum=0;
    //private String []phonekeys;
    private ArrayList<String> phonekeys=new ArrayList<String>();
    private int phonenum=0;
    //private String []homekeys;
    private ArrayList<String> homekeys=new ArrayList<String>();
    private int homenum=0;
    //private String []peoplekeys;
    private ArrayList<String> peoplekeys=new ArrayList<String>();
    private int peoplenum=0;
    //private String []accountkeys;
    private ArrayList<String> accountkeys=new ArrayList<String>();
    private int accountnum=0;
    //private String []ownershipkeys;
    private ArrayList<String> ownershipkeys=new ArrayList<String>();
    private int ownershipnum=0;
    //private String []transactionkeys;
    private ArrayList<String> transactionkeys=new ArrayList<String>();
    private int transactionnum=0;
    //private String []callkeys;
    private ArrayList<String> callkeys=new ArrayList<String>();
    private int callnum=0;
    //private String []relationshipkeys;
    private ArrayList<String> relationshipkeys=new ArrayList<String>();
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
        //System.out.println(this.vertices.get("974208").toString());
    }


    public ArrayList<String> getCarkeys() {
        return carkeys;
    }

    public ArrayList<String> getPhonekeys() {
        return phonekeys;
    }

    public ArrayList<String> getHomekeys() {
        return homekeys;
    }

    public ArrayList<String> getPeoplekeys() {
        return peoplekeys;
    }

    public ArrayList<String> getAccountkeys() {
        return accountkeys;
    }

    public ArrayList<String> getOwnershipkeys() {
        return ownershipkeys;
    }

    public ArrayList<String> getTransactionkeys() {
        return transactionkeys;
    }

    public ArrayList<String> getCallkeys() {
        return callkeys;
    }

    public ArrayList<String> getRelationshipkeys() {
        return relationshipkeys;
    }

    private void readpeoples(){
        File f = new File("dataSample/people.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[] = scan.nextLine().replaceAll("\"" , "").split(",");
                vertices.put(data[2] , new people(data[0],data[1],data[2],data[3] , data[4] , data[5]));
                //peoplekeys[peoplenum++] = data[2];
                peoplekeys.add(data[2]);
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
                //accountkeys[accountnum++]=data[2];
                accountkeys.add(data[2]);
            }
            //System.out.println("Done");
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
                //carkeys[carnum++]=data[0];
                carkeys.add(data[2]);
            }
            //System.out.println("Done");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readhomes(){
        File f=new File("dataSample/homes.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[2] , new home(data[0] , data[1] , data[2], data[3] , data[4]));
                //homekeys[homenum++]=data[2];
                homekeys.add(data[2]);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readphones(){
        File f=new File("dataSample/phones.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                vertices.put(data[1] , new phone(data[0] , data[1] , data[2]));
                //phonekeys[phonenum++]=data[1];
                phonekeys.add(data[2]);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readcalls(){
        File f=new File("dataSample/calls.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                //System.out.println(data[0]+" "+data[1]+" \""+data[2]+"\" "+data[3]+" "+data[4]);
                edges.put(data[2] , new call((vertex)vertices.get(data[0]), (vertex)vertices.get(data[1]) , data[2] , data[3] , data[4]));
                //callkeys[callnum++]=data[2];
                callnum++;
                callkeys.add(data[2]);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private void readownerships(){
        File f=new File("dataSample/ownerships.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[2] , new ownership(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3] , data[4]));
                //ownershipkeys[ownershipnum++]=data[2];
                ownershipkeys.add(data[2]);
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
                //transactionkeys[transactionnum++]=data[2];
                transactionkeys.add(data[2]);
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
                //relationshipkeys[relationshipnum++]=data[2];
                relationshipkeys.add(data[2]);
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

    //  /*

    public int getCarnum() {
        return carnum;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public int getHomenum() {
        return homenum;
    }

    public int getPeoplenum() {
        return peoplenum;
    }

    public int getAccountnum() {
        return accountnum;
    }

    public int getOwnershipnum() {
        return ownershipnum;
    }

    public int getTransactionnum() {
        return transactionnum;
    }

    public int getCallnum() {
        return callnum;
    }

    public int getRelationshipnum() {
        return relationshipnum;
    }


    //  */
}
