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

    @Test
    public void testIsEven() {
        int number = 19;
        boolean result = calculator.isEven(number);
        assertEquals(result, false);

        assertTrue(calculator.isEven(20));
    }

    @Test
    public void testIsOdd() {
        assertFalse(calculator.isEven(19));
    }

    @Test
    public void testIncrementArrays() {
        int[] expected = new int[] { 7, 9, 4 };
        int[] actual = calculator.incrementArrays(new int[] { 6, 8, 3 });

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0));
        String expectedMessage = "Ints cannot be divded by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
