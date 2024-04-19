import java.io.IOException;
import Humidity.*;
import Temperature.*;

public class H6_Abstract {
    public static void main(String[] args) throws IOException{
        double[] humi_dl = new double[3];
        double[] temp_dl = new double[3];

        temp_dl[0] = 19.2;
        temp_dl[1] = 20.3;
        temp_dl[2] = 18.7;
        humi_dl[0] = 90.1;
        humi_dl[1] = 89.2;
        humi_dl[2] = 92.3;

        Humidity humi = new Humidity(humi_dl);
        Temperature temp = new Temperature(temp_dl);
        
        System.out.println("Humidity max : " + humi.max() + "\nHumidity min : " + humi.min() + "\nHumidity avg : " + humi.avg());
        System.out.println("Temperature max : " + temp.max() + "\nTemperature min : " + temp.min() + "\nTemperature avg : " + temp.avg());
    }
}
