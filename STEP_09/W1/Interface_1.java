import java.io.IOException;

interface Measure{
    double max();
    double min();
    double avg();
}

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

public class Interface_1 {
    public static void main(String[] args) throws IOException{
        double[] humi_dl = new double[3];
        double[] temp_dl = new double[3];

        temp_dl[0] = 20.5;
        temp_dl[1] = 21.7;
        temp_dl[2] = 19.3;
        humi_dl[0] = 90.3;
        humi_dl[1] = 91.6;
        humi_dl[2] = 93.1;

        Humidity humi = new Humidity(humi_dl);
        Temperature temp = new Temperature(temp_dl);
        
        System.out.println("Humidity max : " + humi.max() + "\nHumidity min : " + humi.min() + "\nHumidity avg : " + humi.avg());
        System.out.println("Temperature max : " + temp.max() + "\nTemperature min : " + temp.min() + "\nTemperature avg : " + temp.avg());
    }
}
