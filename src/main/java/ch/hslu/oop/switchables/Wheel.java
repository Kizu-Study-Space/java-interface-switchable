package ch.hslu.oop.switchables;

public class Wheel {
    private double currentAirPressure;

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
}
