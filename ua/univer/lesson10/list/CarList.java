package ua.univer.lesson10.list;
import ua.univer.lesson08.Ship;

import java.util.Iterator;

class Car{
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Node{
    Car data;
    Node next;
    public Node(){
        data =null;
        next =null;
    }

    public Node(Car data) {
        this.data = data;
    }
}
class CarIterator implements Iterator<Car>{
    private Node current;
    public CarIterator(Node head) {
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current!= null;
    }

    @Override
    public Car next() {
        Car car = current.data;
        current= current.next;
        return car;
    }
}
public class CarList implements Iterable<Car> {
    private Node head;
    public CarList(){
        head = new Node();
    }
    public void addFirst(Car car){
        Node node  = new Node(car);
        if (head.data == null)
            head = node;
        else {
            node.next = head;
            head = node;
        }
    }
    public void print(){
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current= current.next;
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarIterator(head);
    }
}
