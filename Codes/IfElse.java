import java.util.Scanner;
public class IfElse { 
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        If-Else Statement
        if(age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Short Hand

        // if (age>=18) System.out.println("You are an adult.");
        // else System.out.println("You are a minor.");

        // More short hand
        // String result = (age >= 18) ? "You are an adult." : "You are a minor.";
    }
}