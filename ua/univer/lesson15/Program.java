package ua.univer.lesson15;

import ua.univer.lesson14.Army;
import ua.univer.lesson14.Droid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Droid d1 = new Droid();
        Droid.Engine engine = new Droid.Engine(100,"ABC");
        Droid.Body bodyDroid = d1.new Body(1000);

        List<Droid> droidList = new ArrayList<>() ;
        droidList.add(new Droid("A1", 110, new Army("A")));
        droidList.add(new Droid("A2", 100, new Army("C")));
        droidList.add(new Droid("A3", 120, new Army("B")));
        droidList.add(new Droid("A2", 110, new Army("A")));
        droidList.add(new Droid("A1", 100, new Army("C")));
        droidList.add(new Droid("A1", 120, new Army("B")));
        Collections.sort(droidList, ( o1,  o2) -> {
                if (o1.getName() != o2.getName())
                    return o1.getName().compareTo(o2.getName());
                else
                return o1.getHealth() - o2.getHealth();
            }
       );

        System.out.println(droidList);

        Collections.sort(droidList, new Comparator<Droid>() {
            @Override
            public int compare(Droid o1, Droid o2) {
                return o1.getHealth() - o2.getHealth();
            }
        });

        Collections.sort(droidList, (o1,  o2) ->  o1.getHealth() - o2.getHealth());

        Collections.sort(droidList, Comparator.comparingInt(Droid::getHealth).thenComparing(Droid::getName).reversed());
    }
}
