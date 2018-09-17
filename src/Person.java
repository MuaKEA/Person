import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Person {
    protected String name;
    protected String cpr;

    public Person(String name,String cpr){
    this.name=name;
    this.cpr=cpr;

    }
public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCpr() {
        String s = cpr.substring(4,6);
    String a = cpr.substring(7,11);
    Calendar today = Calendar.getInstance();
    String date = today.get(Calendar.YEAR)+ "";

    int alderudregning;
    int år=Integer.parseInt(s);
    int åretnu=Integer.parseInt(date);
    int b= Integer.parseInt(a);

        if(b>=4000) {
        alderudregning = år + 2000;
    }else
    alderudregning=år +1900;
    String alder = String.valueOf(åretnu - alderudregning);

        return alder;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }


}
