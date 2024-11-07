import SingletonExample.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    /**
     * Tests that only one instance of Logger is created.
     */
    @Test
    public void testSingletonInstance() {

        Logger instance1 = Logger.getInstance();
        Logger instance2 = Logger.getInstance();

        // Check if both instances point to the same object
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    /**
     * Tests that the log method outputs the correct message format.
     */
    @Test
    public void testLogMethod() {
        Logger logger = Logger.getInstance();

        // Redirect System.out to capture output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        String testMessage = "This is a test log message.";
        logger.log(testMessage);

        // Check if output is as expected
        assertEquals("Log: " + testMessage + System.lineSeparator(), outContent.toString(),
                "The log output should match the expected format");
    }
}
