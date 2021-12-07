package ua.univer.lesson14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Droid implements Serializable {
    private Body body;
    private Engine engine;
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
        this.engine = new Engine(100, "ABC1");
        this.body = new Body(1000);
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

    public static class Engine {
        private double power;
        private String name;
        public TypeEngine typeEngine;

        public enum TypeEngine{
            DIESEL, GASOLINE, ELECTRIC;
        }

        public Engine(double power, String name) {
            this.power = power;
            this.name = name;
            this.typeEngine =TypeEngine.ELECTRIC;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public class Body {
        private double defence;

        public Body(double defence) {
            this.defence = defence;
        }

        public double getDefence() {
            return defence;
        }

        public void setDefence(double defence) {
            this.defence = defence;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "defence=" + defence +
                    '}';
        }
    }
}
