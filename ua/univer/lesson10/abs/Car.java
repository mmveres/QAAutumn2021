package ua.univer.lesson10.abs;

public class Car extends Vehicle{

    @Override
    public int setBonus(int bonus) {
        super.set_Bonus(bonus);
        return get_Bonus();
    }
}
