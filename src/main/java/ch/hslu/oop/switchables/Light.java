package ch.hslu.oop.switchables;

public class Light implements Switchable, Nameable {

    private boolean isRunning;
    private String name;

    public Light() {
        this.isRunning = false;
    }

    @Override
    public void switchOn() {
        this.isRunning = true;
    }

    @Override
    public void switchOff() {
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
