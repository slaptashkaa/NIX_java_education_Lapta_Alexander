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

        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = scan.nextInt();
        int remainder5 = scan.nextInt();
        int remainder7 = scan.nextInt();

        int your_age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!", your_age);
    }
}
