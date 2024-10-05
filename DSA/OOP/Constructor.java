package DSA.OOP;

public class Constructor {
    public static void main(String[] args) {

      Student1 s1=new Student1("Aryan");
        System.out.println(s1.name);
    }
}
class Student1{
     String name;
    Student1(String name){
        this.name=name;
        //System.out.println("Constructor is called....");
    }
}
