package h.question2progassignment;

import java.util.Random;

public class NumberGenerator 
{
    private int numberToGuess;

    public NumberGenerator() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
    }
    public int getNumberToGuess() {
        return numberToGuess;
    } 
}
