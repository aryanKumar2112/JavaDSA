package DSA.Bitwise;

public class SetIthBit {
    public static int setIthBit(int n,int i){
       int bitmask=1<<i;
       return n|bitmask;
    }

    //clear Ith Bit
    public static int clearIthBit(int n,int i){
        int gitBash=~(1<<i);
        return n&gitBash;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
}
