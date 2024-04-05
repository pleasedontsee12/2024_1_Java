class Random_1{
    int seed,r;
    int max;
    int[] rnum = new int[10];
    
    Random_1(int seed){
        Random rnd = new Random(this.seed);

        for(int i = 0; i < 10; i++){
            int r = rnd.nextInt();
            rnum[i] = r;
            
            if(max < rnum[i]){
                max = rnum[i];
            }
        }
    }

    int get_max(){
        return max;
    }

}