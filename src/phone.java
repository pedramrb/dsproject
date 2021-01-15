public class phone extends vertex{
String ssn;
String number;
String operator;

    public phone( String ssn , String number , String operator) {

        this.ssn = ssn;
        this.number = number;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "phone{" +
                "ssn='" + ssn + '\'' +
                ", number='" + number + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
