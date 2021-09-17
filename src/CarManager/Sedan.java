package CarManager;

public class Sedan extends Car{
    public Sedan(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 30000) {
            return true;
        } else {
            return false;
        }
    }
}
