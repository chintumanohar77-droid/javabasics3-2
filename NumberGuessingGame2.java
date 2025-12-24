import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNumber = 7;
        int guessingNumber;

        System.out.println("Guess the number:");
        guessingNumber = sc.nextInt();

        while (guessingNumber != secretNumber) {
            System.out.println("Wrong guess! Try again:");
            guessingNumber = sc.nextInt();
        }

        System.out.println("Correct guess");
    }
}



