package Class1;

import java.util.Arrays;

public class StringConcept {
    public static void main(String[] args) {

        /**
         * 1.Method - trim
         * to removes spaces from beginning (before the first character) and end (after the last character) of the string value
         */

        String cityName ="     New York City     ";
        System.out.println(cityName);
       // String cityNameTrim= cityName.trim();
        //System.out.println(cityNameTrim);

        /**2.Method - subString ()- to fetch a portion from a string using index values.
         * Input only begin Index:
         * if beginIndex and endIndex are valid, returns string from beginIndex to end of the string.
         * Else, StringIndexOutOfBoundsException
         *
         * 3,7: 3456 -> "yor"
        *PS: It will not change the original string value
        */
        cityName = "New york City IN the ToWN of USA";
        //String subFrom10 = cityName.substring(10, 15);
        //System.out.println("Substring from index-10 to index-15: " +subFrom10);

        /**3. Method -split- to cut the string value from a specific point into multiple strings
         *
         */
        cityName = "New york City IN the ToWN of USA";
        String[] afterSplitBy_o = cityName.split("W");
        System.out.println("Array direct variable " +afterSplitBy_o);
        System.out.println("Array after split from 'o': " + Arrays.toString(afterSplitBy_o));

        String[] afterSplit= cityName.split(""); //Array with every character at each index
        System.out.println(afterSplit);

        String[] afterSplit2= cityName.split(" ");
        System.out.println(afterSplit2);


    }
}
