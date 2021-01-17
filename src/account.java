import java.util.ArrayList;
import java.util.HashMap;

public class account extends vertex{
String ssn;
String bank_name;
String IBAN;
String account_id;
ArrayList<String> fromtransactionkeys;
ArrayList<String> totransactionkeys;
    public account(){

    }
    public account(String ssn , String bank_name, String IBAN , String account_id) {
        this.ssn = ssn;
        this.bank_name = bank_name;
        this.IBAN = IBAN;
        this.account_id =account_id;
        fromtransactionkeys=new ArrayList<String>();
        totransactionkeys=new ArrayList<String>();
    }
    public void addfromtransactionkey(String transactionid){
        fromtransactionkeys.add(transactionid);
    }
    public void addtotransactionkey(String transactionid){
        totransactionkeys.add(transactionid);
    }

    public ArrayList<String> getFromtransactionkeys() {
        return fromtransactionkeys;
    }

    public ArrayList<String> getTotransactionkeys() {
        return totransactionkeys;
    }

    @Override
    public String toString() {
        return "account{" +
                "ssn='" + ssn + '\'' +
                ", bank_name='" + bank_name + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", account_id='" + account_id + '\'' +
                '}';
    }
}
