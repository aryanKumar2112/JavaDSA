package DSA.Function;

public class FunctionOverlodingUsingDataTypes {
    public static int calcsum(int a,int b){
        return a+b;
    }
    public static float calcsum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(calcsum(2,4));
        System.out.println(calcsum(3.2f,6.4f));
    }
}
