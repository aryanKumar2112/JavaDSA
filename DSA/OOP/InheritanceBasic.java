package DSA.OOP;

public class InheritanceBasic {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swiming");
    }
}
