package ua.univer.lesson07;

public class Fighter extends Human{
    private int power;
    private int defence;

    public Fighter(String name, int age, int power, int defence) {
        super(name, age);
        this.power = power;
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "power=" + power +
                ", defence=" + defence +
                "} " + super.toString();
    }
}
