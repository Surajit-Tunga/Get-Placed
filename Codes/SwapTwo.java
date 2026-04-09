public class SwapTwo {
    public static void main(String[] args){
        int a = 6;
        int b = 8;

        System.out.println("Before Swap:");
        System.out.println(a);
        System.out.println(b);

        b = a+b; 
        a= b-a;
        b=b-a;
        
        System.out.println("After Swap:");
        System.out.println(a);
        System.out.println(b);
        
    }
}