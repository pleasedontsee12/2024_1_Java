class Temperature implements Measure{
    double[] T_data;
    Temperature(double[] Temp){
        T_data = new double[3];

        for(int i = 0; i < Temp.length; i++){
            T_data[i] = Temp[i];
        }
    }

    public double min(){
        double mn = T_data[0];
        for(int i = 1; i < T_data.length; i++){
            if(mn > T_data[i]){
                mn = T_data[i];
            }
        }
        return mn;
    }

    public double max(){
        double mx = T_data[0];
        for(int i = 1; i < T_data.length; i++){
            if(mx < T_data[i]){
                mx = T_data[i];
            }
        }
        return mx;
    }

    public double avg(){
        double ag = T_data[0];
        for(int i = 1; i < T_data.length; i++){
            ag += T_data[i];
        }
        return ag / T_data.length;
    }
}