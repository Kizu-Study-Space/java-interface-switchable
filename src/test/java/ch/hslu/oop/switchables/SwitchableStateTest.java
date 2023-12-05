package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchableStateTest {
    @Test
    public void testON() {
        SwitchableState state = SwitchableState.ON;
        assertEquals(SwitchableState.ON, state);

        state = SwitchableState.OFF;
        assertEquals(SwitchableState.OFF, state);
    }
}
