package Bridge;

/**
 * Interface representing different models of remote-controlled cars.
 * Defines methods for specifying car features like speed and color.
 */
public interface CarModel {
    String getColor();
    int getSpeed();
}
