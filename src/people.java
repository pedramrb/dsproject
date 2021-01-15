public class people  extends vertex{
    String firstname;
    String lastname;
    String ssn;
    String birthday;
    String birthplace;
    String workplace;
    public people(String firstname,String lastname,String ssn,String birthday,String birthplace,String workplace){

        this.firstname=firstname;
        this.lastname=lastname;
        this.ssn=ssn;
        this.birthday=birthday;
        this.birthplace=birthplace;
        this.workplace=workplace;
    }

    @Override
    public String toString() {
        return "people{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}
