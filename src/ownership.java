public class ownership extends edge {
    String ownershipid;
    String date;
    String amount;
    public ownership(String key,String value,vertex from,vertex to,String ownershipid,String date,String amount){
        super(from,to);
        this.ownershipid=ownershipid;
        this.date=date;
        this.amount=amount;
    }
}
