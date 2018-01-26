import java.text.DateFormat;
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
        */
        //Using DateFormat class
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        String s = df.format(now);
        System.out.println("Today is" + s);
    }
}
