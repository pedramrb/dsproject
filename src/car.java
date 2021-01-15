public class car extends vertex{
String plate;
String ssn;
String model;
String color;

    public car( String plate , String ssn , String model , String color) {

        this.plate = plate;
        this.ssn = ssn;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "car{" +
                "plate='" + plate + '\'' +
                ", ssn='" + ssn + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
