import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class graph {
    private HashMap <String,vertex> vertices;
    private HashMap <String,edge> edges;

    private ArrayList<String> carkeys=new ArrayList<String>();
    private ArrayList<String> phonekeys=new ArrayList<String>();
    private ArrayList<String> homekeys=new ArrayList<String>();
    private ArrayList<String> peoplekeys=new ArrayList<String>();
    private ArrayList<String> accountkeys=new ArrayList<String>();
    private ArrayList<String> ownershipkeys=new ArrayList<String>();
    private ArrayList<String> transactionkeys=new ArrayList<String>();
    private ArrayList<String> callkeys=new ArrayList<String>();
    private ArrayList<String> relationshipkeys=new ArrayList<String>();

    public ArrayList<String> badowners=new ArrayList<String>();

    private ArrayList<String> criminalkeys = new ArrayList<String>(); //ssn
    private ArrayList<String> customkeys = new ArrayList<String>(); //ssn of custom
    private ArrayList<String> relationkeys = new ArrayList<String>(); //ssn of relation
    private ArrayList<String> acccustomkeys = new ArrayList<String>(); //account id custom


    public graph(){
        vertices=new HashMap<String, vertex>();
        edges=new HashMap<String, edge>();

        readpeoples();
        readaccounts();
        readcars();
        readhomes();
        readphones();
        readcalls();
        readrelationships();
        readownerships();
        newreadtransactions();
    }

    public HashMap<String, vertex> getVertices() {
        return vertices;
    }
    public HashMap<String, edge> getEdges() {
        return edges;
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

    public ArrayList<String> getCriminalkeys() {
        return criminalkeys;
    }
    public ArrayList<String> getCustomkeys() {
        return customkeys;
    }


    private void readpeoples(){
        File f = new File("dataSample/people.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while(scan.hasNextLine()){
                String data[] = scan.nextLine().replaceAll("\"" , "").split(",");
                vertices.put(data[2] , new people(data[0],data[1],data[2],data[3] , data[4] , data[5]));
                peoplekeys.add(data[2]);
                if(data[5].equals("قاچاقچی")) {
                    criminalkeys.add(data[2]);
                }
                if(data[5].equals("گمرک")||data[5].equals("سازمان بنادر")){
                    customkeys.add(data[2]);
                }
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
                vertices.put(data[3],new account(data[0],data[1],data[2],data[3]));
                accountkeys.add(data[3]);
                ((people)vertices.get(data[0])).addacountkey(data[3]);
            }
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
                carkeys.add(data[0]);
            }
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
                phonekeys.add(data[1]);
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
                edges.put(data[2] , new call((vertex)vertices.get(data[0]), (vertex)vertices.get(data[1]) , data[2] , data[3] , data[4]));
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
                ownershipkeys.add(data[2]);
                ownership x=((ownership)edges.get(data[2]));
                people p=((people)vertices.get(data[0]));
                if(x.isnear()){
                    if((p.workplace.equals("گمرک")||p.workplace.equals("سازمان بنادر"))&&(!p.isbadcustom)){
                        p.isbadcustom=true;
                    }
                    else{
                        ArrayList <String> t=p.getFamily();
                        for(int i=0;i<t.size();i++){
                            people p2=((people)vertices.get(t.get(i)));
                            if((p2.workplace.equals("گمرک")||p2.workplace.equals("سازمان بنادر"))&&(!p2.isbadcustom)){
                                p2.isbadcustom=true;
                            }

                        }
                    }
                    p.addnewownership(data[2]);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    /*
    private boolean isbadowner(ownership own,people p){
        if(p.workplace.equals("گمرک")||p.workplace.equals("اداره بنادر")){
            badowners.add(p.ssn);
            System.out.println(p.toString());
            return true;
        }
        for(String i:p.getFamily()){
            people x=((people)vertices.get(i));
            if(x.workplace.equals("گمرک")||p.workplace.equals("اداره بنادر")){
                badowners.add(x.ssn);
                System.out.println("prim\t"+x.toString());
                return true;
            }
        }
        return false;
    }

     */

    private void readrelationships(){
        File f=new File("dataSample/relationships.csv");
        try{
            Scanner scan = new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put(data[1] , new relationship(vertices.get(data[0]), vertices.get(data[1]) , data[2] , data[3]));
                relationshipkeys.add(data[1]);
                ((people)vertices.get(data[0])).addfamily(data[1]);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void newreadtransactions(){
        File f=new File("dataSample/transactions.csv");
        try{
            Scanner scan=new Scanner(f);
            scan.nextLine();
            while (scan.hasNextLine()){
                String data[]=scan.nextLine().replaceAll("\"","").split(",");
                edges.put( data[2] , new transaction( vertices.get(data[0]) , vertices.get(data[1]) , data[2] , data[3] , data[4] ) );
                ((account)vertices.get(data[0])).addfromtransactionkey(data[2]);
                ((account)vertices.get(data[1])).addtotransactionkey(data[2]);
                transactionkeys.add(data[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
