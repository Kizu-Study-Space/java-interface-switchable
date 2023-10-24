package ch.hslu.oop.switchables;

public class Motor implements CountingSwitchable {

    private int currentRpm;
    private final int idleGas;
    private final int maxRpm;
    private long switchCount;

    public Motor(final int idleGas, final int maxRpm) {
        this.currentRpm = 0;
        this.idleGas = idleGas;
        this.maxRpm = maxRpm;
        this.switchCount = 0;
    }

    public Motor () {
        this(1000, 5000);
    }

    @Override
    public void switchOn() {
        this.currentRpm = this.idleGas;
        this.switchCount++;
    }

    @Override
    public void switchOff() {
        this.currentRpm = 0;
        this.switchCount++;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.currentRpm > 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return !this.isSwitchedOn();
    }

    @Override
    public long getSwitchCount() {
        return this.switchCount;
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
