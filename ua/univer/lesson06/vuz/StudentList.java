package ua.univer.lesson06.vuz;

import java.util.Arrays;

public class StudentList {
    private Student [] students;
    private int count;


    public StudentList(int n){
        students = new Student[n];
        count = 0;
    }

    public Student[] toArray(){
        return students;
    }

    public void generate4Student(){
        Student st1 = new Student();
        Student st2 = new Student("Bob2");
        Student st3 = new Student("Bob3", 22);
        Student st4 = new Student("Bob4", 23);
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        count = 4;
    }
    public boolean add(Student st){
        if(count < students.length) {
            students[count] = st;
            count++;
            return true;
        }
        return false;
    }

    public int getMaxAgeStudent(){
        int max_age = 0;
        for (int i = 0; i < students.length; i++) {
            if (max_age< students[i].getAge()){
                max_age = students[i].getAge();
            }
        }
        return max_age;
    }

    public Student getStudentWithMaxAge(){
        Student max_age_student = students[0];
//        for (int i = 0; i < students.length; i++) {
//            if (max_age_student.getAge() < students[i].getAge()){
//                max_age_student = students[i];
//            }
//        }

        for (Student student: students ) {
            if (max_age_student.getAge() < student.getAge()){
                max_age_student = student;
            }
        }

        return
                max_age_student;
    }

    public void print(){
        for (int i = 0;
             i < students.length;
             i++) {
            System.out.println(
                    students[i]
            );
        }
    }

    @Override
    public String toString() {

        return "StudentList{" +
                "students=" + Arrays.toString(students) +
                ", count=" + count +
                '}';
    }
}
