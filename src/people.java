public class people  extends vertex{
    String firstname;
    String lastname;
    String ssn;
    String birthday;
    String birthplace;
    String workaddress;
    public people(String key,String value,String firstname,String lastname,String ssn,String birthday,String birthplace,String workaddress){
        super(key,value);
        this.firstname=firstname;
        this.lastname=lastname;
        this.ssn=ssn;
        this.birthday=birthday;
        this.birthplace=birthplace;
        this.workaddress=workaddress;
    }
}
