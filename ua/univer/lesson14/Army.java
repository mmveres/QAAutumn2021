package ua.univer.lesson14;

import java.io.Serializable;
import java.util.List;

public class Army implements Serializable {
    private String name;
    List<Droid> droids;

    public Army() {
    }

    public Army(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                '}';
    }
}
