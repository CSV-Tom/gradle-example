package app;

import java.util.Scanner;

public class Console {
    final static Scanner scanner = new Scanner(System.in);

    int readInteger(String text) {
        do {
            write(text);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                // Clear invalid input.
                scanner.next();
            }
        } while (true);
    }

    void write(String text) {
        System.out.println(text);
    }
}
