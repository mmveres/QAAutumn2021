package ua.univer.lesson10.abs;

public abstract class Vehicle {
    private int _bonus;

    public int get_Bonus() {
        return _bonus;
    }

    public void set_Bonus(int bonus) {
        this._bonus = bonus;
    }

    abstract int setBonus(int bonus);
}
