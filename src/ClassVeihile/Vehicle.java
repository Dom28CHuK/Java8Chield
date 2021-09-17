package ClassVeihile;

public class Vehicle {
    int passengers;           // количество пасажиров
    int fuelTankCapacity;     // емкость топливного бака
    int mpq;                  // потребления топлива в милях на галон

    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelTankCapacity = f;
        mpq = m;
    }

    int range() {
        return mpq * fuelTankCapacity;
    }
    double fuelneeded(int miles) {
        return (double) miles / mpq;
    }
}
