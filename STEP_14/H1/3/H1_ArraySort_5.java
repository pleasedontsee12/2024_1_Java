import java.util.*;

class Student{
    private String name;
    private Integer age;

    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }

    Integer getAge(){
        return age;
    }
}

class Arr_Std{
    private Student[] std;
    private int nstd = 0;

    Arr_Std(){
        std = new Student[6];
    }
    
    void addStd(String name, Integer age){
        std[nstd++] = new Student(name, age);
    }

    public void srtStd_5() {
        Arrays.sort(std, (Student s1, Student s2) ->
            s1.getName().compareTo(s2.getName());
        );
            
    }

    void prtstd(){
        for(Student st : std){
            System.out.println(st.getName() + " " + st.getAge() + "  ");
        }
    }
}

class StdComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int c;
        c = s2.getName().compareTo(s1.getName());

        return c;
    }
}

public class H1_ArraySort_5 {
    public static void main(String[] args) {
        Arr_Std alst = new Arr_Std();

        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Hong", 19);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);

        alst.prtstd();
        System.out.println("-----------------------");
        alst.srtStd_5();

        alst.prtstd();

    }
}
