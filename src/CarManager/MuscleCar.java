package CarManager;

public class MuscleCar extends Car{
    public MuscleCar(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 20000) {
            return true;
        } else {
            return false;
        }
    }
}
