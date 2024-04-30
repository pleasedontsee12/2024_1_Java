import java.io.*;
import Student.*;
import Worker.*;

class H1_Person {
    public static void main(String[] args) throws IOException{
        Student stu = new Student("Kim",19, "gwnu");
        Worker work = new Worker("Lee", 18, "Samsung");

        System.out.println("이름 : " + stu.get_name() + " 나이 : " + stu.get_age() + " 학교 : " + stu.get_univ());
        System.out.println("이름 : " + work.get_name() + " 나이 : " + work.get_age() + " 직장 : " + work.get_corp());
        
    }
}
