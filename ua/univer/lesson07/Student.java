package ua.univer.lesson07;

import java.util.Arrays;

public class Student extends Human {

    private int group;
    private int[] marks;

    public Student(String name, int age, int group) {
        super(name, age);
        this.group = group;
        this.marks = null;
    }

    public void study(){
        System.out.println("i'm study");
    }


    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + super.getAge() +
                ", group=" + group +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
