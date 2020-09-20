package Class1;

import java.sql.SQLOutput;

public class MyPractice {

    public static void main(String[] args) {

        int amount = 100;
         int discount = 10;

        System.out.println("Amount is " + amount + ", discount is " + discount);

        float mortgageRate = 1.1f;
        System.out.println("Mortgate Rate is " +mortgageRate);

        char singleLetter = 'A';
        System.out.println("First letter in alphabets => " + singleLetter);

        singleLetter = 'Z';
        System.out.println("Letter in alphabets is " + singleLetter);

        singleLetter = '1';
        System.out.println(singleLetter);

        boolean isRaining = true;
        System.out.println("Is raining currently? " + isRaining);


        String myName = "Balzhima Damdinova";
        System.out.println(myName);

        int abc = 20;
                int def = abc;

        /**
         * Arithmetic
         *+ plus
         * % - Modulus
         * ++ - increment (pre-increment/ post-increment)
         * -- - decrement (pre-increment/ post-increment)
         *
         *
         *
         *
         *
         *
         *
         */

        int num1 = 10;
                int num2 = 20;
                        int num3 = num1 +num2; // 10+20=30
        int num4 = num1+num2+num3; // 10+20+30=60
        System.out.println("num4 = " + num4);

        num4= num4 + num1; // 60+10=70

        double dNum =100;
        double res= dNum + num1; //100+10=110 one is variable double
        System.out.println("res = " + res);
        int result = (num1+num2) - (num1-num4) * num2+num3;
                    //(10+20) - (10-70)*(20+30)
                    // (30)+60*20+30
                    // 30+1200+30=1260
        System.out.println("res = " +result);

        double divRes = num2/3.0; // 20/3 -> 6
        // double/int -> double
        // int/double --> double

        System.out.println("devRes = " + divRes);

        //Modulus
/**
 * 20/3 -> 6 (2)
 * 40/5 -> 8 (0)
 * 11/4 -> 2 (3)
 *
 */

        System.out.println("40 % 5 " + 40%5);
        System.out.println("20 % 3 " + 20%3);
        System.out.println("11 % 4 " + 11%4);

        // 14%2=0
        // 15%2=1
        int inc = 10;
        inc++; //inc=11
        ++inc; //inc=12

        /**
         *
         * increment (++)
         * post-increment- use the current value of variable, then increment
         * b++
         *
         *
         * pre-increment - increment the value of variable, then use
         * ++b
         *
         */

        System.out.println(inc++); //print ->12 and inc=13
        System.out.println(++inc); //print ->14 and inc 14
int i1=1;
int i2= i1++; // i2= 1, i1=2
        // i2 = 1, i1=2

        i2= ++i1; // i2=
        System.out.println("i1= "+ i1); // i1= 2
        System.out.println("i2= "+ i2);  // i2= 1

int ab =5;
        System.out.println(ab++); //print 5, ab=6
        System.out.println(++ab); // print 7, ab =7
        System.out.println(ab); // ab=7
        System.out.println(ab++); // print 7, ab=8
        System.out.println(ab); //ab=8
        System.out.println(ab++); //print 8, ab=9
        System.out.println(++ab); // print 10, ab= 10
        System.out.println(ab);// print 10
int dec =10;
        System.out.println(dec--); // print 10, dec=9
        System.out.println(--dec); // dec=8, print 8

        int com1=5;
                int com2= 7;
                boolean com1com2 = com1>com2;
        System.out.println(com1 + ">" + com2 + "= " + com1com2);
boolean cc= com1 == com2;
        System.out.println( com1 + " == " + com2+  " = " + cc);

        // Logical operators && -and, || - or, ! -not

        int lVal1 =10, lVal2 =20, lVal3=30, lVal4=40;
        boolean resul= lVal1 <= lVal3 && (lVal2 == (lVal4- lVal1-lVal1));
        System.out.println(resul);

        //when you use comparison the variable type is boolean and it always give true or false
        // true && true -> true
        // true && true && false -> false
        // when you have "||-or"
        // true || true || false -> true
        // when you have "!- not"
        // !true || true || false -> !true -> false
    }
}
