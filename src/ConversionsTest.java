import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionsTest {
    Conversions conversions = new Conversions();

    Conversions converter = new Conversions();

    @Test
    public void euroToDollar() {
        // positive
        assertEquals(11.0, converter.euroToDollar(10.0), 0.01);
        // negative
        assertEquals(-5.5, converter.euroToDollar(-5.0), 0.01);
        // zero
        assertEquals(0.0, converter.euroToDollar(0.0), 0.01);
    }
}