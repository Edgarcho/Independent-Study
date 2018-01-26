import javax.imageio.IIOException;
import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Guest on 1/26/18.
 */
public class time {
    public static void main(String[] args) {
        //Using Date class
        /*  Date now = new Date();
        long nowLong = now.getTime();
        System.out.println("Value is " + nowLong);

        //Using DateFormat class
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        System.out.println("Today is " + s);
        System.out.println("Today is " + s1);
        System.out.println("Today is " + s2);
        System.out.println("Today is " + s3);
        System.out.println("Today is " + s4);
        */
     GregorianCalendar firstFlight = new GregorianCalendar(1903, Calendar.DECEMBER, 17);
     //GregorianCalendar secondFlight = new GregorianCalendar(1903,11,17);
    Date d = firstFlight.getTime();
    DateFormat df = DateFormat.getDateInstance();
    String s = df.format(d);
    System.out.println("Today is " + s);

    }
}
