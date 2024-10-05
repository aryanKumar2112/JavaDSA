package DSA.OOP.Inheritance;

public class HierachialInheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        mammal dog=new mammal();
        dog.breathe();
        Bird pigeon=new Bird();
        pigeon.eat();
    }
}
class Animal2{
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}
class mammal extends Animal2{
    void walk(){
        System.out.println("Walking");
    }
}
class Fish extends Animal2{
    void swim(){
        System.out.println("Swiming");
    }
}
class Bird extends Animal2{
    void fly(){
        System.out.println("Flying");
    }
}
