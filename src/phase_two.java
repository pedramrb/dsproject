import java.util.ArrayList;
import java.util.HashMap;

public class phase_two {
    public static void main(String[] args) {
        graph g = new graph();
        //ArrayList <String> badcustom = new ArrayList<String>();
        //ArrayList <String> criminal=g.getCriminalkeys();

        ArrayList <String> transaction = g.getTransactionkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList <String> custom=g.getCustomkeys(); //ssn
        ArrayList <String> idcustom = g.getAcccustomkeys(); //account id
        ArrayList <String> transfromcustom = g.getTransactionofcustom(); //transactions from customs

            //System.out.println(idcustom);

        for(String key:transfromcustom){
            System.out.println(vertices.get(key).toString());
        }

    }

}