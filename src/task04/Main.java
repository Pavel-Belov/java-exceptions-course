package task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
         * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */
        String result = inputLine();
        if (result.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        } else {
            System.out.println("Вы ввели -> " + result);
        }
    }

    public static String inputLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку -> ");
        return scanner.nextLine();
    }
}
