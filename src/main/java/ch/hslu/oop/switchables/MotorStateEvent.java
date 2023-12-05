package ch.hslu.oop.switchables;

public final class MotorStateEvent {

    private final SwitchableState motorState;

    public MotorStateEvent(SwitchableState motorState) {
        this.motorState = motorState;
    }

    public SwitchableState getMotorState() {
        return motorState;
    }
}
