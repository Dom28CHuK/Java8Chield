package CarManager;

public class Crossover extends Car{
    public Crossover(String name, int yerOfProduction, int price, int weight, Color color) {
        super(name, yerOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 25000) {
            return true;
        } else {
            return false;
        }
    }
}
