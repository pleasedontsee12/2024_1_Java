class Type_31{
    void type_test(){
        Integer It1 = new Integer(0x10);
        Integer It6 = It1;
        Integer It2 = new Integer(0x10);

        Integer It3 = 0x10;
        Integer It4 = 16;

        int it5 = It1;
        Integer It5 = it5;

        if(It1 == It2){
            System.out.println("It1 == It2");
        }
        else{
            System.out.println("It1 != It2");
        }

        if(It3 == It4){
            System.out.println("It3 == It4");
        }
        else{
            System.out.println("It3 != It4");
        }

        if(It1 == It3){
            System.out.println("It1 == It3");
        }
        else{
            System.out.println("It1 != It3");
        }

        if(It5 == It1){
            System.out.println("It5 == It1");
        }
        else{
            System.out.println("It5 != It1");
        }

        if(It5 == It2){
            System.out.println("It5 == It2");
        }
        else{
            System.out.println("It5 != It2");
        }

        if(It5 == It3){
            System.out.println("It5 == It3");
        }
        else{
            System.out.println("It5 != It3");
        }

        if(It5 == It4){
            System.out.println("It5 == It4");
        }
        else{
            System.out.println("It5 != It4");
        }

        if(It5 == It5){
            System.out.println("It5 == It5");
        }
        else{
            System.out.println("It5 != It5");
        }

        if(It6 == It1){
            System.out.println("It6 == It1");
        }
        else{
            System.out.println("It6 != It1");
        }

    }
}

public class STEP_12_Type_3 {
    public static void main(String[] args) {
        new Type_31().type_test();
    }
}
