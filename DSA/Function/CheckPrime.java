package DSA.Function;

import java.util.Scanner;

public class CheckPrime {
/*   public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return isPrime;
        }
        for (int i = 2; i <n ; i++) {
              if(n%i==0) {
                  isPrime = false;
                  break;
              }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean x=isPrime(num);
        System.out.println(x);
    }


*/

    //optimized way
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPrime(num));
    }



}
