import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int RandomNumber = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleace guess number: ");
        int guess = sc.nextInt();
        while (guess != RandomNumber){
            if(guess < RandomNumber){
                System.out.println("\nhigher");
            }
            else{
                System.out.println("\nlower");
            }
            System.out.println("\nPlease guess again: ");
            guess = sc.nextInt();
        }
        sc.close();
        System.out.println("You Win! The real number is: "+ RandomNumber + "\nAnd you guess: "+ guess);
    }
    
}