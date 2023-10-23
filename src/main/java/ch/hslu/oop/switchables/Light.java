package ch.hslu.oop.switchables;

public class Light implements Switchable {

    private boolean isRunning;

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
}
