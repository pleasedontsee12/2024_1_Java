package Worker;
import Person.*;

public class Worker extends Person{
    String corp;

    public Worker(String name, int age, String corp){
        super(name, age);
        this.corp = corp;
    }

    public String get_corp(){
        return corp;
    }
}