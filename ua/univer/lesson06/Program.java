package ua.univer.lesson06;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 10, 7.5);
        Cat cat2 = new Cat("Tomik", 8, 6.5);
        Cat cat3 = new Cat("Tomidze", 20, 16.5);
        Cat cat4 = new Cat("Tom Lee", 7, 5.5);
        Cat cat5 = new Cat("Tom Lee1", 7, 5.5);

        cat1.setWeight( 11);

        System.out.println(Cat.getId());
        cat1.eat(0.3);
        cat2.eat(0.25);

        System.out.println(cat1.getName()+" : " + cat1.getWeight());
        System.out.println(cat2.getName()+ " : " +cat2.getWeight());

    }
}
