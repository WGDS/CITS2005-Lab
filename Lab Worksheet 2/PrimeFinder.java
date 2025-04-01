import java.util.Scanner;
public class PrimeFinder {
    
    public boolean isPrime (int number){
        if (number <= 1) {
            return false;
        }
        for(int i = 2; i < number; i ++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    } 

    public int countPrimes(int start, int end){
        int number = 0;
        for (int i = start; i<= end;i ++){
            PrimeFinder PrimeFinder = new PrimeFinder();
            if (PrimeFinder.isPrime(i)){
                number ++;
            }
        }
        return number;
    }
    public void scanner(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start: ");
        x = sc.nextInt();
        System.out.println("Enter end: ");
        y = sc.nextInt();
        sc.close();
        PrimeFinder PrimeFinder = new PrimeFinder();
        System.out.println("Prime Number:"+PrimeFinder.countPrimes(x,y));
    }
    /* 
    public static void main(String args[]){
        PrimeFinder PrimeFinder = new PrimeFinder();
        System.out.println(PrimeFinder.isPrime(10087));
        System.out.println(PrimeFinder.countPrimes(1,100));
        PrimeFinder.scanner();
    }
    */
}