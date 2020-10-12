package Class1;

import java.sql.SQLOutput;

public class MyPractice {

    public static void main(String[] args) {

        Homework7 H7= new Homework7();
        double[] value ={12.2,34.3,45.6,45.2};
        System.out.println(H7.addNum(value));


        int num = 10;
        System.out.println(H7.primeIntNumber(num));

        String word= "level";
        System.out.println(H7.palindrome(word));

        String[] first = {"hello", "peace", "happy", "hello", "Happy", "hello", "laugh"};
        String[] second = {"hello", "grow", "laugh", "peace"};
        H7.twoArrayComparison(first,second);


        }

    }


