import java.util.ArrayList;
import java.util.HashMap;

public class phase_two {
    public static void main(String[] args) {
        graph g = new graph();

        ArrayList <String> custom = g.getCustomkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList<String> badcustoms=new ArrayList<String>();

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

        //printbadcustoms(badcustoms,vertices);


    }
    public static void printbadcustoms(ArrayList<String> badcustoms,HashMap<String,vertex> vertices){
        for(String key:badcustoms){
            people badcustom = ((people)vertices.get(key));
            System.out.println(badcustom.toString());
        }
    }

}