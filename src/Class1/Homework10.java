package Class1;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        Homework10 H1 = new Homework10();
        List<String> words = new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("peace");
        words.add("happy");
        words.add("peace");
        words.add("grow");
        System.out.println(H1.duplicates(words));

//101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}

        HashMap<Integer, String> inputHashMap= new HashMap<>();
        inputHashMap.put(101, "happy");
        inputHashMap.put(102, "peace");
        //inputHashMap.put(103, "Happy");
        inputHashMap.put(104, "learn");
       // inputHashMap.put(105, "PEaCe");
        //inputHashMap.put(106, "HAPPY");

        System.out.println(H1.myMethod(inputHashMap));




    }

    /**
     * Question 1:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     * happy - 2
     * joy - 3
     * laugh - 2
     * plan:
     * 1. create 2 loops and take fist word and compare with others.
     * if it is == then store the value and count too
     */

    public HashMap<String, Integer> duplicates(List<String> words) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        HashMap<String, Integer> mySecondHashMap = new HashMap<>();

        // for loop to create HashMap
        for (int i = 0; i < words.size(); i++) {
            String key = words.get(i);
            if (myHashMap.containsKey(key)) {
                // if hashmap contains key
                myHashMap.put(key, myHashMap.get(key) + 1);
            } else {
                //if hashmap doesn't contain key
                myHashMap.put(key, 1);
            }

        }

        // to delete value 1 from HashMap
        Iterator myIterator = myHashMap.entrySet().iterator();
        while (myIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) myIterator.next();  //to get access to hashmap element
            int value = (int) mapElement.getValue();
            if (value >= 2) {
                mySecondHashMap.put((String) mapElement.getKey(), value);

            }
        }
        return mySecondHashMap;
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

     public HashMap<String, String> myMethod(HashMap<Integer, String> inputHashMap) {
         HashMap<String, String> interHashMap = new HashMap<>();
         HashMap<String, String> finalHashMap = new HashMap<>();
         Iterator inputIterator= inputHashMap.entrySet().iterator();

         // to create hashmap
         while (inputIterator.hasNext()){
             Map.Entry mapElement =(Map.Entry) inputIterator.next();
             String value= String.valueOf((int) mapElement.getKey());
             String key= ((String) mapElement.getValue()).toLowerCase();

             if(interHashMap.containsKey(key) ){
                 interHashMap.put(key, interHashMap.get(key)+" ,"+value);


             }else{
                 interHashMap.put(key, value);
             }
         }
         Iterator interIterator = interHashMap.entrySet().iterator();
         while (interIterator.hasNext()) {
             Map.Entry mapElement = (Map.Entry) interIterator.next();
             String value = (String) mapElement.getValue();
             if(value.contains(",")){
                 finalHashMap.put((String) mapElement.getKey(), value);
             }
         }

         if(finalHashMap.isEmpty()){
             System.out.println("All keys have different values");
         }







        return finalHashMap;
     }
}










