import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/26/18.
 */
public class BirthdayTest {
    @Test
    public void newAge_instantiatesCorrectly() throws Exception {
        Birthday testBirthday = new Birthday(1992,3,6);
        assertEquals(true, testBirthday instanceof Birthday);
    }
}