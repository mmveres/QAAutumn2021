package ua.univer.lesson03.arr_task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrHelper {
    public static void printArray(int[] arr){
        System.out.println("***************");
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i!= arr.length-1) System.out.print(", ");
            else System.out.print("]");
        }
        // System.out.println();
        System.out.println("\n***************");
    }
    public static int[] getMasFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter count elem of array");
        int count = scanner.nextInt();
        int[] mass = new int[count];
        System.out.println("enter int value");
        for (int i =0; i< mass.length; i++){
            System.out.print("mass["+i+"]= ");
            mass[i] = scanner.nextInt();
        }
        return mass;
    }
    public static void testArray(){
        int[] arrInt = new int[5];
        double[] arrDouble = new double[5];
        boolean[] arrBoolean = new boolean[5];
        String[] arrStr = new String[5];
        Object[] arrObj = new Object[5];
        System.out.println();
        int[] arr = {1,2,3,54,6,4,78,9,9,2};
        ArrHelper.printArray(arr);
        for(int i = 0; i < arr.length; i++)
            arr[i]= arr[i]*arr[i];
        ArrHelper.printArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
