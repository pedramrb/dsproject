import java.util.HashMap;

public class graph {
    HashMap <String,vertex> vertices;
    int vnums=0;
    HashMap <String,edge> edges;
    int enums=0;
    public graph(){
        vertices=new HashMap<String, vertex>();
        edges=new HashMap<String, edge>();
        vnums=0;
        enums=0;
    }
    public int vertex_numbers(){
        return vertices.size();
    }
    public int edge_numbers(){
        return edges.size();
    }
    private void addvertex(String key,vertex v){
        if(vertices.putIfAbsent(key,v).equals("Yes"))
            System.out.println("Same vertex exist !");
        else
            vnums++;
    }
}
