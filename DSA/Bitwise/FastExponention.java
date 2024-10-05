package DSA.Bitwise;

public class FastExponention {
    public static void calcPower(int a,int n){
       int ans=1;
       while(n>0){
           if ((n&1)!=0){
               ans=ans*a;
           }
           a=a*a;
           n=n>>1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        calcPower(3,5);
    }
}
