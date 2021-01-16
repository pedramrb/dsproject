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
        ArrayList<String> crim = g.getCriminalkeys();
        ArrayList<String> keys = g.getPeoplekeys();

        for (String x : crim) {
                System.out.println("work : " + x);
        }
    }
    }


