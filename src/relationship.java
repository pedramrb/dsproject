public class relationship extends edge{
    String relation;
    String date;
    public relationship(String key,String value,vertex from,vertex to,String relation,String date){
        super(key,value,from,to);
        this.relation=relation;
        this.date=date;
    }
}
