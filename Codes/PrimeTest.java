import java.util.Scanner;

public class PrimeTest {
    // Method to test Prime
    public static boolean isPrime (int n){
        // Eliminate numbers less then 1 and 1 itself.
        if (n<=1) {
            return false;
        }

        // Check Divisibility from 2 to n-1
        for (int i =2; i<n; i++) {
            if (n%i==0) {
                return false;
            }
        }

        // If both filter passed then return ture.
        return true;
    }

    // Main Method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num:");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}