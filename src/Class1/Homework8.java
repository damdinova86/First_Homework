package Class1;

public class Homework8 {
// Subject: Homework-8

    int maxTonerLevel = 100;
    int maxPagesInTray = 100;
    static int usageOfToner = 0;
    static int usageOfPaper = 0;


    //3.a) printSingle


    public void printSingle(int numPageSingle) {
        usageOfPaper += numPageSingle;
        usageOfToner += numPageSingle;
        if (usageOfPaper <= maxPagesInTray && usageOfToner <= maxTonerLevel) {
            System.out.println("Printing " + numPageSingle + " pages");
        } else {
            System.out.println("Please add paper/toner");
        }
    }

    //3.b) printDouble
    public void printDouble(int numPagesDouble) {
        usageOfPaper += (numPagesDouble + 1) / 2;
        usageOfToner += numPagesDouble;
        if (usageOfPaper <= maxPagesInTray && usageOfToner <= maxTonerLevel) {
            System.out.println("Printing " + (numPagesDouble + 1) / 2 + " double pages");
        } else {
            System.out.println("Please add paper/toner");
        }
    }

    //4. printerSummary
    //Toner level:
    // Pages count in tray:

    public void printerSummary() {
        int tonerLevel = maxTonerLevel - usageOfToner;
        System.out.println("Toner level: " + tonerLevel);
        int pagesLevel = maxPagesInTray - usageOfPaper;
        System.out.println("Pages count in tray: " + pagesLevel);
    }

    //5. checkToner. If toner is less than 10; it should warn to "Add toner"
    public void checkToner() {
        if (maxTonerLevel - usageOfToner < 10) {
            System.out.println("Add toner");
        } else {
            System.out.println("Sufficient amount of toner");
        }

    }

    //1. addToner
    public void addToner(int num) {
        if (num <= usageOfToner) {
            usageOfToner -= num;
            System.out.println("Toner has been added: " + num);
        } else {
            System.out.println(+num + " is more than usage amount of toner");
        }
    }


    //2. addPages
    public void addPages(int num) {
        if (num <= usageOfPaper) {
            usageOfPaper -= num;
            System.out.println("Paper has been added: " + num);
        } else {
            System.out.println(+num + " is more than usage amount of paper ");
        }
    }


}
