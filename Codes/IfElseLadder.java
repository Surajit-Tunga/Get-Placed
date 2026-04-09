public class IfElseLadder { 
    public static void main(String[] args) {
        int number = 75;

        if (number > 90) {
            System.out.println("Grade A");
        } else if (number > 80) {
            System.out.println("Grade B");
        } else if (number > 70) {
            System.out.println("Grade C");
        } else if (number > 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}