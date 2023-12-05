package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class LightTest {
    @Test
    public void testSwitchOn() {
        Light light = new Light();
        light.switchOn();
        assertTrue(light.isSwitchedOn());
    }

    @Test
    public void testSwitchOff() {
        Light light = new Light();
        light.switchOn();
        light.switchOff();
        assertTrue(light.isSwitchedOff());
    }

    @Test
    public void testIsSwitchedOn() {
        Light light = new Light();
        light.switchOn();
        assertTrue(light.isSwitchedOn());
    }

    @Test
    public void testIsSwitchedOff() {
        Light light = new Light();
        light.switchOn();
        light.switchOff();
        assertTrue(light.isSwitchedOff());
    }

    @Test
    public void testGetName() {
        Light light = new Light();
        light.setName("Test");
        assertEquals("Test", light.getName());
    }

    @Test
    public void testSetName() {
        Light light = new Light();
        light.setName("Test");
        assertEquals("Test", light.getName());
    }
}
