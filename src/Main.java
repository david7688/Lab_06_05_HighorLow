import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int randNum;
        int guess = 0;
        String trash = "";

        System.out.print("Guess a number between 1 and 10: ");

        if(in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        randNum = rand.nextInt((10 - 1) + 1) + 1;

        if (guess > randNum)
        {
            System.out.println("Your guess was too high!");
        }
        else if (guess < randNum)
        {
            System.out.println("Your guess was too low!");
        }
        else if (guess == randNum)
        {
            System.out.println("Your guess was right on the money!");
        }

    }
}