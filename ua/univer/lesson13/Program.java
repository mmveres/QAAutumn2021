package ua.univer.lesson13;

import java.io.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        //     String str = new BufferedReader( new InputStreamReader(System.in)).readLine();
        //     System.out.println(str);
        //     File dir = new File("C:\\Users\\Max\\Documents\\QA_Autumn_2021\\src\\ua\\univer\\lesson13\\data");

    //    writeTextForConsoleToFile(FileConst.PATH + "4.csv");
        //      readFileFromDir(FileConst.PATH);
        readTextFromFile(FileConst.PATH + "4.csv");
    }

    private static void writeTextForConsoleToFile(String filename) throws IOException {

        FileWriter fw = new FileWriter( filename,true);
        System.out.println("Enter text");
        BufferedReader brCon = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = brCon.readLine();
            if (str.equals("end")) break;
            fw.write(str);
            fw.write("\n");
            fw.flush();
        }
        fw.close();
    }

    private static void readFileFromDir(String dirPath) throws IOException {
        File dir = new File(dirPath);
        if (dir.isDirectory()) {
            String[] fileNames = dir.list();
            System.out.println(Arrays.toString(fileNames));
            for (int i = 0; i < fileNames.length; i++) {
                readTextFromFile(dirPath + fileNames[i]);
            }

        } else System.out.println("not dir");
    }

    private static void readTextFromFile(String x) throws IOException {
        System.out.println(x);
        BufferedReader file_txt = new BufferedReader(new FileReader(x));
        while (file_txt.ready()) {
            System.out.println(file_txt.readLine());
        }
    }
}
