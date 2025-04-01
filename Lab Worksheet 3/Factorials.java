import java.util.Scanner;
import java.math.BigInteger;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number: ");
        BigInteger number = sc.nextBigInteger();
        int compare = number.compareTo(BigInteger.ZERO);
        while (compare <= 0) {
            System.out.println("Please try again and enter a right number:");
            number = sc.nextBigInteger();
        }
        sc.close();
        System.out.println("The factorials of "+ number +" is "+ countFactorials(number));

    }
    public static BigInteger countFactorials(BigInteger number){
        if (number.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        
        else{
            return number.multiply(countFactorials(number.subtract(BigInteger.ONE)));
        }
    }
}
