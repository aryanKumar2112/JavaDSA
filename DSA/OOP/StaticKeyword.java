package DSA.OOP;

public class StaticKeyword {
    public static void main(String[] args) {
    Students s1=new Students();
    s1.schoolName="JVM";
    Students s2=new Students();
    System.out.println(s2.schoolName);
    Students s3=new Students();
    s3.schoolName="ASD";
    System.out.println(s3.schoolName);
    }
}
class Students{
    String name;
    int roll;

    static int calcPercentage(int phy,int chem,int math){
        return phy+chem+math;
    }
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
