package ch.hslu.oop.switchables;

public class Motor implements Switchable {

    private int currentRpm;
    private final int idleGas;
    private final int maxRpm;

    public Motor(final int idleGas, final int maxRpm) {
        this.currentRpm = 0;
        this.idleGas = idleGas;
        this.maxRpm = maxRpm;
    }

    public Motor () {
        this(1000, 5000);
    }

    @Override
    public void switchOn() {
        this.currentRpm = this.idleGas;
    }

    @Override
    public void switchOff() {
        this.currentRpm = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.currentRpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !this.isSwitchedOn();
    }

    public int getCurrentRpm() {
        return this.currentRpm;
    }

    public int getIdleGas() {
        return idleGas;
    }

    public int getMaxRpm() {
        return maxRpm;
    }
}
