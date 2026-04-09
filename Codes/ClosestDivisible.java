public class ClosestDivisible {

    public static int closestNum (int n, int m){
        int p = n/m;
        int n1 = p*m;
        int n2;
        if ((n*m)>0) {
            n2 = n1+m;
        } else {
            n2=n1-m;
        }

        if (Math.abs(n-n1)<Math.abs(n-n2)){
            return n1;
        } else if (Math.abs(n-n2)<Math.abs(n-n1)){
            return n2;
        } else {
            if (Math.abs(n1)<Math.abs(n2)){
                return n2;
            } else {
                return n1;
            }
        }
    }
    public static void main(String[] args){
        int n= 10;
        int m=6;
        System.out.print(closestNum(n,m));
    }
}