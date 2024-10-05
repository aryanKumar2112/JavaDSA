package DSA.OOP;

public class AccessModifier {
    public static void main(String[] args) {
    BankAccount b1=new BankAccount();
    b1.userName="assd";
    //here password only changed but password can not accessed
    b1.setPassword("asvfhjf");
        System.out.println(b1.userName);
    }
}
class BankAccount{
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }



}
