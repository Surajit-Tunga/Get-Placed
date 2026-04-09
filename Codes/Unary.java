public class Unary {
    public static void main(String[] args) {
        int a = 1;
        int b,c,d,e;

        b = ++a;  // a is incremented by 1 first, then assigned to b
        System.out.println("After prefix increment:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = a++; // a is assigned to c first, then incremented by 1
        System.out.println("After postfix increment:"); 
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        d = --a; // a is decremented by 1 first, then assigned to d
        System.out.println("After prefix decrement:");
        System.out.println("a = " + a);
        System.out.println("d = " + d); 

        e = a--; // a is assigned to e first, then decremented by 1
        System.out.println("After postfix decrement:");     
        System.out.println("a = " + a);
        System.out.println("e = " + e);
    }
}