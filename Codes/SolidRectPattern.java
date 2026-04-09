import java.util.Scanner;

public class SolidRectPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Row:");
        int n = sc.nextInt();
        System.out.print("Enter No of Collum:");
        int m = sc.nextInt();

        System.out.println(n+"*"+m+"  * pattern:");

        for (int i = 1; i<=n; i++){
            System.out.println();
            for(int j=1; j<=m; j++){
                System.out.print(" * ");
            }
        }

        sc.close();       

    }
}