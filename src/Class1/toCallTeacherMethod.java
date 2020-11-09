package Class1;

public class toCallTeacherMethod {
    public static void main(String[] args) {
        Teacher T1= new Teacher("1234", 9);

        T1.numOfStudents(9);

        T1.addStudents("1");
        T1.addStudents("2");
        T1.addStudents("3");
        T1.addStudents("4");
        T1.addStudents("5");
        T1.addStudents("6");
        T1.addStudents("7");
        T1.addStudents("8");
        T1.addStudents("9");




        T1.removeStudent("5");
        T1.removeStudent("8");

        T1.studentsAttendance("1", "excused absent");
        T1.studentsAttendance("2", "present");
        T1.studentsAttendance("3","unexcused absent");
        T1.studentsAttendance("4", "excused absent");
        T1.studentsAttendance("6","present");
        T1.studentsAttendance("7", "present");
        T1.studentsAttendance("9","unexcused absent");







    }
}
