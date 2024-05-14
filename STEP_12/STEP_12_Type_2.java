class Type_21{
    void type_test(){
        Boolean bl = false;
        Character ch = 'A';
        Integer it = 0101;
        Long lg = 65L;
        Float ft = 1e-2f;
        Double db = 0.01;
        String sg = "Java";

        System.out.println(bl);
        System.out.println(ch);
        System.out.println(it);
        System.out.println(lg);
        System.out.println(ft);
        System.out.println(db);
        System.out.println(sg);
    }
}

class Type_22{
    @SuppressWarnings("removal")
    void type_test(){
        Boolean bl = new Boolean(false);
        Character ch = new Character('A');
        Integer it = new Integer(0101);
        Long lg = new Long(65L);
        Float ft = new Float(1e-2f);
        Double db = new Double(0.01);
        String sg = new String("Java");

        System.out.println(bl);
        System.out.println(ch);
        System.out.println(it);
        System.out.println(lg);
        System.out.println(ft);
        System.out.println(db);
        System.out.println(sg);
    }
}

public class STEP_12_Type_2 {
    public static void main(String[] args) {
        new Type_21().type_test();
        new Type_22().type_test();
    }
}
