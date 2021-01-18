import java.util.ArrayList;
import java.util.HashMap;

public class phase_three {
    HashMap<String,vertex> vertices;
    HashMap<String,edge> edges;
    /*
    public phase_three(graph g){
        this.vertices=g.getVertices();
        this.edges=g.getEdges();
    }

     */
    public phase_three(graph g) {
        ArrayList<String> phase2custom = new ArrayList<String>();
        phase2custom.add("47674564865");phase2custom.add("76465777888");phase2custom.add("49737196131");phase2custom.add("75670892400");phase2custom.add("19081257821");
        phase2custom.add("92637325775");phase2custom.add("42167291116");phase2custom.add("59095165555");phase2custom.add("77888219035");
        phase2custom.add("46730468386");phase2custom.add("72309449583");phase2custom.add("33553765741");phase2custom.add("40119347287");phase2custom.add("77132792314");
        this.edges=g.getEdges();
        this.vertices=g.getVertices();
        for(String key:phase2custom){
            //System.out.println("\t"+vertices.get(key).toString());
            if(check((people)vertices.get(key),0)){
                System.err.println(vertices.get(key).toString());
            }
        }
    }

    public boolean check(people p,int x){
        //System.out.println("check called");
        if(x>6) {
            //System.out.println("End");
            return false;
        }
        //System.out.println(p);
        //for(String i:p.getAccountkeys()){
        for(int i=0;i<p.getAccountkeys().size();i++){
            String m=p.getAccountkeys().get(i);
            //System.out.println("\tfirst for loop");
            //for(String j:((account)vertices.get(i)).totransactionkeys){
            for(int j=0;j<((account)vertices.get(m)).totransactionkeys.size();j++){
                //System.out.println(((account)vertices.get(m)).totransactionkeys.size());
                String n=((account)vertices.get(m)).totransactionkeys.get(j);
                //System.out.println(vertices.get(m).toString());
                transaction tr= (transaction) edges.get(n);
                try {
                    people temp = (people) vertices.get(((account) tr.from).ssn);
                    if (isbad(temp))
                        return true;
                    if (check(temp, x + 1))
                        return true;
                } catch (Exception e) {
                    //System.err.println(n);
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    public boolean isbad(people p){
        //System.out.println(p.workplace);
        if(p.workplace.equals("قاچاقچی"))
            return true;
        return false;
    }
}
