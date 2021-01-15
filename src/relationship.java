public class relationship extends edge{
    String relation;
    String date;
    public relationship(vertex from,vertex to,String relation,String date){
        super(from,to);
        this.relation=relation;
        this.date=date;
    }
}
