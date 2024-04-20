import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args) {
        System.err.println("1.A Random Number is generated between 1 to 100");
        System.err.println("2.You have only 5 attempts to guess");
        Random(0);
    }
    public static void Random(int reference)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        if(reference == 1)
        {
            System.err.println("1.A Random Number is generated between 1 to 100");
            System.err.println("2.You have only 5 attempts to guess");
        }
        NumberFind(randomNumber);
    }
    public static void NumberFind(int randomNumber) {
        int attempts = 5;
        int counter = 1; 
        Scanner scanner = new Scanner(System.in);
        while(attempts > 0)
        {
            System.err.println("Enter Your Guess:");
            int guess = scanner.nextInt();
            if(guess == randomNumber) 
            {
                System.out.println("");
                counter = 0;
            }
            else if(guess > randomNumber)
            {
                System.out.println("Your guess is too high");
                attempts--;
                counter += 1;
            }
            else
            {
                System.out.println("Your guess is too low");
                attempts--;
                counter += 1;
            }
            if(counter == 0)
            {
                Result(counter,randomNumber);
                break;
            }
            if(attempts == 0)
            {
                Result(counter,randomNumber);
            }
        }
    }

    public static void Result(int counter,int randomNumber)
    {
        if(counter == 0)
        {
            System.out.println("You guessed my number...You Won!!!\n");
            Retry();
        }
        else{
            System.out.println("----YOU LOSE----");
            System.out.println("The Random number is " + randomNumber + "\n");
            Retry();
        }
    }
    public static void Retry()
    {
        System.out.println("If you want to Replay?\nYes/No");
        Scanner scanner = new Scanner(System.in);
        String retryElement = scanner.next();
        if(retryElement.equals("yes") || retryElement.equals("YES"))
        {
            Random(1);
        }
        else
        {
            System.out.println("\nThanks for playing!");
            return;
        }
    }
    
}