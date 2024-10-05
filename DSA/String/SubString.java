package DSA.String;

public class SubString {
    public static String printSubString(String str,int si,int ei){
        String newStr="";
        for (int i= si; i <ei ; i++) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str="Hello World";

        //inbuilt Function
        System.out.println(str.substring(2,7));
//        System.out.println(printSubString(str,2,7));
    }
}
