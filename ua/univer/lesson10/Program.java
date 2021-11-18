package ua.univer.lesson10;

import java.util.*;

//class MyArrList{
//    private int [] arr;
//    private int i = 0;
//    public MyArrList(){
//        arr = new int[3];
//    }
//    public void add(int value){
//        arr[i] = value;
//        i++;
//    }
//}

class MyList<E> extends AbstractList<E> {
    private E [] arr;
    private int i = 0;
    public MyList(){
        arr = (E[]) new Object[3];
    }
    @Override
    public E get(int index) {
        return arr[index];
    }

    @Override
    public boolean add(E e) {
        arr[i] = e;
        i++;
        return true;
    }

    @Override
    public int size() {
        return i;
    }
}
class Cat{
    private String name;
    private double age;

    public Cat(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Program {
    public static void printCat(Collection<Cat> catlist){
        System.out.println(catlist);

    }
    public static void main(String[] args) {
//        int [] arr = new int[3];
//        int i = 0;
//        arr[i] = 1;
//        i++;
//        arr[i] = 2;
//        i++;
//        arr[i] = 3;
//
//        MyArrList mylist = new MyArrList();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(3);

        List<Integer> list=  new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       // list.add("hi");
        System.out.println(list);

        Deque<Integer> deque = new LinkedList<>();

        List<Cat> catList = new LinkedList<>();
        catList.add(new Cat("Tom1", 5));
        catList.add(new Cat("Tom2", 3));
        catList.add(new Cat("Tom3", 7));

        printCat(catList);



    }
}
