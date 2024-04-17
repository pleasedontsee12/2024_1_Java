class Humidity implements Measure{
    double[] H_data;
    Humidity(double[] Humi){
        H_data = new double[3];

        for(int i = 0; i < Humi.length; i++){
            H_data[i] = Humi[i];
        }
    }

    public double min(){
        double mn = H_data[0];
        for(int i = 1; i < H_data.length; i++){
            if(mn > H_data[i]){
                mn = H_data[i];
            }
        }
        return mn;
    }

    public double max(){
        double mx = H_data[0];
        for(int i = 1; i < H_data.length; i++){
            if(mx < H_data[i]){
                mx = H_data[i];
            }
        }
        return mx;
    }

    public double avg(){
        double ag = H_data[0];
        for(int i = 1; i < H_data.length; i++){
            ag += H_data[i];
        }
        return ag / H_data.length;
    }
}