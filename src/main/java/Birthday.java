import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Guest on 1/26/18.
 */
public class Birthday {
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay(){
        return day;
    }
    public String dateFullForm(){
        GregorianCalendar bday = new GregorianCalendar(getYear(),getMonth(),getDay());
        Date d = bday.getTime();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
        String s1 = df1.format(d);
        return s1;
    }
}
