package ua.univer.lesson07;

public class Program {
    public static void main(String[] args) {
            Student st1 = new Student("Tom", 20, 1);
            Doctor doc1 = new Doctor("Haus",50,6);
            Fighter f1 = new Fighter("Conan",30,100,90);

            Human[] humans = new Human[5];
            humans[0] = st1;
            humans[1] = doc1;
            humans[2] = f1;
            humans[3] = new Doctor("Doc",40,7);
     //       humans[4] = new Human("Anonim",0);
            for (Human h: humans) {
                System.out.println(h);

            }

        Human max_age_human = humans[0];
        for (Human h: humans) {
            if( max_age_human.getAge()< h.getAge())
                max_age_human=h;
        }
        System.out.println(max_age_human);

    }
}
