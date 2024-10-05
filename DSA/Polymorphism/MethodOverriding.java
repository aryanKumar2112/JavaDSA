package DSA.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        //when we made child class object ,it call child class function
     Deer d=new Deer();
        d.eat();
    }

}
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}