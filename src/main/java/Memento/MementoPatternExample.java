package Memento;

/**
 * The Main class tests the Memento pattern implementation by simulating
 * the usage of TextEditor and History classes to demonstrate undo functionality.
 */
public class MementoPatternExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.setContent("Version 1");
        history.save(textEditor.save());

        textEditor.setContent("Version 2");
        history.save(textEditor.save());

        textEditor.setContent("Version 3");

        System.out.println("Current Content: " + textEditor.getContent()); // Output: Version 3

        textEditor.restore(history.undo());
        System.out.println("After Undo 1: " + textEditor.getContent()); // Output: Version 2

        textEditor.restore(history.undo());
        System.out.println("After Undo 2: " + textEditor.getContent()); // Output: Version 1
    }
}
