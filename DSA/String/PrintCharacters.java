package DSA.String;

public class PrintCharacters {
    public static void printChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        String firstName="Aryan";
        String lastName="kumar";
        String fullName=firstName+" "+lastName;
        printChar(fullName);
    }
}
