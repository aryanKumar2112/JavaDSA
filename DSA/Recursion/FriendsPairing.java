package DSA.Recursion;

public class FriendsPairing {
    public static int friendsPairin(int n){
        if(n==1 || n==2){
            return n;
        }
//        int fnm1=friendsPairin(n-1);
//
//        int fnm2=friendsPairin(n-2);
//        int pairWays=(n-1)*fnm2;
//
//        int totWays=fnm1+pairWays;
//        return totWays;

        //single line  code
        return friendsPairin(n-1)+(n-1)*friendsPairin(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairin(3));
    }
}
