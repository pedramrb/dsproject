public class call extends edge {
    String callid;
    String date;
    String duration;
    public call(vertex from , vertex to ,String callid , String date , String duration ){
        super(from,to);
        this.callid=callid;
        this.date=date;
        this.duration=duration;
    }
}
