import java.util.Scanner;

public class Dice {

    public static int Opposite(int n){
        int ans = 7-n; 
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter One Side of The Dice:");
        int n = sc.nextInt();
        System.out.print(Opposite(n));
        sc.close();
    }
}