package Interpreter;

/**
 * Context holds the input Roman numeral string and helps in the interpretation process.
 */
public class Context {
    private final String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
