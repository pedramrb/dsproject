import java.time.LocalDate;

public class call extends edge {
    String callid;
    LocalDate date;
    String duration;
    public call(vertex from , vertex to , String callid , String date , String duration ){
        super(from,to);
        this.callid=callid;
        this.date=LocalDate.parse(date);
        this.duration=duration;
    }
}
