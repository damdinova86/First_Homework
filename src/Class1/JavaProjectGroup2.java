package Class1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaProjectGroup2 {

    /**
     * Teachers
     * 1. Can define the number of students they have
     * 2. Can remove students from their class
     * 3. Take student attendance, mark student as present, excused absent or unexcused
     * absent.
     * 4. Take their own attendance
     * 5. Teacher can only see and edit their own class.
     * 6. If teacher has too many absences, teacher will get a warning when logged in.
     * 7. Teacher can let Administrator know they will be absent. This will show once their
     * Administrator logs in to their account.
     */

    String id;
    int SizeOfClass;
    HashMap<String, String> attendance = new HashMap<>();;

   // public Teacher(String teacherID, int studentsInClass) {
      //  numOfStudents(studentsInClass);
       // id = teacherID;

    //}

    //Can define the numbers of students they have
    public void numOfStudents(int num) {

        System.out.println("Please enter the number of students you would like to define for your class.");
        Scanner scan = new Scanner(System.in);
        scan.nextInt(num);

        if (num > 10) {
            System.out.println("Please enter number 10 or less than 10.");
        }

        if (num <=10) {
            SizeOfClass = num;
        }
        System.out.println("Your class will have "+SizeOfClass +" students");

    }
    //4. Add Students from Admin section

    public void addStudents(String studentsID) {
        System.out.println("Please enter the ID number to add students for your class");
        Scanner scan = new Scanner(System.in);
        scan.next(studentsID);

//
//        if (attendance.size() < SizeOfClass) {
//            attendance.put(id, "");
//            System.out.println(attendance);
//        } else {
//            System.out.println("You can't add more than 10 students");
//        }
    }


    //Can remove students from their class
    public void removeStudent(String id) {
        attendance.remove(id);
        System.out.println(attendance);
    }

    //Take student attendance mark present, excused absent, unexcused absent
    public void studentsAttendance(String id, String presentOrexcusedabsentOrunexcusedabsent) {
        attendance.put(id, presentOrexcusedabsentOrunexcusedabsent);
        System.out.println("Attendance for class for today: "+attendance);


//        Set<String> allKeys= attendance.keySet();
//        System.out.println(allKeys);


    }



}
