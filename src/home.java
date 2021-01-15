public class home extends vertex{
String ssn;
String price;
String postal_code;
String size;
String address;

    public home(String key, String value, String ssn , String price , String postal_code , String size , String address) {
        super(key, value);
        this.ssn = ssn;
        this.price = price;
        this.postal_code = postal_code;
        this.size = size;
        this.address = address;
    }
}
