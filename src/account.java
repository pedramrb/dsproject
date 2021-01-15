public class account extends vertex{
String ssn;
String bank_name;
String IBAN;
String account_id;

    public account(String ssn , String bank_name, String IBAN , String account_id) {
        this.ssn = ssn;
        this.bank_name = bank_name;
        this.IBAN = IBAN;
        this.account_id =account_id;
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
