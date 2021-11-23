package ua.univer.lesson11;

import java.util.Objects;

public class Droid {
    private String name;
    private int x;
    private int y;

    public Droid(String name) {
       this(name, 0, 0);

    }

    public Droid(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Droid droid = (Droid) o;
        return Objects.equals(name, droid.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                "hash='" + hashCode() + '\'' +
                '}';
    }
}
