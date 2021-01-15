public class ownership extends edge {
    String ownershipid;
    String date;
    String amount;
    public ownership(String key,String value,vertex from,vertex to,String ownershipid,String date,String amount){
        this.key=key;
        this.value=value;
        this.from=from;
        this.to=to;
        this.ownershipid=ownershipid;
        this.date=date;
        this.amount=amount;
    }
}
