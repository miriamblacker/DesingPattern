package Interpreter;

/**
 * AbstractExpression defines the method interpret which all terminal and non-terminal
 * expressions must implement.
 */
public interface Expression {
    /**
     * Interprets the given context and returns the result as an integer.
     *
     * @param context the context containing the Roman numeral string
     * @return the interpreted integer value
     */
    int interpret(Context context);
}
