public class transaction extends edge {
    String transactionid;
    String date;
    String amount;
    public transaction( account from , account to, String transactionid, String date, String amount){
        super(from,to);
        this.amount=amount;
        this.date=date;
        this.transactionid=transactionid;
    }
}
