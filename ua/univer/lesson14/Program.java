package ua.univer.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Program {
    public static void main(String[] args) throws IOException {
        List<Droid> droids = new ArrayList<>();
        Army armyA = new Army("A");
        droids.add(new Droid("R2D1", 100, armyA));
        droids.add(new Droid("R2D2", 90, armyA));
        droids.add(new Droid("R2D3", 70, armyA));

        for (var droid : droids) {
            droid.addWeapons("Gun");
        }




     //   writeDroidsToDataOutputByAttribute(droids);
     //   writeDroidsToTxtByAttribute(droids);
     //   DroidUtil.writeDroidsToCSVByAttribute(droids);
     //   writeDroidsToOneFileByDataOutputByAttribute(droids);
     //   List<Droid> droidList = readDroidsToDataOutputByAttribute("droid.dat");
     //   System.out.println(droidList);

    }


}
