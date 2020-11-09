package Class1;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework11 {
    public static void main(String[] args) {


        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        /**
         * Question 1:
         * Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */
        Homework11 H1= new Homework11();
     H1.maxCount(arr);


    }

    public void maxCount(String[] arr){
        HashMap<String, Integer> colorHashMap= new HashMap<>();
        // for loop to create HashMap
        for (int i = 0; i < arr.length; i++){
            String key= arr[i];
            if(colorHashMap.containsKey(key)){
                colorHashMap.put(key,colorHashMap.get(key)+1);
            }else{
                colorHashMap.put(key, 1);
            }

        }
        //to find max count and return key
        Collection<Integer>allValues=colorHashMap.values();
        Integer max = Collections.max(allValues);




        Iterator colorIterator= colorHashMap.entrySet().iterator();
        while (colorIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) colorIterator.next();
            int value= (int) mapElement.getValue();

            if(value==max){
                System.out.println((String) mapElement.getKey());
            }
        }





     }

    /**
     * Question 2:
     * Create a method that will take an int as input.
     * return the timeline (houram/pm) with interval of 2 hour from the current hour.
     */
    // System.out.println(generateTimline(5));
    // 10pm 12am 2am 4am 6am

    // System.out.println(generateTimline(8)); // executing method at 9am
    // 11am 1pm 3pm 5pm 7pm 9pm 11pm 1am

    public void hourIncrease (int input){
        Date now= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("hh a");
        String time = dateFormat.format(now);
        System.out.println(time);

        //to add 2 hours
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("hh a");
        cal.add(Calendar.HOUR, 2);
        String changedTime = simpleDateFormat.format(Calendar.HOUR);
        System.out.println(cal.getTime());

    }




    }


