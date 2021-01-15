import java.time.LocalDate;
import java.time.Period;

public class ownership extends edge {
    String ownershipid;
    LocalDate date;
    String amount;
    public ownership(people from,car to,String ownershipid,String date,String amount){
        super(from,to);
        this.ownershipid=ownershipid;
        this.date=LocalDate.parse(date);
        this.amount=amount;
    }
    public boolean isnear(LocalDate then){
        if(Math.abs(Period.between(date,then).getYears())>2){
            return false;
        }
        return true;
    }
}
