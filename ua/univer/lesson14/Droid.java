package ua.univer.lesson14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Droid implements Serializable {
    private String name;
    private int health;
    private transient Army army;
    List<String> weapons = new ArrayList<>();
    public Droid(){

    }

    public Droid(String name, int health, Army army) {
        this.name = name;
        this.health = health;
        this.army = army;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void addWeapons(String weapon) {
        this.weapons.add(weapon);
    }

    @Override
    public String toString() {
        return "\nDroid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", army=" + army +
                ", weapons=" + weapons +
                '}';
    }
}
