package ua.univer.lesson09;

import java.util.Arrays;
import java.util.Comparator;

interface AgeAble{
    int getAge();
}
class Greater{
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                count++;
        return count;
    }
    public static <T extends AgeAble> int countGreaterAgeThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.getAge() > elem.getAge())
                count++;
        return count;
    }
}
class Car implements Comparable<Car>, AgeAble{
    private String name;
    private int speed;
    private int age;

    public Car(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getAge()-o.getAge();
    }
}
class Cat implements AgeAble{

    @Override
    public int getAge() {
        return 8;
    }
}
class CompareCarByAge implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getAge()-o2.getAge();
    }
}
class CompareCarBySpeed implements Comparator<Car>{
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getSpeed()-o2.getSpeed();
    }
}
public class ProgramGrater {
    public static void main(String[] args) {
        Integer[] arr = {1,1,2,3,4,5,6,3};
        System.out.println(Greater.countGreaterThan(arr, 2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        Car [] cars = {
                new Car("Ford", 180, 10),
                new Car("Audi", 200, 15),
                new Car("ZAZ", 120, 5),
                new Car("BMW", 190, 20)
        };
        System.out.println(Greater.countGreaterThan(cars, new Car("Cherry",130,7)));
        System.out.println(Greater.countGreaterAgeThan(cars, new Cat()));

        Arrays.sort(cars,new CompareCarByAge().reversed());
        System.out.println(Arrays.toString(cars));
//        Arrays.sort(cars,new CompareCarBySpeed());
        Arrays.sort(cars,(o1, o2) -> o1.getSpeed()-o2.getSpeed());
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(Arrays.toString(cars));
    }
}
