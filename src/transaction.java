public class transaction extends edge {
    String transactionid;
    String date;
    String amount;
    public transaction(String key, String value, vertex from , vertex to, String transactionid, String date, String amount){
        super(key,value,from,to);
        this.amount=amount;
        this.date=date;
        this.transactionid=transactionid;
    }
}
