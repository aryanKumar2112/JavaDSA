package DSA.Bitwise;

public class CkeckNumberisATwoPower {
    public static void checkNumber(int n){
        int result=n&(n-1);
       if(result==0){
           System.out.println("Enterd number is Two to the power");
       }
       else {
           System.out.println("Enterd number is  not Two to the power");
       }
    }

    public static void main(String[] args) {
        checkNumber(31);
    }
}
