import java.time.LocalDateTime;

public class call extends edge {
    String callid;
    LocalDateTime date;
    String duration;
    public call(vertex from , vertex to , String callid , String date , String duration ){
        super(from,to);
        this.callid=callid;
        this.date=LocalDateTime.parse(date);
        this.duration=duration;
    }

    @Override
    public String toString() {
        return "call{" +
                "callid='" + callid + '\'' +
                ", date=" + date +
                ", duration='" + duration + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
