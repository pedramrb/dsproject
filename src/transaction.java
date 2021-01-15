import java.time.LocalDate;

public class transaction extends edge {
    String transactionid;
    LocalDate date;
    String amount;
    public transaction(vertex from , vertex to, String transactionid, String date, String amount){
        super(from,to);
        this.amount=amount;
        this.date=LocalDate.parse(date);
        this.transactionid=transactionid;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "transactionid='" + transactionid + '\'' +
                ", date=" + date +
                ", amount='" + amount + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
