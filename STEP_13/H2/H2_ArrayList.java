import java.util.ArrayList;

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

    int getAge(){
        return age;
    }
}

class ArrLst_Std{
    private ArrayList<Student> als;

    ArrLst_Std(){
        als = new ArrayList<>();
    }
    
    void addStd(String name, Integer age){
        als.add(new Student(name, age));
    }

    public void srtStd() {
        for (int i = 0; i < als.size() - 1; i++) {
            int maxi = i;
            for (int j = i + 1; j < als.size(); j++) {
                Student s1 = als.get(maxi);
                Student s2 = als.get(j);
                if (s1.getName().compareTo(s2.getName()) < 0 ||
                    (s1.getName().equals(s2.getName()) && s1.getAge() < s2.getAge())) {
                    maxi = j;
                }
            }
            
            Student temp = als.get(i);
            als.set(i, als.get(maxi));
            als.set(maxi, temp);
        }
    }


    void prtstd(){
        for(Student st : als){
            System.out.println(st.getName() + " " + st.getAge() + "  ");
        }
    }
}


public class H2_ArrayList {
    public static void main(String[] args) {
        ArrLst_Std alst = new ArrLst_Std();

        alst.addStd("Choi", 19);
        alst.addStd("Hong", 18);
        alst.addStd("Park", 20);
        alst.addStd("Hong", 19);
        alst.addStd("Choi", 20);
        alst.addStd("Park", 21);

        alst.prtstd();
        System.out.println("-----------------------");
        alst.srtStd();

        alst.prtstd();

    }
}
