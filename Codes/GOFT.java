public class GOFT{
    public static void main(String[] args){
        int a=5,b=7,c=9;
        if (a > b && a > c) {
            System.out.print(a + "Is greater then others.");
        } else if (b > a && b > c) {
            System.out.print(b + "Is greater then others.");
        } else {
            System.out.print(c + "Is greater then others.");
        }
    }
}