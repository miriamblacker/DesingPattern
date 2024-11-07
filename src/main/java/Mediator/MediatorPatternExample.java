package Mediator;

/**
 * Main class to demonstrate the Mediator pattern
 * using the ChatRoom and User classes.
 */
public class MediatorPatternExample {
    public static void main(String[] args) {
        // Create a chat room mediator
        ChatRoom chatRoom = new ChatRoom();

        // Create users
        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Users send messages
        user1.send("Hi everyone!");
        user2.send("Hello Alice!");
        user3.send("Good morning!");
    }
}
