import java.util.ArrayList;
import java.util.HashMap;

public class criminal {
    private graph g;
    private HashMap edges;
    private HashMap vertices;
    public criminal(graph g){
        this.g = g;
        edges = g.getedges();
        vertices = g.getvertices();
        who();
    }
    private void who() {
        ArrayList<String> c = g.getPeoplekeys();
        HashMap<ArrayList<String>, HashMap> people = new HashMap<>();
        people.put(c , vertices);
        for (ArrayList<String> i : people.keySet()) {
            System.out.println(i);
        }

    }
}

