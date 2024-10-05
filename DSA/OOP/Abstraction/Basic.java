package DSA.OOP.Abstraction;

public class Basic {
    public static void main(String[] args) {
    Horse h=new Horse();
    h.eat();
    h.walk();
        System.out.println(h.color);//here firstly parent class constructor call

    Chicken ch=new Chicken();
    ch.eat();
    ch.walk();
    }
}
abstract class Animal{
    String color;
    Animal(){
       color="Brown";
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk();
}
class Horse extends Animal{
    //abstract function walk is necessary to implement in child class
    void changeColor(){
        color="green";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on two legs");
    }
}