package DSA.Recursion;

public class SumOfNaturalNum {
    public static int calcSum(int n){
        if(n==1){
            return n;
        }
        int v1=calcSum(n-1);
        int sum=n+v1;
        return sum;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(calcSum(n));
    }
}
