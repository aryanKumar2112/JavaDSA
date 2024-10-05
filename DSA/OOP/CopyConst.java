package DSA.OOP;

public class CopyConst {
    public static void main(String[] args) {
       Student4 s1=new Student4();
      s1.name="Aryan";
      s1.roll=27;
      s1.password="1234";
      s1.marks[0]=100;
      s1.marks[1]=90;
      s1.marks[2]=98;
      Student4 s2=new Student4(s1);
      s2.password="absd";
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}
class Student4{
    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    //Shallow copy
//    Student4(Student4 s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll= s1.roll;
//        this.marks=s1.marks;
//    }
    //Deep Copy
    Student4(Student4 s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll= s1.roll;
        for (int i = 0; i < marks.length; i++) {
           this.marks[i]=s1.marks[i];
        }
    }
    Student4(){
        System.out.println("constructor called");
    }
    Student4(String name){
        this.name=name;
    }
    Student4(int roll){
        this.roll=roll;
    }


}
