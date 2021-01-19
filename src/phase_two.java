import java.util.ArrayList;
import java.util.HashMap;

public class phase_two {

        graph g = new graph();
        ArrayList <String> custom = g.getCustomkeys();
        HashMap<String,vertex> vertices=g.getVertices();
        ArrayList<String> badcustoms=new ArrayList<String>();
    public phase_two(graph g) {

        for (String key : custom) {
            people p = ((people) vertices.get(key));
            ArrayList<String> pownerships = p.getNewownership();
            if (pownerships.size() > 0) {
                if (!badcustoms.contains(key)) {
                    badcustoms.add(key);
                    continue;
                }
            }
            for (String k : p.getFamily()) {
                ArrayList<String> temp = ((people) vertices.get(k)).getNewownership();
                if (temp.size() > 0) {
                    if (!badcustoms.contains(key)) {
                        badcustoms.add(key);
                        continue;
                    }
                }
            }
        }

        for (String a : badcustoms) {
            people p = ((people) vertices.get(a));
            System.out.println(p.toString());
            System.out.println("self= " + p.newownership.size() + "\tfamily= " + p.getfamilyownership(vertices, g.getEdges()));
            for (String k : p.getNewownership()) {
                System.out.println("\t\t" + g.getEdges().get(k).toString());
            }
        }
    }
}