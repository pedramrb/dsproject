import java.time.LocalDate;

public class relationship extends edge{
    String relation;
    LocalDate date;
    public relationship(vertex from, vertex to, String relation, String date){
        super(from,to);
        this.relation=relation;
        this.date=LocalDate.parse(date);
    }
}
