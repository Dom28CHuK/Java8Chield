package ua.com.domchuk;

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {

            char ch;

            for( ; ; ) {
                ch = (char) System.in.read();  // получить символ с клавиатуры
                if(ch == 'q') break;
            }
            System.out.println("Bы нажали клавишу q!");

    }
}
