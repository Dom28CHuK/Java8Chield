package ua.com.domchuk;

import java.io.IOException;

public class GameGuess {
    public static void main(String[] args) throws IOException {

            char ch, answer = 'S';

            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать:");

            ch = (char) System.in.read();

            if (ch == answer) System.out.println("** Правильно! **");

    }
}
