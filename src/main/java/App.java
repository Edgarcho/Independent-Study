import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/26/18.
 */
public class App {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();
            System.out.println(inputString);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


}
