package ua.univer.lesson08;

public class Program {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Ford Focus", 180, 5,new Point(1,1));
        Vehicle ship1 = new Ship("Assedo", 50, 20, new Point(2,2), "Odessa",200);


        Vehicle[] vehicles = {
                car1,
                ship1,
                new RiverBarge("Biver", 20, 50, new Point(3,3)),
                new Airplane("Plane1", 800, 10, new Point(4,4),500,50),
                new Seaplane("SeaPlane1", 600, 15, new Point(5,5),300,10),
                new Helicopter("Helicop", 400, 25, new Point(6,6),200,15)
        };
        CruiseAble [] cruiseAbles = new CruiseAble[3];
        cruiseAbles[0] = new Duck();
        int countCruise = 1;
        for (Vehicle v : vehicles) {
            if (v instanceof CruiseAble){
                CruiseAble cruiseAble = (CruiseAble) v;
                cruiseAbles[countCruise] = cruiseAble;
                countCruise++;
                System.out.println(v);
            }
        }

        for (var c : cruiseAbles) {
            System.out.println(c);
        }


    }
}
