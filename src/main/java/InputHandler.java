package com.cards;

public class InputHandler {

    public static void readInput() {
        while (true) {

            System.out.print("Enter something : ");
            String input = System.console().readLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }
    }
}
