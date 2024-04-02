import java.io.*;

//Student 클래스 생성
// Kim 18, Lee 19 두 객체 생성
// 두 객체의 이름과 나이를 출력하는 프로그램

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class H1_Student{
    public static void main(String[] args) throws IOException{
       String name;
       int age;

       Student stu1 = new Student("Kim",18);
       Student stu2 = new Student("Lee",19);

       System.out.printf("%s, %d\n",stu1.name,stu1.age);
       System.out.printf("%s, %d",stu2.name,stu2.age);
    }
}