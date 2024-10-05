package DSA.OOP.Abstraction;

public class ConstructorCalling {
    public static void main(String[] args) {
    Mustang m1=new Mustang();
    }
}
abstract class Animal1{
    Animal1(){
        System.out.println("Animal1 constructor called");
    }
}
class Horse1 extends Animal1{
    Horse1(){
        System.out.println("Horse1 constructor called");
    }
}
class Mustang extends Horse1{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
