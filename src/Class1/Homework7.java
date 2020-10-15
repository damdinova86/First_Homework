package Class1;

import java.sql.SQLOutput;

public class Homework7 {

    // 1 Create a method to add all the numbers in a array with double-values

    public double addNum(double[] num) {
        double sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum += num[i];
        }
        return sum;
    }

    /**
     * 2. Create a method to verify if the input-int-number is prime or not
     * prime number: number divisible by 1 and itself
     * eg: 7 -> prime
     * 21 -> not a prime
     * <p>
     * Plan
     * 1. loop i<=num, i++
     * 1.1. num/i -> is there any remainder?
     * 1.2. then print not Prime
     * 3.else Prime
     * <p>
     * <p>
     * divisible num should be less than num if num is Not Prime
     */

    public boolean primeIntNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }


/**
 * 3. Create a method to find if given string is palindrome.
 * Palindrome: string which reads the same in reverse.
 * racecar  ->  racecar
 * level    ->  level
 * Plan:
 * 1.take intake word and split by letters in string array
 * 2. loop on the string array
 * 2.1. take each letter and store in reverse order
 * 3. compare intake word and reverse word if it is equal
 * 4. print true if they are equal
 * 5. return true;
 * 6.  otherwise print false
 * 7. return false
 */


   public boolean palindrome(String word) {
        String reverseword = "";
        String[] splitByLetter = word.split("");
        for (int i = 0; i <= splitByLetter.length - 1; i++) {
            reverseword = splitByLetter[i] + reverseword;
        }
        if (word.equalsIgnoreCase(reverseword)){
            return true;
        } else{
            return false;
        }
}


/**
 * 4. Write a method to print(no return) the duplicate values in a given String array.
 * Input String array -> {"hello", "peace", "happy" , "hello", "Happy", "hello"}
 * Method should print -> hello, happy
 * Plan:
 * 1.Signature -public void duplicateValue(String[] words)
 * 2. Body of the method. Plan:
 * 2.1. for loop.String array words.
 * 2.2. Body of the loop:
 *
 */
public void duplicateWord(String[] allwords){
    String findDuplicate="";
    for(int i=0;i<=allwords.length-1;i++){
        if(allwords[i].contains(findDuplicate)) {
            findDuplicate = allwords[i];
          continue;

        }
    }
    System.out.println(findDuplicate);
}

/**
 * 5. Write a method to print(no return) the common values between two arrays (string arrays)
 * Input arrays:
 * arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
 * arr2 -> {"hello", "grow", "laugh" , "peace"}
 * Method should print -> hello, peace, laugh
 * hello
 * peace
 * laugh
 * Plan:
 * 1. first loop:
 * 1.1. string array firstArray
 * 1.2. Body:
 * 2.  second loop:
 * 2.1. string array secondArray
 * 2.2.Body:
 * 2.3.compare string from outside loop with string from inside loop.
 * 2.4. if it is equal then print that string
 *
 */

    public void twoArrayComparison(String[] firstArray, String[] secondArray) {
        String results= "";

        for (int i = 0; i <=firstArray.length-1; i++){
            if(results.contains(firstArray[i])){
                continue;
            }
            for (int j=0; j<=secondArray.length-1; j++){
                if (firstArray[i].equalsIgnoreCase(secondArray[j])){
                    results+=firstArray[i]+" ";

                }
            }
        }
        System.out.println(results);






}
}


