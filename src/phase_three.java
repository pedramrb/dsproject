import java.util.ArrayList;
import java.util.HashMap;

public class phase_three {
    public static void main(String[] args) {
        graph g = new graph();

        ArrayList<String> phase2custom = new ArrayList<>();
        phase2custom.add("47674564865");
        phase2custom.add("76465777888");
        phase2custom.add("49737196131");
        phase2custom.add("75670892400");
        phase2custom.add("19081257821");
        phase2custom.add("92637325775");
        phase2custom.add("42167291116");
        phase2custom.add("59095165555");
        phase2custom.add("77888219035");
        phase2custom.add("46730468386");
        phase2custom.add("72309449583");
        phase2custom.add("33553765741");
        phase2custom.add("40119347287");
        phase2custom.add("77132792314");


    }
    public void chk(HashMap<String,edge> edges,HashMap<String,vertex> vertices , ArrayList<String> custom){
        ArrayList<String> id = new ArrayList<>();
        for ( String x : custom ) {
            id.add((account)vertices.get(x));
        }
        System.out.println(id);

    }
}
