package ua.univer.lesson03.arr_task;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//1.создайте массив, содержащий 10 первых нечетных чисел.
// Выведете элементы массива на консоль в одну строку, разделяя запятой
//2.ввести 10 целых значений с консоли и разместить в
// 2 масива четные и нечетные
//3.подсчитать сколько четные и нечетные
//4.сумма елементов в каждом масиве и среднее арифметическое
//5.поменять четные позиции в первом масиве на значения
//нечетных позиций из 2 массива
//6.Дан массив размерности N,  найти наименьший элемент массива
// и вывести на консоль (если наименьших элементов несколько —
// вывести их индексы).
//7.Поменять наибольший и наименьший элементы массива местами.
//Пример: дан массив {4, -5, 0, 6, 8}.
//После замены будет выглядеть {4, 8, 0, 6, -5}.
public class ArrTask {

    public static void print10OddValue(){
        int[] arr = new int[10];
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value += 2;
        }
        ArrHelper.printArray(arr);
    }
    public static void printOddAndEvenArray(){
        int [] arr = ArrHelper.getMasFromConsole();
        int [] arrEven = new int[arr.length];
        int [] arrOdd = new int[arr.length];
        int countEven = 0;
        int countOdd = 0;
        for (int value: arr) {
            if (value % 2 == 0)
               arrEven[countEven++] =  value;
            else
                arrOdd[countOdd++] = value;
        }
        arrEven = copyArr(arrEven, countEven);

      //  System.arraycopy(arrEven,0,arrEven,0,countEven);
        arrOdd = Arrays.copyOf(arrOdd, countOdd);
        ArrHelper.printArray(arrEven);
        ArrHelper.printArray(arrOdd);
    }

    private static int[] copyArr(int[] arrEven, int countEven) {
        int[] temp = new int[countEven];
        for (int i = 0; i < countEven; i++) {
            temp[i] = arrEven[i];
        }
        return temp;
    }

    public static void printCountOddAdnEven() {
        throw new UnsupportedOperationException();
    }
}
