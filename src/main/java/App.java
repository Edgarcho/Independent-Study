import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Birthday;

/**
 * Created by Guest on 1/26/18.
 */
public class App {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What year were you born?");
            String userYear = bufferedReader.readLine();
            System.out.println("What month were you born?");
            String userMonth = bufferedReader.readLine();
            System.out.println("What day were you born?");
            String userDay = bufferedReader.readLine();
            int intUserYear = Integer.parseInt(userYear);
            int intUserMonth = Integer.parseInt(userMonth);
            int intUserDay = Integer.parseInt(userDay);
            Birthday newBirthday = new Birthday(intUserYear,intUserMonth,intUserDay);
            System.out.println(newBirthday.dateFullForm());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }


}
