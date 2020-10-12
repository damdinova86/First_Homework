package Class1;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {

/**
 * 1.find length of int array
 * 2.add all numbers in array
 * 3. divide all numbers/length
 */
        int[] arr = {3, 23, 33, 3, 346};
        double res = arrayAvg(arr);
        System.out.println(res);

        String[] names = {"john", "michael", "gphilipppre", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "philip";
        arrayNames(names,nameToSearch);


    }

    public static double arrayAvg(int[] num1) {
        double sum = 0;
        for (int i = 0; i <= num1.length - 1; i++) {
            sum += num1[i];

        }
        double avg = sum / num1.length;


        return avg;

    }

    /**
     * String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method (NO return) that will print the index of given name in the given array
     * <p>
     * My plan:
     * 1. create loop
     * 2. if else if the name is matching give the index of the array
     * String name and String[] array
     * 3. print
     */

    String nameToSearch = "philip";

    public static void arrayNames(String[] names1, String nameToSearch1) {

        for (int j = 0; j <= names1.length-1; j++) {
            if(names1[j].equalsIgnoreCase(nameToSearch1)){
                System.out.println(j);

        }
    }
}



}
