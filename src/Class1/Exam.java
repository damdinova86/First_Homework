package Class1;

public class Exam {
    public static void main(String[] args) {
        Exam E1= new Exam();
        //Problem 1
        int [] array= {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int num =24;
        System.out.println("Returned array: "+E1.removeInputNum(array,num));

        //Problem 2
        int[] array2= {-1, -3, 4, 2};
        System.out.println(E1.smallestPosInt(array2));

        //Problem 3
        double speed = 80;
        int speed1= 80;
        E1.SpeedLimit(speed);
        E1.SpeedLimitVersion2(speed1);


    }
    /**
     * Question 1:
     * Create a method to return an int-array after removing a given int-value
     * from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *
     *
     */

    public String removeInputNum(int[] array, int num){
        String showFinalValue="";
        for(int i=0; i<=array.length-1; i++){
            int value = array[i];
            if(value==num){
                continue;
            }
            else {
                showFinalValue+=value+" ";
            }
        }
        return showFinalValue;
    }
    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     *
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     *
     */

    public int smallestPosInt(int[] array) {

         for(int k=1; k<=array.length;k++){   // this is 1,2,3,4,....
             int storage =0;

             for(int i=0; i<=array.length-1;i++){  // this is array
                 if(array[i]==k){
                     storage+=1;
                 }
             }
             if (storage == 0){
                 return k;
             }
         }
        return 0;



    }

    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points charged against
     * the license for over speeding.
     *
     *    1. Speed Limit = 70
     *    2. Every 5 miles over the speed limit will add 1 point
     *    3. If user gets 12 points for a speed then license is suspended
     *
     *  Example:
     *      user speed = 74 ; 0 points
     *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     *      user speed = 178 ; 21 points (License suspended).
     *      user speed = 70 ; Thank you for driving within the speed limit.
     *
     */
//version 1 with double speed limit
    public void SpeedLimit(double speed){

        if(speed<=70){
            System.out.println("Thank you for driving within the speed limit");
        } else if(speed>70){
            double points = (speed-70)/5;
            long pointsRounded = Math.round(points);
            if(pointsRounded>=12){
                System.out.println("License suspended");
            }
            System.out.println("You got "+pointsRounded+" points");

        }

    }
    //version 2 with int speed limit

    public void SpeedLimitVersion2(int speed){

        if(speed<=70){
            System.out.println("Thank you for driving within the speed limit");
        } else if(speed>70){
            int points = (speed-70)/5;
            if(points>=12){
                System.out.println("License suspended");
            }
            System.out.println("You got "+points+" points");

        }

    }
}
