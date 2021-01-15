public class call extends edge {
    String callid;
    String date;
    String duration;
    public call(String key,String value,vertex from , vertex to ,String callid , String date , String duration ){
        callid=callid;
        date=date;
        this.duration=duration;
        this.key=key;
        this.value=value;
        this.from=from;
        this.to=to;
    }
}
