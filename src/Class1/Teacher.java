package Class1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Teacher {
    String id;
    int SizeOfClass;
    HashMap<String, String> attendance;

    public Teacher(String teacherID, int studentsInClass) {
        numOfStudents(studentsInClass);
        id = teacherID;
        attendance = new HashMap<>();
    }

    //Can define the numbers of students they have
    public boolean numOfStudents(int num) {
        if (num > 10) {
            return false;
        }
        if (num <=10) {
            SizeOfClass = num;
        }
        return true;

    }
    //4. Add Students from Admin section

    public void addStudents(String id) {

        if (attendance.size() < SizeOfClass) {
            attendance.put(id, "");
            System.out.println(attendance);
        } else {
            System.out.println("You can't add more than 10 students");
        }
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
