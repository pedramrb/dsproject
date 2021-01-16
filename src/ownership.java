import java.time.LocalDate;
import java.time.Period;

public class ownership extends edge {
    String ownershipid;
    LocalDate date;
    String amount;
    public ownership(vertex from, vertex to, String ownershipid, String date, String amount){
        super(from,to);
        this.ownershipid=ownershipid;
        this.date=LocalDate.parse(date);
        this.amount=amount;
    }
    public boolean isnear(){

        System.out.print(ownershipid+"  => "+Period.between(date,LocalDate.now()).getYears()+" => ");
        if(Math.abs(Period.between(date,LocalDate.now()).getYears())>2){
            System.out.println("no\t"+date+" & "+LocalDate.now());
            return false;
        }
        System.out.println("yes\t"+date+" & "+LocalDate.now());
        return true;
    }

    @Override
    public String toString() {
        return "ownership{" +
                "ownershipid='" + ownershipid + '\'' +
                ", date=" + date +
                ", amount='" + amount + '\'' +
                ", from=" + from +
                ", to=" + to +
                '}';
    }
}
