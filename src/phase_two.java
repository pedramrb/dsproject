import java.util.ArrayList;
import java.util.HashMap;

public class phase_two {
    public static void main(String[] args) {
        graph g = new graph();
        ArrayList <String> badcustom = new ArrayList<String>();

        ArrayList <String> transaction = g.getTransactionkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList <String> custom=g.getCustomkeys();
        ArrayList <String> criminal=g.getCriminalkeys();

    }
}