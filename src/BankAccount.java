public class BankAccount extends vertex{
String ssn;
String bank_name;
String IBAN;
String account_id;

    public BankAccount(String key, String value, String ssn ,String bank_name,String IBAN ,String account_id) {
        super(key, value);
        this.ssn = ssn;
        this.bank_name = bank_name;
        this.IBAN = IBAN;
        this.account_id =account_id;
    }
}
