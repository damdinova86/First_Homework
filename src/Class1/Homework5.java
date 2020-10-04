package Class1;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {

        /**Problem 1.
         * Write code/method to return abbreviation for any given string
         * Example: String msg = "Outfit of the day"
         * Expected: OOTD   // GM HAGDTY
         * String msg = "have a great day to you"
         * //code
         * sout("Abbreviation : " + abr); // HHAPL
         */

        /** My plan:
         *1. split by words
         * 2 loop-
         * 2.2. take first word
         * 2.3. get fist letter of the word
         * 2.4.print
         */
        String msg = "have happy and prosperous life";

        String[] splitWords = msg.split(" ");
        for (int i = 0; i <= splitWords.length - 1; i++) {
            String abbreviation = splitWords[i].substring(0, 1).toUpperCase();
            System.out.print(abbreviation);
        }
        System.out.println();

        /** Problem 2.
         * Change the string to title case
         * 1. Make to lower case
         * 2. split by words
         * 3.loop
         * 4. first letter of the word substring and upper case
         * 5. print
         */
        String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
        System.out.print("Line (After modification) : ");
        String[] words = line.toLowerCase().split(" ");
        for (int i = 0; i <= words.length - 1; i++) {
            String firstLetter = words[i].substring(0, 1).toUpperCase();
            String restLetters = words[i].substring(1);
            System.out.print(firstLetter + restLetters + " ");
        }

        System.out.println();

        /** Problem 3.
         * Reverse a string
         * 1. Split by word
         * 2.Loop -- array by word
         * 2.1 Store each letter in array
         * 2.2.loop- array by letter
         * 2.2.3 unite all letters of the word in reverse order
         *3. print
         */
        String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
        String[] splitMessage = message.split(" ");
        for (int i = 0; i <= splitMessage.length - 1; i++) {
            String[] eachLetter = splitMessage[i].split(""); // ['h', 'a','p','p','y']
            for (int j = 0; j <= eachLetter.length - 1; j++) {
                reverseMessage = eachLetter[j] + reverseMessage;
            }
            reverseMessage = " " + reverseMessage; // this is space between words
        }

        System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah


        /**
         * Problem 4.
         * Write a code to print the reverse a given string
         * "happy" - // "yppah"
         */
        String name = "happy";
        String reverse = "";
        String[] splitByLetter = name.split("");
        for (int i=0; i<=splitByLetter.length-1; i++) {
            reverse = splitByLetter[i] + reverse;
        }
        reverse= " "+ reverse;
        System.out.println(name+ " in reverse: " +reverse);
    }
}
