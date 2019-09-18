import java.util.Scanner;

public class Prime {
    private static final Scanner sc = new Scanner(System.in);

    public static void isPrime(int n) {
        int count = 0;
        for(int i=2; i<n; i++) {
            if(n%i == 0)
                count++;
        }
        if(count == 0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }

    public static void PrimeNumbers(int n) {
        int c = 0;
        for(int i=1; i<=n; i++) {
            c = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0)
                    c++;
            }
            if(c == 2)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        isPrime(n);
        PrimeNumbers(n);
    }
}
