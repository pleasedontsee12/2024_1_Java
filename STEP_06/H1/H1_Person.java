import java.io.*;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String get_name(){
        return name;
    }

    int get_age(){
        return age;
    }
}

class Student extends Person{
    String univ;

    Student(String name, int age, String univ){
        super(name, age);
        this.univ = univ;
    }

    String get_univ(){
        return univ;
    }
}

class Worker extends Person{
    String corp;

    Worker(String name, int age, String corp){
        super(name, age);
        this.corp = corp;
    }

    String get_corp(){
        return corp;
    }
}

class H1_Person {
    public static void main(String[] args) throws IOException{
        Student stu = new Student("Kim",19, "gwnu");
        Worker work = new Worker("Lee", 18, "Samsung");

        System.out.println("이름 : " + stu.get_name() + " 나이 : " + stu.get_age() + " 학교 : " + stu.get_univ());
        System.out.println("이름 : " + work.get_name() + " 나이 : " + work.get_age() + " 직장 : " + work.get_corp());
        
    }
}
