package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WheelTest {
    @Test
    public void testGetCurrentAirPressure() {
        Wheel wheel = new Wheel();
        assertEquals(2.5, wheel.getCurrentAirPressure());
    }

    @Test
    public void testInflateBy() {
        Wheel wheel = new Wheel();
        wheel.inflateBy(0.2);
        assertEquals(2.7, wheel.getCurrentAirPressure());
    }

    @Test
    public void testDeflateBy() {
        Wheel wheel = new Wheel();
        wheel.deflateBy(0.5);
        assertEquals(2.0, wheel.getCurrentAirPressure());
    }
}
