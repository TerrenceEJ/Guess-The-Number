import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        boolean x = false;
        int guesses = 0;
        Scanner input = new Scanner(System.in);
        Random nNum = new Random();

        System.out.println("Hello! What is your name?");
        String pInput = input.next();

        System.out.print("Well," + pInput + ", I am thinking of a number between 1 and 20 \nTake a guess.");

        //input.nextInt();
        int num = 0;
        num = nNum.nextInt(20);
        int numInput = input.nextInt();
        while (!x) {
                if (numInput > num) {
                    System.out.print("Your guess is too high.\nTake a guess.");
                    numInput = input.nextInt();
                    guesses++;
                } else if (numInput < num) {
                    System.out.print("Your guess is too low.\nTake a guess.");
                    numInput = input.nextInt();
                    guesses++;
                }
                else {
                    System.out.print("Good Job," + pInput + ", You guessed my number in " + guesses + "!\nWould you like to play again? (y or n)");
                    String answer = input.next();
                    if (answer.charAt(0) == 'n') {
                        exit(0);
                        //x = true;
                    } else {
                        numInput = -1;
                        main(args);
                    }
                }
            }
    }
}
