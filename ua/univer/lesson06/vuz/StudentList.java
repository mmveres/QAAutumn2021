package ua.univer.lesson06.vuz;

import java.util.Arrays;
interface AgeAble{
   int getAge();
}
public class StudentList<T extends AgeAble> {
    private T [] students;
    private int count;


    public StudentList(int n){
        students = (T[]) new Object[n];
        count = 0;
    }
    public StudentList(T [] students){
        this.students = students;
        count = students.length;
    }

    public T[] toArray(){
        return students;
    }


    public boolean add(T st){
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

    public T getStudentWithMaxAge(){
        T max_age_student = students[0];
//        for (int i = 0; i < students.length; i++) {
//            if (max_age_student.getAge() < students[i].getAge()){
//                max_age_student = students[i];
//            }
//        }

        for (var student: students ) {
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
