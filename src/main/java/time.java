import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Guest on 1/26/18.
 */
public class time {
    public static void main(String[] args) {
        Date now = new Date();
        long nowLong = now.getTime();
        System.out.println("Value is " + nowLong);
    }
}
