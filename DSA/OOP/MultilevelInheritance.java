package DSA.OOP;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
class Animal1{
    void eat(){
        System.out.println("Eating");
    }
}
class Mammal extends Animal1{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
