package DSA.Recursion;


public class NumbersInDesc {
    public static void printNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printNum(n);

    }
}


