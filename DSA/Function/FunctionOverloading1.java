package DSA.Function;

public class FunctionOverloading1 {
    public static int calcSum(int a,int b){
        return a+b;
    }
    public static int calcSum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(calcSum(2,3));
        System.out.println(calcSum(5,6,8));
    }

}
