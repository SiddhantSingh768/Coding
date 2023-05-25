// Constructors 
public class OOPS3{
    public static void main(String[] args) {
        Student s1=new Student("siddhant");
        Student s2=new Student(1);
        
    }
}

class Student{
    String name;
    int rollnumber;

    Student(String name){
        this.name=name;
    }
    Student(int rollnumber){
        this.rollnumber=rollnumber;
    }
}