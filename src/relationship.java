public class relationship extends edge{
    String relation;
    String date;
    public relationship(String key,String value,vertex from,vertex to,String relation,String date){
        this.key=key;
        this.value=value;
        this.from=from;
        this.to=to;
        this.relation=relation;
        this.date=date;
    }
}
