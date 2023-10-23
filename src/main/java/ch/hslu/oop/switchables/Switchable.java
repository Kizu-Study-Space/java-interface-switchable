package ch.hslu.oop.switchables;

/**
* Interface for implementing objects that can have a running state. Switch them off and on.
*/
public interface Switchable {

  /**
   * Switches an object on into a running state.
   */
  void switchOn();

  /**
   * Switches an object off.
   */
  void switchOff();

  /**
   * Tells if the object is switched on.
   * 
   * @return boolean
   */
  boolean isSwitchedOn();

  /**
   * Tells if the object is switched off.
   * 
   * @return boolean
   */
  boolean isSwitchedOff();
}
