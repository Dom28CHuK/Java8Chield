package ua.com.domchuk;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {
            char choice;

            System.out.println("Справка");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.print("Bыбepитe: ");
            choice = (char) System.in.read();

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("Oпepaтop if:\n");
                    System.out.println("if(ycлoвиe) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("Oпepaтop switch:\n");
                    System.out.println("switch(выpaжeниe) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Запрос не найден.");
            }

    }
}
