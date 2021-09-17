package ua.com.domchuk;

public class SideEffecys {
    public static void main(String[] args) {
        int i;
        i = 0;

        if (false & (++i < 100))
            System.out.println("null");
        System.out.println("true " + i);

        if (false && (++i < 100))
            System.out.println("null");
        System.out.println("true " + i);
    }
}
