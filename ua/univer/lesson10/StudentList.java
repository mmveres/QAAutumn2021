package ua.univer.lesson10;

import java.util.ArrayList;
import java.util.List;

public class StudentList<T extends AgeAble > {
    private List<T> students;


    public StudentList(int n){
        students = new ArrayList<T>();

    }
    public StudentList(List<T> students){
        this.students = students;

    }

    public T[] toArray(){
        return (T[]) students.toArray();
    }


    public boolean add(T st){

        return students.add(st);
    }

    public int getMaxAgeStudent(){
        int max_age = 0;
        for (int i = 0; i < students.size(); i++) {
            if (max_age< students.get(i).getAge()){
                max_age = students.get(i).getAge();
            }
        }
        return max_age;
    }

    public T getStudentWithMaxAge(){
        T max_age_student = students.get(0);
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
        System.out.println(students);
    }

    @Override
    public String toString() {

        return "StudentList{" +
                "students=" + students +
                ", count=" + students.size() +
                '}';
    }
}