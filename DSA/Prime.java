package DSA;

public class Prime {
    public static void main(String[] args) {
        int n=13;
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                System.out.println("Entered number is not prime");
                break;
            }

        }
    }
}
