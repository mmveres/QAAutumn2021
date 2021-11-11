package ua.univer.lesson08;

public abstract class Vehicle {
    private String name;
    private int speed;
    private int age;
    private Point coord;

    public Vehicle(String name, int speed, int age, Point coord) {
        this.name = name;
        this.speed = speed;
        this.age = age;
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Point getCoord() {
        return coord;
    }

    public void setCoord(Point coord) {
        this.coord = coord;
    }
    //public abstract void show();
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                ", coord=" + coord +
                '}';
    }
}
