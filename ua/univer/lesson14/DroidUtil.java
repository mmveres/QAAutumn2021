package ua.univer.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DroidUtil {
    public static List<Droid> readDroidsToDataOutputByAttribute(String filename) throws IOException {
        List<Droid> droids = new ArrayList<>();
        try (DataInputStream fw = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filename)))) {
            while (fw.available() > 0) {
                Droid d = getDroid(fw);
                droids.add(d);
            }
        }
        return droids;
    }

    private static Droid getDroid(DataInputStream fw) throws IOException {
        Droid d = new Droid(fw.readUTF(), fw.readInt(), new Army(fw.readUTF()));
        int countWeapon = fw.readInt();
        for (int i = 0; i < countWeapon; i++) {
            d.addWeapons(fw.readUTF());
        }
        return d;
    }

    public static void writeDroidsToDataOutputByAttribute(List<Droid> droids) throws IOException {
        try (DataOutputStream fw = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("droid.dat")))) {
            for (var droid : droids) {
                writeDroid(fw, droid);
            }
        }
    }
    public static void writeDroidsToOneFileByDataOutputByAttribute(List<Droid> droids) throws IOException {

        for (int i =0; i< droids.size(); i++) {
            try (DataOutputStream fw = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(droids.get(i).getName()+".dat")))) {
                writeDroid(fw, droids.get(i));
            }
        }
    }
    private static void writeDroid(DataOutputStream fw, Droid droid) throws IOException {
        fw.writeUTF(droid.getName());
        fw.writeInt(droid.getHealth());
        fw.writeUTF(droid.getArmy().getName());
        fw.writeInt(droid.getWeapons().size());
        for (var weapon : droid.getWeapons()) {
            fw.writeUTF(weapon);
        }
    }
    public static void writeDroidsToCSVByAttribute(List<Droid> droids) throws IOException {
        try (FileWriter fw = new FileWriter("droid.csv")) {
            for (var droid : droids) {
                fw.write(droid.getName());
                fw.write(";");
                fw.write(String.valueOf(droid.getHealth()));
                fw.write(";");
                fw.write(droid.getArmy().getName());
                fw.write(";");
                for (var weapon : droid.getWeapons()) {
                    fw.write(weapon);
                    fw.write(";");
                }
                fw.write("\n");
            }
        }
    }

    /**
     *
     * @param droids
     * @throws IOException
     */
    public static void writeDroidsToTxtByAttribute(List<Droid> droids) throws IOException {
        try (FileWriter fw = new FileWriter("droid.txt")) {
            for (var droid : droids) {
                fw.write(droid.getName());
                fw.write(" ");
                fw.write(String.valueOf(droid.getHealth()));
                fw.write(" ");
                fw.write(droid.getArmy().getName());
                fw.write(" ");
                for (var weapon : droid.getWeapons()) {
                    fw.write(weapon);
                    fw.write(" ");
                }
                fw.write("\n");
            }
        }
    }

    public static void writeDroidsToTxtFile(List<Droid> droids) throws IOException {
        try (FileWriter fw = new FileWriter("droid.txt")) {
            for (var droid : droids) {
                fw.write(droid.toString());
                fw.write("\n");
            }
        }
    }
}
