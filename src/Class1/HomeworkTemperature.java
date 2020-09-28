package Class1;

import java.sql.SQLOutput;

public class HomeworkTemperature {
    public static void main(String[] args) {


        double fT = 61;
        // cT = (fT -32)* 5/9

        double cT = (fT - 32) * 5 / 9;
        System.out.println(fT + " F = " + cT + " C'");
// convert from F to C'

        double kT = (fT + 459.67) * 5 / 9;
        System.out.println(fT + " F = " + kT + " K");
//convert from F to K

        double kTem = 290;
        double cTem = kTem - 273.15;
        System.out.println(kTem + " K = " + cTem + " C'");
// convert from K to C

        double fTem = kTem * 9 / 5 - 459.67;
        System.out.println(kTem + " K =" + fTem + " F");
// convert from K to F

        double cTemp = 17;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println(cTemp + " C' = " + fTemp + " F");
// convert from C to F

        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + " C = " + kTemp + " K");
//convert from C to K


    }


}
