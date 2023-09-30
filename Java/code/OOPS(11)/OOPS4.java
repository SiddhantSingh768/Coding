//Copy Constructor
public class OOPS4{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="siddhant";
        s1.rollnumber=54;
        s1.password="rew";
        Student s2=new Student(s1);
        s2.password="asd";
    }
}

class Student{
    String name;
    int rollnumber;
    String password;

//shallow copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.rollnumber=s1.rollnumber;
    }

    Student(String name){
        this.name=name;
    }
    Student(int rollnumber){
        this.rollnumber=rollnumber;
    }
}