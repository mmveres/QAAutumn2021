package ua.univer.lesson08;

public class Airplane extends Vehicle{
    private int height;
    private int people;

    public Airplane(String name, int speed, int age, Point coord, int height, int people) {
        super(name, speed, age, coord);
        this.height = height;
        this.people = people;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "height=" + height +
                ", people=" + people +
                "} " + super.toString();
    }
}
