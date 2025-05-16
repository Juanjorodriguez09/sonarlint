package com.example.app;

import java.util.logging.Logger;

public class UserService {
    Logger logger = Logger.getLogger(getClass().getName());

    public void processUser(String name) {
        String userName;
        if (name != null) {
            userName = name.toUpperCase();
        } else {
            userName = "Unknown";
        }
        logger.info(String.format("User: %s", userName));
    }

    public void doNothing() {
        // Método vacío
    }

    public void longMethod() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        if (total > 0) {
            logger.info(String.format("Total sum: %d", total));
        }
    }
}