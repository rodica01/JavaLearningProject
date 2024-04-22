package md.tekwillacademy.classesandobjects.autoservicetask;

import javafx.concurrent.WorkerStateEvent;

public class ManageAutoService {
        public static void main(String[] args) {

            Garage masterLuxObject = new Garage ("Str. Calea Orheiului 147", 3,220);
            System.out.println(masterLuxObject.address);

            Garage autoLux = new Garage ();
            System.out.println(autoLux.numberOfBoxes);
            System.out.println(autoLux.address);
            System.out.println(autoLux.dimensionSqFt);

            autoLux.address = " Str. Stefan cel Mare si Sfant";
            autoLux.dimensionSqFt = 250.6;
            autoLux.numberOfBoxes = 5;

            System.out.println("Informatii despre obiectul autolux de pe adresa" + autoLux.address + " autoLux.address" +
                            "cu numarul de boxe" + autoLux.numberOfBoxes + " si dimensiunea"+ autoLux.dimensionSqFt);

            Tool hummer011 = new Tool("Hummer");
            System.out.println(hummer011.nameOfTheTool);

            Tool key = new Tool("Lucky Key");
            System.out.println(key.nameOfTheTool);

            Worker michaelCelHarnic = new Worker ("Michael");
            System.out.println(michaelCelHarnic.pricePerHour);
            michaelCelHarnic.yearsOfExperience = 5;
            System.out.println(michaelCelHarnic.yearsOfExperience);

            Worker davidCelPuternic = new Worker();

            Car theCarOfRodica = new Car("Ferrari", "Red", 2, 4500);
            System.out.println(theCarOfRodica.make);

            Car theCarOfAndrei = new Car("Mercedes", "Black", 3, 5000);
            System.out.println(theCarOfAndrei.colorOfTheCar);
        }

    }


