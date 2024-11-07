package Interpreter;

/**
 * NonTerminalExpression interprets combinations of Roman numerals, such as IV or IX.
 */
public class NonTerminalExpression implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public NonTerminalExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
