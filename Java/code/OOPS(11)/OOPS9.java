// Static 
public class OOPS9{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolname="jmv";

        Student s2=new Student();
        System.out.println(s2.schoolname);
    }
}
class Student{
    int rollnumber;
    String name;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
    void getname(String name){
        this.name=name;
    }
}