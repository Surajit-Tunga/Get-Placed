import java.util.Scanner;

public class EvenOddBitwise {

    public static boolean isEven(int num) {
        if((num&1)==1) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if (isEven(num)){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}