package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatRoom acts as a concrete mediator that facilitates
 * communication between User objects.
 */
public class ChatRoom implements MediatorInterface {
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    /**
     * Adds a user to the chat room.
     * @param user the user to be added
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Sends a message to all users except the sender.
     * @param message the message to send
     * @param user the user sending the message
     */
    @Override
    public void send(String message, User user) {
        for (User u : users) {
            // Don't send the message to the user who sent it
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
