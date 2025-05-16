package com.example.app;
import java.util.logging.Logger;

class App {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(App.class.getName());
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        // Suma (siempre segura)
        logger.info(String.format("Sum: %d", calculator.sum(a, b)));

        // División solo si no es cero
        if (b != 0) {
            logger.info(String.format("Division: %d", calculator.divide(a, b)));
        } else {
            logger.info("Division: Cannot divide by zero");
        }

        for (int i = 0; i < 3; i++) {
            logger.info(String.format("Iteration: %d", i));
        }

        UserService userService = new UserService();
        userService.processUser(null); // Posible NPE - No se corrige aquí
    }
}