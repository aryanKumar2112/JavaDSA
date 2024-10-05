package DSA.String;

public class CheckPallindrome {
    public static boolean isPallindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        //Second type of representation in lloops
//        for (int i = 0,j=str.length()-1; i < str.length()/2; i++,j--) {
//            if(str.charAt(i)!=str.charAt(j)){
//                return false;
//            }
//        }


        return true;
    }

    public static void main(String[] args) {
        String str="noon";
        System.out.println(isPallindrome(str));
    }
}
