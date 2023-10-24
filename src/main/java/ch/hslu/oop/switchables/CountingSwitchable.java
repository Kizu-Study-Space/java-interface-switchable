package ch.hslu.oop.switchables;

public interface CountingSwitchable extends Switchable {

    /**
     * Returns the number of times the object has been switched on or off.
     *
     * @return long
     */
    long getSwitchCount();
}
