package ua.com.domchuk;

public class Break3 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println("Cчeтчик внешнего цикла: "+ i);
            System.out.println("Счетчик внутреннего цикла: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) break;   // прервать цикл, если t 10
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
