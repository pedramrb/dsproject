public class car extends vertex{
String plate;
String ssn;
String model;
String color;

    public car(String key, String value , String plate , String ssn , String model , String color) {
        super(key, value);
        this.plate = plate;
        this.ssn = ssn;
        this.model = model;
        this.color = color;
    }
}
