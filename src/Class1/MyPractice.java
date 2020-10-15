package Class1;

import java.sql.SQLOutput;

public class MyPractice {

    public static void main(String[] args) {
        Homework8 H8 = new Homework8();
        H8.printSingle(90); //90,91,89
//       H8.printSingle(90);
//        H8.printSingle(1);
//        H8.printDouble(0); //100,99, 101,0,1
//        H8.printDouble(3);
       // H8.printDouble(10);
      H8.printerSummary();
//        H8.checkToner();
        H8.addPages(90); // 90, 91,89, 0, 1
        H8.printerSummary();


    }

}


