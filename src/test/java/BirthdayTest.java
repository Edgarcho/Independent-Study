import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/26/18.
 */
public class BirthdayTest {
    @Test
    public void newBirthday_instantiatesCorrectly() throws Exception {
        Birthday testBirthday = new Birthday(1992,3,6);
        assertEquals(true, testBirthday instanceof Birthday);
    }

    @Test
    public void newBirthday_getYear_1992() throws Exception {
        Birthday testBirthday = new Birthday(1992,3,6);
        assertEquals(1992, testBirthday.getYear());
    }
}