public class transactions extends edge {
    String transactionid;
    String date;
    String amount;
    public transactions(String key,String value,vertex from , vertex to,String transactionid,String date,String amount){
        this.from=from;
        this.key=key;
        this.to=to;
        this.value=value;
        this.amount=amount;
        this.date=date;
        this.transactionid=transactionid;
    }
}
