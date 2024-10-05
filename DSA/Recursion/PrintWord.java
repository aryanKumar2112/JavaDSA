package DSA.Recursion;

public class PrintWord {
    static String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void prinWord(int n){
        if(n==0){
            return;
        }
        int lastDigit=n%10;
        prinWord(n/10);
        System.out.print(arr[lastDigit]+" ");
    }
    public static void main(String[] args) {
        prinWord(2019);
    }
}
