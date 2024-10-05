package DSA.Recursion;

public class FibbonacciOfNum {
    public static int calcFibo(int n){
        if(n==0 ||n==1){
            return n;
        }

        int fibnm1=calcFibo(n-1);
        int fibnm2=calcFibo(n-2);
        int fib=fibnm1+fibnm2;
        return fib;
    }
    public static void main(String[] args) {
         int n=9;
        System.out.println(calcFibo(n));
    }
}
