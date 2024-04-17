import java.io.IOException;
import humi.*;
import temp.*;

public class Abstract2 {
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
