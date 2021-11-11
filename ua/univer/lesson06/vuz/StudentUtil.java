package ua.univer.lesson06.vuz;

public class StudentUtil {
    public static Student[] generate4Student(){
        Student[] students = new Student[4];
        Student st1 = new Student();
        Student st2 = new Student("Bob2");
        Student st3 = new Student("Bob3", 22);
        Student st4 = new Student("Bob4", 23);
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
       return students;
    }
    public static Student[] getStudentFromFile(String filename){return null;}
}
