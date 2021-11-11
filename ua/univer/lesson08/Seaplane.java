package ua.univer.lesson08;

public class Seaplane extends Airplane implements CruiseAble, Sailor{
    public Seaplane(String name, int speed, int age, Point coord, int height, int people) {
        super(name, speed, age, coord, height, people);
    }
    public void dock(){

    }
    public int cruise(){
        return getSpeed()/10;
    }

    @Override
    public String toString() {
        return "Seaplane" + super.toString();
    }
}
