package home_work_1;

import java.util.Scanner;

public class ClassElseIf {
    public static void main(String[] args) {
        System.out.println("Пожалуйста напишите ваше имя:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        if(name.equals("Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        else if(name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
