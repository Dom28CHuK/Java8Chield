package CarManager;

public class Bus extends Car{
    public Bus(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 50000) {
            return true;
        } else {
            return false;
        }
    }
}
