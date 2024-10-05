package DSA.Bitwise;

public class UpdateIthBit {
    public static int setIthBIt(int n,int i){
        int gitBash=1<<i;
        return(n&gitBash);
    }
    public static int clearIthBIt(int n,int i){
        int gitBash=~(1<<i);
        return(n&gitBash);
    }
    public static int updateIthBIt(int n,int i,int newBit){
//        if(newBit==0){
//            return clearIthBIt(n,i);
//        }
//        else {
//            return setIthBIt(n, i);
//        }
        //second method
        n=clearIthBIt(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;

    }

    public static void main(String[] args) {
        System.out.println(updateIthBIt(10,2,1));
    }
}
