package ch.hslu.oop.switchables;

public class Vehicle implements Switchable {

    private final Motor motor;
    private final Wheel frontRightWheel;
    private final Wheel frontLeftWheel;
    private final Wheel backRightWheel;
    private final Wheel backLeftWheel;
    private final Light leftLight;
    private final Light rightLight;

    private boolean isRunning;

    public Vehicle(Motor motor, Wheel frontRightWheel, Wheel frontLeftWheel, Wheel backRightWheel, Wheel backLeftWheel, Light leftLight, Light rightLight) {
        this.motor = motor;
        this.frontRightWheel = frontRightWheel;
        this.frontLeftWheel = frontLeftWheel;
        this.backRightWheel = backRightWheel;
        this.backLeftWheel = backLeftWheel;
        this.leftLight = leftLight;
        this.rightLight = rightLight;
        this.isRunning = false;
    }

    @Override
    public void switchOn() {
        this.motor.switchOn();
        this.leftLight.switchOn();
        this.rightLight.switchOn();
        this.isRunning = true;
    }

    @Override
    public void switchOff() {

    }

    @Override
    public boolean isSwitchedOn() {
        return false;
    }

    @Override
    public boolean isSwitchedOff() {
        return false;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public Wheel getFrontRightWheel() {
        return this.frontRightWheel;
    }

    public Wheel getFrontLeftWheel() {
        return this.frontLeftWheel;
    }

    public Wheel getBackRightWheel() {
        return this.backRightWheel;
    }

    public Wheel getBackLeftWheel() {
        return this.backLeftWheel;
    }

    public Light getLeftLight() {
        return this.leftLight;
    }

    public Light getRightLight() {
        return this.rightLight;
    }
}
