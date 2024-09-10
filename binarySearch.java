import java.util.*;
public class binarySearch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rndm = (int)(Math.random()*101);
        System.out.println("Guess a number 0 to 100");
        int guess = input.nextInt();
        while(guess != rndm){
            System.out.print("Your guess was ");
            if(guess > rndm)
                System.out.println("too high.");
            else 
                System.out.println("too low");
            guess = input.nextInt();
        }
        System.out.println("You guessed right");
    }
}
