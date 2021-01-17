import java.util.ArrayList;
import java.util.HashMap;

public class phase_three {
    public static void main(String[] args) {
        graph g = new graph();

        ArrayList<String> phase2custom = new ArrayList<>();
        phase2custom.add("76465777888");
        phase2custom.add("49737196131");
        phase2custom.add("75670892400");
        phase2custom.add("19081257821");
        phase2custom.add("92637325775");

    }
    public void chk(HashMap<String,edge> edges,HashMap<String,vertex> vertices , ArrayList<String> custom){
        ArrayList<String> id = new ArrayList<>();
        for ( String x : custom ) {
            id.add(vertices.get(custom));

        }


    }
}
