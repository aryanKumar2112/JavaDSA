package DSA.OOP;

public class ParametrizedCons {
    public static void main(String[] args) {
       Student3 s1=new Student3("Aman");
        System.out.println(s1.name);
       Student3 s2=new Student3(25);
        System.out.println(s2.roll);
    }
}
class Student3{
    String name;
    int roll;
    Student3(String name){
        this.name=name;
    }
    Student3(int roll){
        this.roll=roll;
    }
}
