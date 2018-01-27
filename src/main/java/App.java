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

        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our program. Would you like to check it out? Enter: yes or no");
            try {
                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("yes")) {
                    System.out.println("What year were you born?");
                    String userYear = bufferedReader.readLine();
                    System.out.println("What month were you born?");
                    String userMonth = bufferedReader.readLine();
                    System.out.println("What day were you born?");
                    String userDay = bufferedReader.readLine();
                    int intUserYear = Integer.parseInt(userYear);
                    int intUserMonth = Integer.parseInt(userMonth);
                    int intUserDay = Integer.parseInt(userDay);
                    Birthday newBirthday = new Birthday(intUserYear, intUserMonth, intUserDay);
                    System.out.println("You were born on " + newBirthday.dateFullForm());
                } else if (navigationChoice.equals("no")) {
                    System.out.println("Goodbye!");
                    programRunning = false;
                } else {
                    System.out.println("I'm sorry, we don't recognize your input");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
