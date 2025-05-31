package ex_9_while;
import java.util.Random;
import java.util.Scanner;

public class lab27_guess {
    public static void main(String[] args) {

        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("guess a number");

        int attempts = 0;
        while (true) {
            if(!scanner.hasNextInt()){
                System.out.println("enter a number");
                scanner.next();
                break;
            }

            int guess = scanner.nextInt();
            attempts++;

            if(guess<1 || guess>100){
                System.out.println("enter between 1 to 100");
                break;
            }


            if (guess < numbertoguess) {
                System.out.println("number is less");
            } else if (guess > numbertoguess) {
                System.out.println("number is bigger");
            } else {
                System.out.println("your guess is correct");
                break;
            }

        }
    }
}
