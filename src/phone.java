public class phone extends vertex{
String ssn;
String number;
String operator;

    public phone(String key, String value , String ssn , String number , String operator) {
        super(key, value);
        this.ssn = ssn;
        this.number = number;
        this.operator = operator;
    }
}
