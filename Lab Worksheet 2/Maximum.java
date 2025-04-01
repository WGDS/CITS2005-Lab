import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int maximum = a;
        sc.close();
        if (b > a){
            maximum = b;
        }
        System.out.println("Maximum:"+maximum);
    }
}
