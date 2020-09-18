package Class1;

import com.sun.org.apache.xpath.internal.objects.XString;
import sun.jvm.hotspot.ui.tree.CStringTreeNodeAdapter;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DatatypeClass {

    public static void main(String[] args) {
        byte numOfHours = 24;
        System.out.println("Number of hour in a day is " + numOfHours);

        short numOfDays = 366;
        System.out.println("Max number of days in a year " + numOfDays);

        short numOfEmp = 800;
        System.out.println("Total number of employees in an organization " + numOfEmp);

        int popCountry = 18000000;
        System.out.println("Population in a country is " + popCountry);

        float intRate = 3.55f;
        System.out.println("Interest rate is " + intRate);

        double accBalance = 5003.35;
        System.out.println("Balance in a bank account is " + accBalance);

        boolean sunRise = false;
        System.out.println("Does the sun rise from the west? " + sunRise);

        char fistNameInitial = 'B';
        char lastNameInitial = 'D';
        System.out.println("Initials of my name is " + fistNameInitial + lastNameInitial);

        String fullName = "Balzhima Damdinova";
        System.out.println("My full name is " + fullName);








    }

}
