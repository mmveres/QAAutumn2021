package ua.univer.lesson08;

public class Ship extends Vehicle{
    private String port;
    private int people;

    public Ship(String name, int speed, int age, Point coord, String port, int people) {
        super(name, speed, age, coord);
        this.port = port;
        this.people = people;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "port='" + port + '\'' +
                ", people=" + people +
                "} " + super.toString();
    }
}
