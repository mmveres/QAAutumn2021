package ua.univer.lesson06.vuz;

public class Program {
    public static void main(String[] args) {
        Student.setFaculty("JAVA_IT");

        StudentList studentList = new StudentList(StudentUtil.generate4Student());


        studentList.print();
        Student.setFaculty("Java_From_Epam");
        studentList.print();

        System.out.println(studentList);

        int age = studentList.getMaxAgeStudent();
        System.out.println(age);

        Student st = studentList.getStudentWithMaxAge();
        System.out.println(st);


    }
}
