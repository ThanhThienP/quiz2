import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int expected = 3;
        int actual = calculator.sum(1, 2);

        assertEquals(expected, actual, "1 + 2 = 3");
        assertEquals(-5, calculator.sum(-7, 2), "-7 + 2 = -5");
        assertEquals(15, calculator.sum(15, 0), "15 + 0 = 15");
    }

    @Test
    public void testSubtract() {
        int expected = 5;
        int actual = calculator.subtract(7, 2);
        assertEquals(expected, actual, "7-2 = 5");

        assertEquals(-5, calculator.subtract(2, 7), "2 - 7 = -5");
        assertEquals(-9, calculator.subtract(-7, 2), "-7 - 2 = -9");
    }

    @Test
    public void testMultiply() {
        int expected = 15;
        int actual = calculator.multiply(5, 3);
        assertEquals(expected, actual, "5*3 = 15");

        assertEquals(0, calculator.multiply(35, 0), "35*0 = 0");
        assertEquals(-15, calculator.multiply(-5, 3), "-5 * 3 = -15");
    }

    @Test
    public void testDivide() {
        int expected = 6;
        int actual = calculator.divide(18, 3);
        assertEquals(expected, actual, "18/3 = 6");

        assertEquals(-6, calculator.divide(-18, 3), "-18 / 3 = -6");
        assertEquals(0, calculator.divide(0, 5), "0 / 5 = 0");
    }

    @Test
    public void testIsEven() {
        int number = 19;
        boolean result = calculator.isEven(number);
        assertEquals(result, false);

        assertTrue(calculator.isEven(20), "20 is even");
        assertTrue(calculator.isEven(0), "0 is even");
        assertTrue(calculator.isEven(-4), "-4 is even");
    }

    @Test
    public void testIsOdd() {
        assertFalse(calculator.isEven(19), "19 is odd");
        assertFalse(calculator.isEven(11), "11 is odd");
        assertFalse(calculator.isEven(-3), "-3 is odd");
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
        String expectedMessage = "Ints cannot be divided by zero";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
