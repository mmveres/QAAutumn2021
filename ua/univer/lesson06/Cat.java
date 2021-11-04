package ua.univer.lesson06;

public class Cat {
    private static int id = 0;
    private int current_id;
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.setAge(age);
        this.setWeight(weight);
        Cat.id++;
        this.current_id = Cat.id;
    }

    //    public Cat(String n, int a, double w){
//        name = n;
//        age = a;
//        weight =w;
//        Cat.id++;
//        current_id = Cat.id;
//    }

    public static int getId() {
        return id;
    }

    public int getCurrent_id() {
        return current_id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 25)
            throw new IllegalArgumentException();
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0 || weight > 30)
            throw new IllegalArgumentException();

        this.weight = weight;
    }

    public void eat(double food){
        this.weight = this.weight+food;
    }
}
