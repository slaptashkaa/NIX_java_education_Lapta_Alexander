package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        final String bot_name = "Aboba";
        final int birth_year = 2021;

        System.out.printf("Hello, my name is %s\n" +
                "I was created in %d\n", bot_name, birth_year);

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, remind me your name.");

        String your_name = scan.nextLine();
        System.out.printf("What a great name you have, %s!", your_name);
    }
}
