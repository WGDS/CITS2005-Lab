public class PrimeFinderProgram {
    public static void main(String[] args) {
        PrimeFinder primeFinder = new PrimeFinder();
        System.out.println(primeFinder.isPrime(10087));
        System.out.println(primeFinder.countPrimes(1, 100));
        primeFinder.scanner();
    }
}
