import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student John = new Student("AAD5613", 2);

    @Test
    public void getLicense() throws Exception {
        assertEquals("AAD5613", John.getLicense());
    }

    @Test
    public void getCommission() throws Exception {
        assertEquals(2, John.getCommission());
    }

}