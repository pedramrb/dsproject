public class ownership extends edge {
    String ownershipid;
    String date;
    String amount;
    public ownership(people from,home to,String ownershipid,String date,String amount){
        super(from,to);
        this.ownershipid=ownershipid;
        this.date=date;
        this.amount=amount;
    }
    public ownership(people from,car to,String ownershipid,String date,String amount){
        super(from,to);
        this.ownershipid=ownershipid;
        this.date=date;
        this.amount=amount;
    }
}
