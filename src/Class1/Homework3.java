package Class1;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {



        // 1. Display length of the first name.
        String lastName = "Damdinova";
        String firstName = "Balzhima";
        int lengthOfFirstName = firstName.length();
        System.out.println("Length of my fist name is " + lengthOfFirstName);

        // 2. Does your last name starts with "K" (Ignoring cases)
        boolean lastNameStarts_K = lastName.toUpperCase().startsWith("K");
        System.out.println("Does your last name starts with 'K' (Ignoring cases)? " + lastNameStarts_K);

        //3. print the last alphabet of your first name
        int lastIndexOfFistName = lengthOfFirstName - 1;
        char lastCharAt = firstName.charAt(lastIndexOfFistName);
        System.out.println("The last alphabet of my first name is " + lastCharAt);

        // 4. Does your last name ends with "M" (Ignoring cases)
        boolean lastNameEnds_M_IgnoringCases = lastName.toUpperCase().endsWith("M");
        System.out.println("Does your last name ends with 'M' (Ignoring cases)? " + lastNameEnds_M_IgnoringCases);


        //	5. Display the total number of words in the myStatement.
        String myStatement = "I am a good programmer";
        String[] words = myStatement.split(" ");
        int length = words.length;
        System.out.println("The total number of words in the " + myStatement + " is " + length);

        //	6. replace all the 'r' characters with 'f' characters.
        String replace = myStatement.replace('r', 'f');
        System.out.println("After replace all the 'r' characters with 'f' characters will be: " + replace);


        //7. Calculate the length of your first name, without using length() method of String class.
        //String firstName ="Balzhima";

        int indexof_a = firstName.lastIndexOf("a");
        System.out.println("The length of my first name: " + indexof_a);


        //8.Assign result (boolean) as true if length of strNew if greater than 10 else assign false.
        String strNew = "hello dear, how are you?";
        int lengthOfStrNew = strNew.length();
        boolean greaterThan_10 = lengthOfStrNew > 10 ? true : false;
        System.out.println("Is the length of " + strNew + " is > of 10? " + greaterThan_10);

        //9. Make Happy New Year
        String threeWordsSentence = "hApPY nEW yeAr";
        String toLowerCase = threeWordsSentence.toLowerCase();
        threeWordsSentence = toLowerCase; //happy new year
        String[] afterSplit = threeWordsSentence.split(" ");

        String firstLetterOfFirstWord = afterSplit[0].substring(0,1).toUpperCase();
        String restofLetters = afterSplit[0].substring(1);

        String firstLetterOfSecondWord = afterSplit[1].substring(0,1).toUpperCase();
        String restofLettersOfSecondWord = afterSplit[1].substring(1);

        String firstLetterOfThirdWord = afterSplit[2].substring(0,1).toUpperCase();
        String restofLettersOfThirdWord = afterSplit[2].substring(1);

        System.out.println(firstLetterOfFirstWord+restofLetters+ " "+firstLetterOfSecondWord+restofLettersOfSecondWord+ " "+firstLetterOfThirdWord+restofLettersOfThirdWord );



         //10. Create abbreviation: String threeWordsSentence =  "Lab sessIONS clAsses";

        String threeWordsS = "Lab sessIONS clAsses";
        String[] splitWords = threeWordsS.split(" ");
        String firstLetterOf_FirstWord = splitWords[0].substring(0,1).toUpperCase();
        String firstLetterOf_SecondWord = splitWords[1].substring(0,1).toUpperCase();
        String firstLetterOf_ThirdWord = splitWords[2].substring(0,1).toUpperCase();
        System.out.println(firstLetterOf_FirstWord+firstLetterOf_SecondWord+firstLetterOf_ThirdWord);

        /**
         * if name length is greater than 10 and number is greater than 5
         * print the below:
         *      name in all uppercase
         *      and replace p with b in name
         * else
         * make result as false
         *
         *
         * sout(result) // outside the if-else block
         */
        String name = "Happy";
        boolean result =true;
        int number =22;
        if ((name.length()>10) && (number>5)) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace("p", "b"));
        }else {
            result = false;
        }
        System.out.println(result);









//        String name = "Happy";
//        boolean result = true;
//        int number = 22;
//
//        if ((name.length()>10) && number>5){
//            System.out.println(name.toUpperCase()+ name.replace("p", "b"));
//
//        } else {
//            result =false;
        }
        //System.out.println(result);

        /**
         * based on month name, print season
         * dec, jab, feb -> winter
         * mar, apr, may -> summer
         * jun, jul, aug -> fall
         * sep, oct, nov -> spring
         * if invalid monthName, print invalid month entered
         */
        //String monthName = "Sep";

//        switch(monthName){
//        case "Dec":
//            System.out.println("winter");
//            break;
//        case "Sep":
//            System.out.println("Sep");
//            break;
//        default:
//            System.out.println("invalid day");


    }


        //String monthName = "dec, jab, feb";


//        String monthName = "dec, jab, feb";
//        switch (monthName){
//            case "dec, jab, feb":
//                System.out.println("winter");
//                break;
//            case "mar, apr, may":
//                System.out.println("summer");
//                break;
//            case "jun, jul, aug":
//                System.out.println("fall");
//                break;
//            case "sep, oct, nov ":
//                System.out.println("spring");
//                break;
//            default:
//                System.out.println("invalid");







