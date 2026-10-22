import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"
    })
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    public void testDoesNotHas31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        assertFalse(
                dateChecker.has31Days(DateChecker.Month.FEBRUARY),
                "FEBRUARY is explicitly handled and should return false");
    }

    @Test
    public void testNullMonthThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> dateChecker.has31Days(null),
                "Passing null should throw an IllegalArgumentException");
    }
}
