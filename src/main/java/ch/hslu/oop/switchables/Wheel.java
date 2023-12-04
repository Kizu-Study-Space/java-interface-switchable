package ch.hslu.oop.switchables;

public final class Wheel implements Nameable {
    private double currentAirPressure;
    private String name;

    public Wheel() {
        this.currentAirPressure = 2.5;
    }

    public void inflateBy(double addedPressure) {
        this.currentAirPressure += addedPressure;
    }

    public void deflateBy(double lostPressure) {
        this.currentAirPressure -= lostPressure;
    }

    public double getCurrentAirPressure() {
        return this.currentAirPressure;
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
