package ua.univer.lesson11;

import java.util.*;

public class ProgramDroid {
    public static void main(String[] args) {
        Set droids = new HashSet();
        droids.add(new Droid("A"));

        droids.add(new RepairDroid("R2",2,2));
        System.out.println(droids.toString());


        System.out.println(droids.contains(new RepairDroid("R2")));

        String s1 = new String("AAA");
        String s2 = new String("AAA");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+ " " + s2.hashCode());


        List<Droid> droids1 = new ArrayList<>();
        droids1.add( new Droid("C"));
        droids1.add( new Droid("B"));
        droids1.add( new Droid("A"));
        droids1.add( new Droid("D"));

        Collections.sort(droids1, new Comparator<Droid>() {
            @Override
            public int compare(Droid o1, Droid o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(droids1);
    }
}
