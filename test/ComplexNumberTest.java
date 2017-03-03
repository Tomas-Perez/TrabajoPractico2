import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    @Test
    public void getReal() throws Exception {
        ComplexNumber complex = new ComplexNumber(3,4);
        assertEquals(3,complex.getReal(),0.1);
    }

    @Test
    public void getImaginary() throws Exception {
        ComplexNumber complex = new ComplexNumber(3,4);
        assertEquals(4,complex.getImaginary(),0.1);
    }

    @Test
    public void sum() throws Exception {
        ComplexNumber complex1 = new ComplexNumber(3,4);
        ComplexNumber complex2 = new ComplexNumber(4,5);
        assertTrue(complex1.sum(complex2).equals(new ComplexNumber(7,9)));
    }

    @Test
    public void product() throws Exception {
        ComplexNumber complex1 = new ComplexNumber(3,4);
        ComplexNumber complex2 = new ComplexNumber(4,5);
        assertTrue(complex1.sum(complex2).equals(new ComplexNumber(7,9)));
    }

    @Test
    public void subtract() throws Exception {
        ComplexNumber complex1 = new ComplexNumber(3,4);
        ComplexNumber complex2 = new ComplexNumber(4,5);
        assertTrue(complex1.subtract(complex2).equals(new ComplexNumber(-1,-1)));
    }

    @Test
    public void absoluteValue() throws Exception {
        ComplexNumber complex = new ComplexNumber(-3,-4);
        assertTrue(complex.absoluteValue() == 5);
    }

}