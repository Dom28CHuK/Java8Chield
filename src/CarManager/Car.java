package CarManager;

public abstract class Car implements InterfaceCarManager {
    String name;
    int yerOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Car(String name, int yerOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yerOfProduction = yerOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int additionalDistance) {
        distance += additionalDistance;
        distanceOnService += additionalDistance;
    }

    public abstract boolean isReadyToService();

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yerOfProduction=" + yerOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }
}
