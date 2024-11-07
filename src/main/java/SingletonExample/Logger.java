package SingletonExample;

/**
 * The Logger class is implemented as a Singleton to ensure that only one instance
 * of the logger exists throughout the application. It provides a global access
 * point to log messages in a consistent manner.
 */
public class Logger {

    /**
     * The single instance of the Logger class.
     */
    private static Logger instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private Logger() {}

    /**
     * Returns the single instance of the Logger class. If the instance is not
     * already created, it creates one. Ensures synchronized access for thread safety.
     *
     * @return the single instance of Logger
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Logs a message by printing it to the console with a "Log:" prefix.
     *
     * @param message the message to be logged
     */
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

