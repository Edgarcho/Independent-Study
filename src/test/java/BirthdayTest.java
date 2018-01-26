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

    @Test
    public void newBirthday_getMonth_3() throws Exception {
        Birthday testBirthday = new Birthday(1992,3,6);
        assertEquals(3, testBirthday.getMonth());
    }

    @Test
    public void newBirthday_getDay_6() throws Exception {
        Birthday testBirthday = new Birthday(1992,3,6);
        assertEquals(6,testBirthday.getDay());
    }

    @Test
    public void dateFullForm_transformDateintoString_Full() throws Exception {
        Birthday testBirtday = new Birthday(1992,3,6);
        assertEquals("Friday, March 6, 1992", testBirtday.dateFullForm());
    }
}