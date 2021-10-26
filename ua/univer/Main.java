package ua.univer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 1_200_000;
        int y = 20;
        long l1 = 1_000_000_000_000l;
        float f1 = 3.14f;
        int z = x * y;
        System.out.println(z);

        int x_max = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter int value");
        int value = sc.nextInt();
        System.out.println(value*2);

        System.out.println(10&3);
        System.out.println(10|3);



    }
}
