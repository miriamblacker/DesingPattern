package Interpreter;

/**
 * The client class that uses the Interpreter pattern to convert Roman numerals into integers.
 */
public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Create context for the input
        Context context = new Context("MCMXCIV");

        // Build the parse tree for the Roman numeral expressions
        Expression expression = new NonTerminalExpression(
                new TerminalExpression("M", 1000),
                new NonTerminalExpression(
                        new TerminalExpression("CM", 900),
                        new NonTerminalExpression(
                                new TerminalExpression("XC", 90),
                                new NonTerminalExpression(
                                        new TerminalExpression("IV", 4),
                                        new TerminalExpression("I", 1)
                                )
                        )
                )
        );

        // Interpret the input and display the output
        int result = expression.interpret(context);
        System.out.println("The decimal value of " + context.getInput() + " is: " + result);
    }
}
