package ch.hslu.oop.switchables;

public final class Motor implements CountingSwitchable, Nameable {

    private String name;
    private int currentRpm;
    private final int idleGas;
    private final int maxRpm;
    private long switchCount;
    private SwitchableState state;

    public Motor(final int idleGas, final int maxRpm) {
        this.currentRpm = 0;
        this.idleGas = idleGas;
        this.maxRpm = maxRpm;
        this.switchCount = 0;
        this.state = SwitchableState.OFF;
    }

    public Motor () {
        this(1000, 5000);
    }

    public SwitchableState getState() {
        return this.state;
    }

    @Override
    public void switchOn() {
        this.currentRpm = this.idleGas;
        this.switchCount++;
        this.state = SwitchableState.ON;
    }

    @Override
    public void switchOff() {
        this.currentRpm = 0;
        this.switchCount++;
        this.state = SwitchableState.OFF;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
