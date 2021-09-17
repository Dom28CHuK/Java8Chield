package ua.com.domchuk;

public class IncToMetersTable {
    public static void main(String[] args) {
        double inch, meters;
        int counter;

        counter = 0;
        for (meters = 1; meters <= 100; meters++) {
            inch = meters * 39.37;
            System.out.println(meters + " метру соответствует " + inch + " дюймов.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
