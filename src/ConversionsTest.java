import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionsTest {
    Conversions conversions = new Conversions();

    Conversions converter = new Conversions();

    // test euroToDollar - pos, neg, zero
    @Test
    public void euroToDollar() {
        // positive
        assertEquals(11.0, converter.euroToDollar(10.0), 0.01);
        // negative
        assertEquals(-5.5, converter.euroToDollar(-5.0), 0.01);
        // zero
        assertEquals(0.0, converter.euroToDollar(0.0), 0.01);
    }

    // test dollarToEuro - pos, neg, zero
    @Test
    public void dollarToEuro() {
        // positive
        assertEquals(10.0, converter.dollarToEuro(11.0), 0.01);
        // negative
        assertEquals(-5.0, converter.dollarToEuro(-5.5), 0.01);
        // zero
        assertEquals(0.0, converter.dollarToEuro(0.0), 0.01);
    }

    // test stringToInteger - pos, neg, null
    @Test
    public void stringToInteger() {
        // positive string
        assertEquals(150, converter.stringToInteger("150"));
        // negative string
        assertEquals(-42, converter.stringToInteger("-42"));
        // null string
        assertThrows(NumberFormatException.class, () -> {
            converter.stringToInteger(null);
        });
    }

    // test integerToString - pos, neg, zero
    @Test
    public void integerToString() {
        // positive
        assertEquals("99", converter.integerToString(99));
        // negative
        assertEquals("-99", converter.integerToString(-99));
        // zero
        assertEquals("0", converter.integerToString(0));
    }


}