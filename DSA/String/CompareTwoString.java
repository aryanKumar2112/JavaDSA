package DSA.String;

public class CompareTwoString {


    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equals");
        }
        else {
            System.out.println("String are not equals");
        }
        if(s1==s3){
            System.out.println("equals");
        }
        else{
            System.out.println("not equal");
        }
        System.out.println(s1.equals(s3));
    }
}
