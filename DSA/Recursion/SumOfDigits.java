package DSA.Recursion;

public class SumOfDigits {
    public static int sumDigit(int n,int sum){
        if(n==0){
            return 0;
        }
        int rem=n%10;

        return sumDigit(n/10,sum+rem);
    }
    public static void main(String[] args) {

        System.out.println(sumDigit(12343,0));
    }
}
