import java.time.LocalDate;

public class transaction extends edge {
    String transactionid;
    LocalDate date;
    String amount;
    public transaction( account from , account to, String transactionid, String date, String amount){
        super(from,to);
        this.amount=amount;
        this.date=LocalDate.parse(date);
        this.transactionid=transactionid;
    }
}
