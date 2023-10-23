package ch.hslu.oop.switchables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    public void testGetMotor() {
        Motor motor = new Motor(1000, 5000);
        Vehicle vehicle = new Vehicle(motor, new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        assertEquals(motor, vehicle.getMotor());
    }

    public void testGetFrontRightWheel() {
        Wheel wheel = new Wheel();
        Vehicle vehicle = new Vehicle(new Motor(), wheel, new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        assertEquals(wheel, vehicle.getFrontRightWheel());
    }

    public void testGetFrontLeftWheel() {
        Wheel wheel = new Wheel();
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), wheel, new Wheel(), new Wheel(), new Light(), new Light());
        assertEquals(wheel, vehicle.getFrontLeftWheel());
    }

    public void testGetBackRightWheel() {
        Wheel wheel = new Wheel();
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), wheel, new Wheel(), new Light(), new Light());
        assertEquals(wheel, vehicle.getBackRightWheel());
    }

    public void testGetBackLeftWheel() {
        Wheel wheel = new Wheel();
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), new Wheel(), wheel, new Light(), new Light());
        assertEquals(wheel, vehicle.getBackLeftWheel());
    }

    public void testGetLeftLight() {
        Light light = new Light();
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), light, new Light());
        assertEquals(light, vehicle.getLeftLight());
    }

    public void testGetRightLight() {
        Light light = new Light();
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), light);
        assertEquals(light, vehicle.getRightLight());
    }

    public void testSwitchOn() {
        Motor motor = new Motor(1000, 5000);
        Vehicle vehicle = new Vehicle(motor, new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        vehicle.switchOn();
        assertEquals(1000, motor.getCurrentRpm());
        assertTrue(vehicle.getLeftLight().isSwitchedOn());
        assertTrue(vehicle.getRightLight().isSwitchedOn());
        assertTrue(vehicle.isSwitchedOn());
    }

    public void testIsSwitchedOff() {
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        assertTrue(vehicle.isSwitchedOff());
        vehicle.switchOn();
        assertFalse(vehicle.isSwitchedOff());
    }

    public void testIsSwitchedOn() {
        Vehicle vehicle = new Vehicle(new Motor(), new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        assertFalse(vehicle.isSwitchedOn());
        vehicle.switchOn();
        assertTrue(vehicle.isSwitchedOn());
    }

    public void testSwitchOff () {
        Motor motor = new Motor(1000, 5000);
        Vehicle vehicle = new Vehicle(motor, new Wheel(), new Wheel(), new Wheel(), new Wheel(), new Light(), new Light());
        vehicle.switchOff();
        assertEquals(0, motor.getCurrentRpm());
        assertTrue(vehicle.getLeftLight().isSwitchedOff());
        assertTrue(vehicle.getRightLight().isSwitchedOff());
        assertTrue(vehicle.isSwitchedOff());
    }
}
