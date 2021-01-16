import java.util.ArrayList;
import java.util.HashMap;

public class print_graph {
    private graph g;
    private HashMap edges;
    private HashMap vertices;
    public print_graph(graph g){
        this.g=g;
        edges=g.getEdges();
        vertices=g.getVertices();
        printpeople();
        printaccounts();
        printcalls();
        printcars();
        printhomes();
        printownerships();
        printphones();
        printrelationships();
        printtransactions();
    }
    private void printpeople(){
        ArrayList<String> keys=g.getPeoplekeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
    private void printaccounts(){
        ArrayList<String> keys=g.getAccountkeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
    private void printhomes(){
        ArrayList<String> keys=g.getHomekeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
    private void printcars(){
        ArrayList<String> keys=g.getCarkeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
    private void printphones(){
        ArrayList<String> keys=g.getPhonekeys();
        for(String x:keys){
            System.out.println(vertices.get(x).toString());
        }
    }
    private void printownerships(){
        ArrayList<String> keys=g.getOwnershipkeys();
        for(String x:keys){
            System.out.println(edges.get(x).toString());
        }
    }
    private void printtransactions(){
        ArrayList<String> keys=g.getTransactionkeys();
        for(String x:keys){
            System.out.println(edges.get(x).toString());
        }
    }
    private void printcalls(){
        ArrayList<String> keys=g.getCallkeys();
        for(String x:keys){
            System.out.println(edges.get(x).toString());
        }
    }
    private void printrelationships(){
        ArrayList<String> keys=g.getRelationshipkeys();
        for(String x:keys){
            System.out.println(edges.get(x).toString());
        }
    }
}
