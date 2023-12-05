package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public final class MotorTest {

    @Test
    public void testGetIdleGas() {
        Motor motor = new Motor(1000, 5000);
        assertEquals(1000, motor.getIdleGas());
    }

    @Test
    public void testGetMaxRpm() {
        Motor motor = new Motor(1000, 5000);
        assertEquals(5000, motor.getMaxRpm());
    }

    @Test
    public void testGetCurrentRpm() {
        Motor motor = new Motor(1000, 5000);
        assertEquals(0, motor.getCurrentRpm());
    }

    @Test
    public void testSwitchOn() {
        Motor motor = new Motor(1000, 5000);
        motor.switchOn();
        assertEquals(1000, motor.getCurrentRpm());
    }

    @Test
    public void testSwitchOff() {
        Motor motor = new Motor(1000, 5000);
        motor.switchOn();
        motor.switchOff();
        assertEquals(0, motor.getCurrentRpm());
    }

    @Test
    public void testSwitchedOn() {
        Motor motor = new Motor(1000, 5000);
        motor.switchOn();
        assertTrue(motor.isSwitchedOn());
    }

    @Test
    public void testSwitchedOff() {
        Motor motor = new Motor(1000, 5000);
        motor.switchOn();
        motor.switchOff();
        assertTrue(motor.isSwitchedOff());
    }

    @Test
    public void testGetSwitchCount() {
        Motor motor = new Motor(1000, 5000);
        motor.switchOn();
        motor.switchOff();
        assertEquals(2, motor.getSwitchCount());
    }

    @Test
    public void testGetName() {
        Motor motor = new Motor(1000, 5000);
        motor.setName("Test");
        assertEquals("Test", motor.getName());
    }

    @Test
    public void testSetName() {
        Motor motor = new Motor(1000, 5000);
        motor.setName("Test");
        assertEquals("Test", motor.getName());
    }

    @Test
    public void testGetState() {
        Motor motor = new Motor(1000, 5000);
        assertEquals(SwitchableState.OFF, motor.getState());
        motor.switchOn();
        assertEquals(SwitchableState.ON, motor.getState());
        motor.switchOff();
        assertEquals(SwitchableState.OFF, motor.getState());
    }
}
