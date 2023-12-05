package ch.hslu.oop.switchables;

public final class Light implements Switchable, Nameable {

    private SwitchableState state;
    private String name;

    public Light() {
        this.state = SwitchableState.OFF;
    }

    @Override
    public void switchOn() {
        this.state = SwitchableState.ON;
    }

    @Override
    public void switchOff() {
        this.state = SwitchableState.OFF;
    }

    @Override
    public boolean isSwitchedOn() {
        return state == SwitchableState.ON;
    }

    @Override
    public boolean isSwitchedOff() {
        return state == SwitchableState.OFF;
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
