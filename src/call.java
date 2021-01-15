public class call extends edge {
    String callid;
    String date;
    String duration;
    public call(phone from , phone to ,String callid , String date , String duration ){
        super(from,to);
        this.callid=callid;
        this.date=date;
        this.duration=duration;
    }
}
