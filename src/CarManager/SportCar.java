package CarManager;

public class SportCar extends Car {
    public SportCar(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 10000) {
            return true;
        } else {
            return false;
        }
    }
}
