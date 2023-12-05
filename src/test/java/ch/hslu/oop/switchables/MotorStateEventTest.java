package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class MotorStateEventTest {
    @Test
    public void testGetMotorState() {
        MotorStateEvent motorStateEvent1 = new MotorStateEvent(SwitchableState.ON);
        assertEquals(SwitchableState.ON, motorStateEvent1.getMotorState());

        MotorStateEvent motorStateEvent2 = new MotorStateEvent(SwitchableState.OFF);
        assertEquals(SwitchableState.OFF, motorStateEvent2.getMotorState());
    }
}
