public class relationship extends edge{
    String relation;
    String date;
    public relationship(people from,people to,String relation,String date){
        super(from,to);
        this.relation=relation;
        this.date=date;
    }
}
