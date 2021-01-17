import java.util.ArrayList;
import java.util.HashMap;

public class phase_three {
    public static void main(String[] args) {
        graph g = new graph();
        HashMap<String, vertex> vertices = g.getVertices();
        HashMap<String, edge> edges = g.getEdges();

        ArrayList<people> phase2custom = new ArrayList<>();
        phase2custom.add((people)vertices.get("76465777888"));
        phase2custom.add((people)vertices.get("49737196131"));
        phase2custom.add((people)vertices.get("75670892400"));
        phase2custom.add((people)vertices.get("19081257821"));
        phase2custom.add((people)vertices.get("92637325775"));
        for (people x : phase2custom){
            System.out.println(x.toString());
        }



    }
}
