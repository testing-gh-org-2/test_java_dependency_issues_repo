package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main application class demonstrating the use of vulnerable Log4j dependency.
 * This project contains Log4j 2.14.1 which has the critical CVE-2021-44228 vulnerability.
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");
        
        String message = "Hello, World!";
        logger.info("Message: {}", message);
        
        logger.info("Application finished");
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
}
