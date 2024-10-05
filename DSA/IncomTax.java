package DSA;

import java.util.Scanner;

public class IncomTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        float tax;
        if(sal<500000){
            System.out.println("no taxes");
        }
        else if(sal>=500000 && sal<1000000){
            tax=(float)(sal*0.2);
            System.out.println("Tax = "+tax);
        }
        else{

            tax=sal*30/100;
            System.out.println("tax = "+tax);
        }


    }
}
