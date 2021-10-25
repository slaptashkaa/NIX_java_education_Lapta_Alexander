package nix.education.java.chatbot;

import java.util.Random;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        welcomeMessage();
        remaindName();
        remaindAge();
        numberOutput();
        testAnswer();
    }

    public static void welcomeMessage() {
        final String bot_name = "Aboba";
        final int birth_year = 2021;
        System.out.printf("Hello, my name is %s\n" +
                "I was created in %d\n", bot_name, birth_year);
    }

    public static void remaindName() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, remind me your name.");

        String your_name = scan.nextLine();
        System.out.printf("What a great name you have, %s!", your_name);
    }

    public static void remaindAge() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");

        final int remainder3 = scan.nextInt();
        final int remainder5 = scan.nextInt();
        final int remainder7 = scan.nextInt();

        int your_age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %d; that's a good time to start programming!\n", your_age);
    }

    public static void numberOutput () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Now I Will prove to you that I can count to any number you want.");

        final int number = scan.nextInt();
        int i = 0;

        while (number >= i) {
            System.out.println(i + "!");
            i++;
        }
    }

    public static void testAnswer() {
        Scanner scan = new Scanner(System.in);
        int isTrueAnswer = 0;

        while ( isTrueAnswer == 0 ) {
            int trueAnswer = new Random().nextInt(4) + 1;

            switch (trueAnswer) {
                case 1:
                    System.out.println("What programming language is this program written in?\n1. Java\n2. Python\n3. Kotlin\n4. JavaScript");
                    break;
                case 2:
                    System.out.println("What programming language is this program written in?\n1. Python\n2. Java\n3. Kotlin\n4. JavaScript");
                    break;
                case 3:
                    System.out.println("What programming language is this program written in?\n1. Kotlin\n2. Python\n3. Java\n4. JavaScript");
                    break;
                case 4:
                    System.out.println("What programming language is this program written in?\n1. JavaScript\n2. Python\n3. Kotlin\n4. Java");
                    break;
            }

            int answer = scan.nextInt();
            if(answer == trueAnswer) {
                System.out.println("Great, you right!");
                isTrueAnswer = 1;
            } else {
                System.out.print("Please, try again. ");
            }
        }
    }
}
