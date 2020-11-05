package Class1;

import java.sql.SQLOutput;
import java.util.*;

public class Homework9 {
    static int capacity;
    static int guestCount;
    String restaurantOfName;

    //4.Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity

    public Homework9(String restaurantName, int guestCapacity) {
        capacity = guestCapacity;
        restaurantOfName = restaurantName;
        System.out.println("Welcome to the restaurant " + restaurantName + " with capacity of " + guestCapacity + " guests!");

    }

    // Create a method that tells user if the seats are available
    public boolean seatsAvailable(int requestNum) {
        int availableSeats = capacity - guestCount;
        if (availableSeats >= requestNum) {
            return true;
        } else {
            return false;
        }

    }

    //2. Create a method that seatsParty
    public void seatsParty(int guestCount) {
        if (guestCount <= capacity) {
            guestCount += guestCount;
            System.out.println("Current guest count " + guestCount);
        } else {
            System.out.println(("Sorry we don't have available seats at this moment"));
        }

    }

    //3. Create a method that removesParty
    public void removesParty(int leavingGuestCount) {
        if (leavingGuestCount <= capacity) {
            guestCount -= leavingGuestCount;
            System.out.println("Current  guest count after leaving " + guestCount);
        } else {
            System.out.println("Wrong number! The entered number is more than the capacity of the restaurant");

        }
    }


    //5. Create a method that printsRestaurantSummary(Restaurant Name, Current Guest count and Guest Capacity)

    public void printsRestaurantSummary() {
        System.out.println("Name: " + restaurantOfName);
        System.out.println("Current Guest Count: " + guestCount);
        System.out.println("Guest Capacity " + capacity);
    }


    //this main method can be in another class, but I put all together to call methods.
    public static void main(String[] args) {

        Homework9 H1 = new Homework9("Wong Lee", 10);
        System.out.println(H1.seatsAvailable(9));
        H1.seatsParty(9);
        H1.removesParty(9);
        H1.printsRestaurantSummary();


    }
}
