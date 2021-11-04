package ua.univer.lesson06.vuz;

public class Student {
    private static String faculty = "IT";
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        this.age = 20;
    }

    public Student(int age) {
        this.name = "Bob";
        this.age = age;
    }

    public Student() {
        this.name = "Bob";
        this.age = 20;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static void setFaculty(String faculty) {
        Student.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty = " + faculty +
                '}';
    }
}
