package org.example;

import SingletonExample.Logger;

/**
 * The Main class demonstrates the usage of the Logger Singleton.
 */
public class Main {

    /**
     * The main method creates a single instance of Logger and logs a sample message.
     *
     * @param args command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a log message.");
    }
}
