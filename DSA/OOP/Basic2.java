package DSA.OOP;

public class Basic2 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("Aryan");
        e1.setAge(22);
        e1.setSalary(95000f);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.salary);
    }
}
class Employee {
    String name;
    int age;
    float salary;
    void setName(String newName){
        name=newName;
    }
    void setAge(int newAge){
        age=newAge;
    }
    void setSalary(float newSalary){
        salary=newSalary;
    }


}
