package ua.univer.lesson07;

public abstract class Human {
    private String name;
    private int age;

    public Human(){
        this.name = "Anonim";
        this.age = 0;
    }

    public Human(String name){
        this.age = 20;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age< 0) throw new IllegalArgumentException();
        this.age = age;
    }
   // public abstract void show();
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }
}
