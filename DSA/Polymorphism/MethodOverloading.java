package DSA.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
    Calculator cal=new Calculator();
        System.out.println(cal.sum(12,34));
        System.out.println(cal.sum(34.7f,67.5f));
        System.out.println(cal.sum(34,45,67));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
