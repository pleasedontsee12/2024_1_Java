package Student;
import Person.*;

public class Student extends Person{
    String univ;

    public Student(String name, int age, String univ){
        super(name, age);
        this.univ = univ;
    }

    public String get_univ(){
        return univ;
    }
}