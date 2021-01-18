import java.util.ArrayList;
import java.util.HashMap;

public class phase_four {
    graph g;
    HashMap<String,vertex>vertices;
    HashMap<String,edge>edges;
    public phase_four(graph g) {
        ArrayList<String>before=new ArrayList<String>();before.add("92637325775");
        before.add("75670892400");before.add("49737196131");before.add("19081257821");before.add("76465777888");
        this.g=g;
        this.vertices=g.getVertices();
        this.edges=g.getEdges();
        ArrayList<String>customs=g.getCustomkeys();
        for(String t:before){
            //System.out.println("\t"+vertices.get(t).toString());
            if(hascall(t)){
                System.err.println(vertices.get(t).toString());
            }
        }

    }
    public boolean hascall(String customkey){
        //people custom= (people) vertices.get(customkey);
        ArrayList<String> callkeys=g.getCallkeys();
        for(String x:callkeys){
            call c= (call) edges.get(x);
            if(((phone)c.from).ssn.equals(customkey)){
                if(iscriminal(((phone)c.to).ssn))
                    return true;
            }
            if(((phone)c.to).ssn.equals(customkey)){
                if(iscriminal(((phone)c.from).ssn))
                    return true;
            }
        }
        return false;
    }
    public boolean iscriminal(String key){
        ArrayList<String> criminal=g.getCriminalkeys();
        for(String x:criminal){
            if(x.equals(key))
                return true;
        }
        return false;
    }
}
