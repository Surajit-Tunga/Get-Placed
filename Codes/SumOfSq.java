import java.util.Scanner;

public class SumOfSq {
    public static int CalSum(int n){
        int sum = (n*(n+1)*(2*n+1))/6;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        System.out.print(CalSum(n));
        sc.close();
    }
}