import java.util.ArrayList;
import java.util.HashMap;

public class print_graph {
    private graph g;
    private HashMap edges;
    private HashMap vertices;
    public print_graph(graph g){
        this.g=g;
        edges=g.getedges();
        vertices=g.getvertices();
        printpeople();
    }
    private void printpeople(){
        ArrayList<String> keys=g.getPeoplekeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
}
