package Mediator;

/**
 * User class represents a user in the chat room.
 * Each user communicates through the ChatRoom mediator.
 */
public class User {
    private String name;
    private MediatorInterface mediator;

    public User(String name, MediatorInterface mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    /**
     * Sends a message through the mediator.
     * @param message the message to send
     */
    public void send(String message) {
        System.out.println(name + ": Sending Message=" + message);
        mediator.send(message, this);
    }

    /**
     * Receives a message from the mediator.
     * @param message the message received
     */
    public void receive(String message) {
        System.out.println(name + ": Received Message: " + message);
    }
}
