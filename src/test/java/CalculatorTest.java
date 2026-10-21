import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int expected = 3;
        int actual = calculator.add(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 5;
        int actual = calculator.subtract(7, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 15;
        int actual = calculator.multiply(5, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 6;
        int actual = calculator.divide(18, 3);
        assertEquals(expected, actual);
    }

}
