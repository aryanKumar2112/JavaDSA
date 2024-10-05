package DSA.Recursion;

public class LengthOfString {
    public static int lengthOfStr(String str,int i,int count){
        if(i==str.length()){
            return count;
        }
        return lengthOfStr(str,i+1,++count);



    }
    public static void main(String[] args) {
        System.out.println(lengthOfStr("aryan",0,0));
    }
}
