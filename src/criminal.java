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
        HashMap<ArrayList<String>, vertex> people = new HashMap<>();
        people.put(g.getPeoplekeys(), vertices.keySet("workplase"));
        for (ArrayList<String> i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i) + "n/");
        }

    }
}

