import java.util.Scanner;

public class SumOfN {
    public static int sum( int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}