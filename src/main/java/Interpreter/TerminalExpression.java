package Interpreter;

/**
 * TerminalExpression interprets a single Roman numeral and returns its decimal equivalent.
 */
public class TerminalExpression implements Expression {
    private final String roman;
    private final int value;

    public TerminalExpression(String roman, int value) {
        this.roman = roman;
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        while (context.getInput().startsWith(roman)) {
            context.setOutput(context.getOutput() + value);
            context = new Context(context.getInput().substring(roman.length()));
        }
        return context.getOutput();
    }
}
