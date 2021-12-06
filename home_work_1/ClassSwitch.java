package home_work_1;

import java.util.Scanner;

public class ClassSwitch {
    public static void main(String[] args) {
        System.out.println("Пожалуйста напишите ваше имя:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
