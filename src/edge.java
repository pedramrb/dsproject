import java.util.ArrayList;
import java.util.function.IntFunction;

public class edge extends ArrayList<String> {

    vertex from;
    vertex to;
    public edge(vertex from,vertex to){

        this.from=from;
        this.to=to;
    }


}
