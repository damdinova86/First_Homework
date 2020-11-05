package Class1;

import java.util.*;

public class Homework10 {
    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     * happy - 2
     * joy - 3
     * laugh - 2
     * <p>
     */

    public static void main(String[] args) {


        List<String> duplicates= Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy");
        Set<String> unique= new HashSet<>(duplicates);
        for(String s:duplicates){
            if(!unique.add(s)){
                System.out.println(s);
            }
        }



    }

     /** Question 2:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     * <p>
     * Create method that will print the keys with same value, else "All keys have different values"
     * <p>
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     * "happy" with keys -> 101, 103, 106
     * "peace" with keys -> 102, 105
     * <p>
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     * All keys have different values
     */



}

