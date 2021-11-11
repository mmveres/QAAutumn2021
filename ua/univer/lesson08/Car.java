package ua.univer.lesson08;

public class Car extends Vehicle{
    public Car(String name, int speed, int age, Point coord) {
        super(name, speed, age, coord);
    }

    @Override
    public String toString() {
        return "Car"+super.toString();
    }
}
