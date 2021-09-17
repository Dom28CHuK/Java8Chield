package CarManager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    public static void main(String[] args) {

        Car nissan = new SportCar("Nissan GTR",2008,100000,1750, Color.Orange);
        Car toyota = new SportCar("Toyota Supra",1993,25000,1300, Color.Grey);
        Car mclaren = new HuperCar("McLaren SENNA",2018,1000000,1309, Color.Blue);
        Car ford = new MuscleCar("Ford Mustang GT500",2006,45000,1777, Color.Black);
        Car wolksvagen = new Sedan("Wolksvagen Passat B7",2014,20000,1440, Color.White);
        Car BMW = new Crossover("BMW X6",2014,55000,2260, Color.Green);
        Car mercedes = new Bus("Mercedes VITO",2014,35000,2190,Color.Red);

        List<Car> cars = new ArrayList<>();

        cars.add(nissan);
        cars.add(toyota);
        cars.add(mclaren);
        cars.add(ford);
        cars.add(wolksvagen);
        cars.add(BMW);
        cars.add(mercedes);

        nissan.addDistance(7000);
        toyota.addDistance(130000);
        mclaren.addDistance(4000);
        ford.addDistance(100000);
        wolksvagen.addDistance(115000);
        BMW.addDistance(20000);
        mercedes.addDistance(250000);

        System.out.println(nissan);
            System.out.println(nissan.isReadyToService());
        System.out.println(toyota);
            System.out.println(toyota.isReadyToService());
        System.out.println(mclaren);
            System.out.println(mclaren.isReadyToService());
        System.out.println(ford);
            System.out.println(ford.isReadyToService());
        System.out.println(wolksvagen);
            System.out.println(wolksvagen.isReadyToService());
        System.out.println(BMW);
            System.out.println(BMW.isReadyToService());
        System.out.println(mercedes);
            System.out.println(mercedes.isReadyToService());

    }
}
