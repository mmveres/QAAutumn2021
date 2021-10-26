package ua.univer.lesson03;

import ua.univer.lesson03.arr_task.ArrHelper;
import ua.univer.lesson03.arr_task.ArrTask;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. создайте массив, содержащий 10 первых нечетных чисел.\n" +
                    " Выведете элементы массива на консоль в одну строку, разделяя запятой");
            System.out.println("2. ввести 10 целых значений с консоли и разместить в\n" +
                    " 2 масива четные и нечетные");
            System.out.println("3. подсчитать сколько четные и нечетные");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter choice ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0: return;
                case 1:
                    ArrTask.print10OddValue();
                    break;
                case 2:
                    ArrTask.printOddAndEvenArray();
                    break;
                case 3:
                    ArrTask.printCountOddAdnEven();
                    break;
                default:
                    System.err.println("Error choice");
            }
//        int[] mass = ArrHelper.getMasFromConsole();
//        System.out.println(Arrays.toString(mass));
        }
    }

}
