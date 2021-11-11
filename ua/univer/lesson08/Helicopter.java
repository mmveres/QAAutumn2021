package ua.univer.lesson08;

public class Helicopter extends Airplane{
    public Helicopter(String name, int speed, int age, Point coord, int height, int people) {
        super(name, speed, age, coord, height, people);
    }

    @Override
    public String toString() {
        return "Helicopter" + super.toString();
    }
}
