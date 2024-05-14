enum CarColor{White, Silver, Blue, Black}

class enum_51{
    void enum_test(){
        CarColor cc;

        System.out.println("Enum51 ...");
        cc = CarColor.Blue;
        System.out.println(cc);

        for(CarColor c : CarColor.values()){
            String cs = cc.toString();
            int ci = cc.ordinal();
            System.out.println(cc + " " + ci);
        }
        System.out.println("");
    }
}

class enum_52{
    void enum_test(){
        CarColor cc = CarColor.Blue;
        System.out.println("Enum 52....");

        if(cc == CarColor.Blue){
            System.out.println("if blue");
        }
        else{
            System.out.println("if no blue");
        }

        if(cc.equals(CarColor.Blue)){
            System.out.println("equals() Blue");
        }
        else{
            System.out.println("not equals() Blue");
        }
    }
}
public class STEP_12_Type_5 {
    public static void main(String[] args) {
        new enum_51().enum_test();
        new enum_52().enum_test();
    }
}
