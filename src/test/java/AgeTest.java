import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/26/18.
 */
public class AgeTest {
    @Test
    public void newAge_instantiatesCorrectly() throws Exception {
        Age testAge = new Age(1992,3,6);
        assertEquals(true, testAge instanceof Age);
    }
}