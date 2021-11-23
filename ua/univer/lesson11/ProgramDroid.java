package ua.univer.lesson11;

import java.util.HashSet;
import java.util.Set;

public class ProgramDroid {
    public static void main(String[] args) {
        Set droids = new HashSet();
        droids.add(new Droid("A"));

        droids.add(new RepairDroid("R2",2,2));
        System.out.println(droids.toString());


        System.out.println(droids.contains(new RepairDroid("R2")));
    }
}
