import java.time.LocalDate;
import java.util.ArrayList;

public class people  extends vertex{
    String firstname;
    String lastname;
    String ssn;
    LocalDate birthday;
    String birthplace;
    String workplace;
    ArrayList<String> accountkeys;
    ArrayList<String> family;
    public people(String firstname,String lastname,String ssn,String birthday,String birthplace,String workplace){

        this.firstname=firstname;
        this.lastname=lastname;
        this.ssn=ssn;
        this.birthday=LocalDate.parse(birthday);
        this.birthplace=birthplace;
        this.workplace=workplace;
        accountkeys=new ArrayList<String>();
        family=new ArrayList<String>();
    }
    public void addacountkey(String accountid){
        accountkeys.add(accountid);
    }

    public ArrayList<String> getAccountkeys() {
        return accountkeys;
    }
    public void addfamily(String peoplessn){
        family.add(peoplessn);
    }

    public ArrayList<String> getFamily() {
        return family;
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
