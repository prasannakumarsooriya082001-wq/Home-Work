
package numberguessinggame;

import java.util.Random;
import java.util.Scanner;


public class NumberGuessing 
{
    Random r = new Random();

    int number = r.nextInt(100) + 1;
        
    int attempts = 0;
    int maxAttempts = 10;
        
    Scanner sc = new Scanner(System.in);
        
    int guessNum= 0;
    
    
    
    void numberGuess()
    {
        System.out.println("You have only " + maxAttempts + " attempts.");
        
        while(guessNum != number && attempts < maxAttempts)
        {   
            System.out.print("Guess a Number Between 1 - 100 : ");
            guessNum = sc.nextInt();
            attempts++;
            
            if(guessNum > number)
            {
                System.out.println("Too High!");
                
            }
            else if(guessNum < number)
            {
                System.out.println("Too Low!");
                
            }
            else if(guessNum == number)
            {
                System.out.println("Correct! You won in "+attempts+" attempts.");
                break;
            }
        }
        
        if(guessNum != number)
        {
            System.out.println("You lost! The correct number was: " + number);
        }
    }
}
