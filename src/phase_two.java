import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class phase_two {
    public static void main(String[] args) {
        graph g = new graph();

        ArrayList <String> custom = g.getCustomkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList<String> badcustoms=new ArrayList<String>();

        /*
        for(String key:custom){
            people p=((people)vertices.get(key));
            ArrayList<String>pownerships=p.getNewownership();
            if(pownerships.size()>0){
                if(!badcustoms.contains(key)) {
                    badcustoms.add(key);
                    continue;
                }
            }
            for(String k:p.getFamily()){
                ArrayList<String> temp=((people)vertices.get(k)).getNewownership();
                if(temp.size()>0){
                    if(!badcustoms.contains(key)){
                        badcustoms.add(key);
                        continue;
                    }
                }
            }
        }

         */




        ArrayList<String> ssn=new ArrayList<String>();
        ssn.add("92637325775");
        ssn.add("46730468386");
        ssn.add("59095165555");
        ssn.add("33553765741");
        ssn.add("75670892400");
        ssn.add("42167291116");
        ssn.add("72309449583");
        ssn.add("47674564865");
        ssn.add("49737196131");
        ssn.add("77888219035");
        ssn.add("76465777888");
        ssn.add("77132792314");
        ssn.add("19081257821");
        for(String a:ssn){
            people p=((people)vertices.get(a));
            System.out.println(p.toString());
            System.out.println("self= "+p.newownership.size()+"\tfamily= "+p.getfamilyownership(vertices));
            for(String k:p.getNewownership()){
                System.out.println("/t"+g.getEdges().get(k).toString());
            }
        }



        /*
        while(true){
            Scanner scan=new Scanner(System.in);
            String a=scan.next();

            people p=((people)vertices.get(a));
            System.out.println(p.toString());
            System.out.println("self= "+p.newownership.size()+"\tfamily= "+p.getfamilyownership(vertices));
            for(String k:p.getNewownership()){
                System.out.println("/t"+g.getEdges().get(k).toString());
            }

        }

         */



        //printbadcustoms(badcustoms,vertices);


    }
    public static void printbadcustoms(ArrayList<String> badcustoms,HashMap<String,vertex> vertices){
        for(String key:badcustoms){
            people badcustom = ((people)vertices.get(key));
            System.out.println(badcustom.toString());
        }
    }

}