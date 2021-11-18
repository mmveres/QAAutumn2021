package ua.univer.lesson10.list;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        CarList carList = new CarList();
        carList.addFirst(new Car("A", 1));
        carList.addFirst(new Car("B", 2));
        carList.addFirst(new Car("C", 3));
        carList.addFirst(new Car("D", 4));
        carList.print();

        for (Car car : carList)
            System.out.println(car);

        Iterator<Car> iter = carList.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

    }
}
