public class call extends edge {
    String callid;
    String date;
    String duration;
    public call(String key,String value,vertex from , vertex to ,String callid , String date , String duration ){
        super(key,value,from,to);
        this.callid=callid;
        this.date=date;
        this.duration=duration;
    }
}
