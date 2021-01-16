import java.util.ArrayList;
import java.util.HashMap;

public class phase_two {
    public static void main(String[] args) {
        graph g = new graph();
        //ArrayList <String> badcustom = new ArrayList<String>();
        //ArrayList <String> criminal=g.getCriminalkeys();
        //ArrayList <String> transfromcustom = g.getTransactionofcustom(); //transactions from customs
        ArrayList <String> idcustom = g.getAcccustomkeys(); //account id

        ArrayList <String> transaction = g.getTransactionkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList <String> custom=g.getCustomkeys(); //ssn of custom
        ArrayList <String> relation=g.getRelationkeys(); //ssn of relation

        for(String x:relation){
            System.out.println(vertices.get(x).toString());
        }


    }

}