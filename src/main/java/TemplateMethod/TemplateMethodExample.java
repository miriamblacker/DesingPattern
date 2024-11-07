package TemplateMethod;

/**
 * Main class to demonstrate the Template Method design pattern.
 */
public class TemplateMethodExample {

    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();  // Demonstrates the Chess game flow

        System.out.println();

        Game soccer = new Soccer();
        soccer.play();  // Demonstrates the Soccer game flow
    }
}
