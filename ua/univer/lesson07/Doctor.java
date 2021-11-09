package ua.univer.lesson07;

public class Doctor extends Human{

    private int licence;

    public Doctor(String name, int age, int licence) {
        super(name, age);
        this.licence = licence;
    }

    public void cure(){
        System.out.println(" i'm cure ");
    }


    public int getLicence() {
        return licence;
    }

    public void setLicence(int licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                super.toString() +
                ", licence=" + licence +
                '}';
    }
}
