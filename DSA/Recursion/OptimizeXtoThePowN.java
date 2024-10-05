package DSA.Recursion;

public class OptimizeXtoThePowN {
    public static int halfPowerSquare(int a,int n){
        if(n==0){
            return 1;
        }
        //int halfPowSq=halfPowerSquare(a,n/2)*halfPowerSquare(a,n/2);
        //Optimized way
        int halfPow=halfPowerSquare(a,n/2);
        int halfPowSq=halfPow*halfPow;
        if(n%2!=0){
            halfPowSq=a*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(halfPowerSquare(2,10));

    }
}
