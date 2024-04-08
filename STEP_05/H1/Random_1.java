class Random_1{
    int seed;
    int max;
    int[] rnum = new int[10];
    
    Random_1(int seed){
        this.seed = seed;
        Random_1 rnd = new Random_1(seed);

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