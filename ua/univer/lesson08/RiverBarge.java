package ua.univer.lesson08;

public class RiverBarge extends Vehicle implements CruiseAble{
    public RiverBarge(String name, int speed, int age, Point coord) {
        super(name, speed, age, coord);
    }
    public void dock(){
        System.out.println("Docking");
    }
    public int cruise(){
        return getSpeed();
    }

    @Override
    public String toString() {
        return "RiverBarge" + super.toString();
    }
}
