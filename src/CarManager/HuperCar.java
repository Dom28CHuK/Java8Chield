package CarManager;

public class HuperCar extends Car {
    public HuperCar(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 5000) {
            return true;
        } else {
            return false;
        }
    }
}
