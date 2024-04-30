package Person;

public class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }
}