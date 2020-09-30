package Class1;

public class Homework4 {
    public static void main(String[] args) {

        /**
         * Create variable to store student-score and total-possible-score;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore = 150;     //  (score/max)*100
        double maxScore = 160;
        double scoreInPercentage = studentScore / maxScore * 100;

        if (scoreInPercentage >= 91) {
            System.out.println("Your percentage is " + scoreInPercentage + " and your grade is: A");
        } else if (scoreInPercentage >= 81 && scoreInPercentage <= 90) {
            System.out.println("Your percentage is " + +scoreInPercentage + " and your grade is: B");
        } else if (scoreInPercentage >= 71 && scoreInPercentage <= 80) {
            System.out.println("Your percentage is " + +scoreInPercentage + " and your grade is: C");
        } else if (scoreInPercentage >= 61 && scoreInPercentage <= 70) {
            System.out.println("Your percentage is " + +scoreInPercentage + " and your grade is: D");
        } else if (scoreInPercentage >= 51 && scoreInPercentage <= 60) {
            System.out.println("Your percentage is " + +scoreInPercentage + " and your grade is: E");
        } else {
            System.out.println("Your percentage is " + +scoreInPercentage + " and your grade is: F");
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */
        int num = 10;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("divisible by both");
        } else if (num % 3 == 0) {
            System.out.println("divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("divisible by 5");

        } else {
            System.out.println(num);
        }
        /**
         * Checking car mode (P, D, N, R)   // switch
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */
        char gear = 'R';
        String cMode = "Eco";  // Snow, Sport or Eco

        switch (gear) {
            case 'P':
                System.out.println("you can park car");
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("revere the car");
                break;
            case 'D':
                if (cMode == "Snow") {
                    System.out.println("You are on Snow mode");
                } else if (cMode == "Sport") {
                    System.out.println("You are on Sport mode");
                } else if (cMode == "Eco") {
                    System.out.println("You are on Eco mode");
                }

        }


    }
}
