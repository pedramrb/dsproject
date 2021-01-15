public class home extends vertex{
String ssn;
String price;
String postal_code;
String size;
String address;

    public home( String ssn , String price , String postal_code , String size , String address) {

        this.ssn = ssn;
        this.price = price;
        this.postal_code = postal_code;
        this.size = size;
        this.address = address;
    }

    @Override
    public String toString() {
        return "home{" +
                "ssn='" + ssn + '\'' +
                ", price='" + price + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", size='" + size + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
