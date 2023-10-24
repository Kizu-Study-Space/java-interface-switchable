package ch.hslu.oop.switchables;

public class Vehicle implements Switchable, Nameable {

    private final Motor motor;
    private final Wheel frontRightWheel;
    private final Wheel frontLeftWheel;
    private final Wheel backRightWheel;
    private final Wheel backLeftWheel;
    private final Light leftLight;
    private final Light rightLight;
    private String name;

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
        this.motor.switchOff();
        this.leftLight.switchOff();
        this.rightLight.switchOff();
        this.isRunning = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return isRunning;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isRunning;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
