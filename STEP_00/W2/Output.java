// 자바 프로그램의 명렁어 인수와 출력
// printf만이 인수를 받을수있다 
class Output{
    public static void main(String[] args){
        System.out.printf("Output test...\n");
        System.out.println("Output test...");
        System.out.printf("%d",args.length);
        System.out.println(args.length);

        for(int i = 0; i < args.length; i++){
            System.out.printf("%d",args[i]);
        }

    }
}

/*
input : aa bb
output
Output test...
Output test...
2
2
aa
bb
*/

