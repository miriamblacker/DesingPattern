package Mediator;

/**
 * Mediator interface that defines communication methods
 * for the colleagues.
 */
public interface MediatorInterface {
    void send(String message, User user);
}
