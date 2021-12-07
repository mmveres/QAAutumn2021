package ua.univer.lesson14;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 */

public class Program {
    /**
     *
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Droid> droids = new ArrayList<>();
        Army armyA = new Army("A");
        droids.add(new Droid("R2D1", 100, armyA));
        droids.add(new Droid("R2D2", 90, armyA));
        droids.add(new Droid("R2D3", 70, armyA));

        for (var droid : droids) {
            droid.addWeapons("Gun");
        }


     //   writeToXml(droids);

        List<Droid> droidList1 = getDroidsFromXML();

        System.out.println(droidList1);
   //     binarySerialize(droids);

    //    List<Droid> droidList1 = getDroidsBinaryDeserialize();
    //    System.out.println(droidList1);

        //   writeDroidsToDataOutputByAttribute(droids);
     //   writeDroidsToTxtByAttribute(droids);
     //   DroidUtil.writeDroidsToCSVByAttribute(droids);
     //   writeDroidsToOneFileByDataOutputByAttribute(droids);
     //   List<Droid> droidList = readDroidsToDataOutputByAttribute("droid.dat");
     //   System.out.println(droidList);

    }

    private static List<Droid> getDroidsFromXML() throws FileNotFoundException {
        List<Droid> droidList1 =null;
        try(XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("droid.xml")))){
            droidList1 = (List<Droid>) xmlDecoder.readObject();
      }
        return droidList1;
    }

    private static void writeToXml(List<Droid> droids) throws FileNotFoundException {
        try(XMLEncoder xmlEncoder = new XMLEncoder( new BufferedOutputStream(new FileOutputStream("droid.xml")))){
            xmlEncoder.writeObject(droids);
        }
    }

    private static List<Droid> getDroidsBinaryDeserialize() throws IOException, ClassNotFoundException {
        List<Droid> droidList1= null;
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("droid.bin"))) {
            droidList1 = (List<Droid>) ois.readObject();
        }
        return droidList1;
    }

    private static void binarySerialize(List<Droid> droids) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("droid.bin"));

        oos.writeObject(droids);

        oos.close();
    }


}
