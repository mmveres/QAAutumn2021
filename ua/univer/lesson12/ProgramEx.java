package ua.univer.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
class NotMarkError extends RuntimeException{
    public NotMarkError(String message) {
        super(message);
    }
}
class NotPositiveError extends Exception{
    public NotPositiveError(String message) {
        super(message);
    }
}
public class ProgramEx {
    public static Logger logger = Logger.getLogger(ProgramEx.class.getSimpleName());
    static {
        try {
            FileHandler fh = new FileHandler("prog.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.SEVERE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        int [] arrInt = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < arrInt.length; i++) {
                System.out.println("arr["+i+"] =");
                int valueInt = getPositiveValue(br);
                if (valueInt< 3 || valueInt > 12)
                    throw new NotMarkError(" not mark");
                arrInt[i] = valueInt;
            }

          System.out.println("your int values = " + Arrays.toString(arrInt));
        } catch (IOException e) {
            logger.log(Level.SEVERE,Arrays.toString(e.getStackTrace()));
            throw e;
        }
        System.out.println("main finish");
    }

    private static int getPositiveValue(BufferedReader br) throws IOException {
        while (true) {
           try{
            int valueInt = getValidInt(br);
            if (valueInt < 0)
                throw new NotPositiveError(" not potive ");
            return valueInt;
           }catch(NotPositiveError e){
               logger.log(Level.SEVERE,"Not int"+Arrays.toString(e.getStackTrace()));
           }
        }
    }

    private static int getValidInt(BufferedReader br) throws IOException {
        while (true) {
            try {
                System.out.println("Enter int");
                String str = br.readLine();
                logger.log(Level.INFO, "Enter int "+ str);
                int value = Integer.parseInt(str);
                logger.log(Level.INFO, "parse int "+ value);
                return value;
            } catch (NumberFormatException e1) {
                logger.log(Level.SEVERE,"Not int"+Arrays.toString(e1.getStackTrace()));
            }
        }
    }
}
