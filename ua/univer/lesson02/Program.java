package ua.univer.lesson02;

public class Program {
    /** Дано целое число. Если оно является положительным, то прибавить к
    нему 1; в противном случае не изменять его. Вывести полученное число.*/
    public static int task1(int x){
        if (x > 0 ) x= x + 1;
        return x;
    }
    /** Дано целое число. Если оно является положительным, то прибавить к
     нему 1; в противном случае не изменять его. Вывести полученное число.
     если 0 выводить ошибку*/
    public static int task1withoutZero(int x){
        if (x==0) throw new IllegalArgumentException();
        if (x > 0 ) x= x + 1;
        return x;
    }


    public static void main(String[] args) {

      //  testIf();
     //   printValue(100);
     //   printReverseValue(200);


        int x =12345678;
        while (x > 0){
            int value = x%10;
            if (value%2 ==1)
                System.out.println(value);
            x=x/10;
            System.out.println(x);
        }
    }

    private static void printReverseValue(int i) {
        while (i>0){
            System.out.println(i);
            i=i-1;
        }
    }

    private static void printValue(int n) {
        int i = 0;
        while (i<n){
            System.out.println(i);
            i=i+1;
        }
    }

    private static void testIf() {
        int x = 10;
        int result = task1(x);
        System.out.println(result);

        int x1 = 11;
        System.out.println(task1(x1));

        System.out.println(task1(-11));
    }
}
