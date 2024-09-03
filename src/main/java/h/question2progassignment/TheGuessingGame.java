package h.question2progassignment;

import java.util.Scanner;

public class TheGuessingGame extends Game
{
    private NumberGenerator numberGenerator;
    private int[] guesses;
    private int numberOfGuesses;
    private final int MAX_GUESSES = 10;

    public TheGuessingGame(String name) 
    {
        super(name);
        numberGenerator = new NumberGenerator();
        guesses = new int[MAX_GUESSES];
        numberOfGuesses = 0;
    }
    @Override
    public void start() 
    {
        super.start();
        play();
    }

    private void play() 
    {
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean hasGuessedCorrectly = false;

        while (numberOfGuesses < MAX_GUESSES && !hasGuessedCorrectly) 
        {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt();
            guesses[numberOfGuesses++] = guess;

            if (guess == numberGenerator.getNumberToGuess()) 
            {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number.");
            } else if (guess < numberGenerator.getNumberToGuess()) 
            {
                System.out.println("Too low! Try again.");
            } else 
            {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasGuessedCorrectly) 
        {
            System.out.println("Sorry, you've used all your guesses. The number was " 
                    + numberGenerator.getNumberToGuess());
        }

        printGuesses();
    }

    private void printGuesses() 
    {
        System.out.println("Your guesses:");
        for (int i = 0; i < numberOfGuesses; i++) 
        {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }
}

