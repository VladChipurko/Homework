package home_work_1;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        System.out.println("Пожалуйста напишите порядковый номер дня недели");
        Scanner console = new Scanner(System.in);
        int dayNumber = console.nextInt();
        boolean weekday;
        if(dayNumber > 5 && dayNumber < 8){
            weekday=true;
        }
        else if (dayNumber > 0 && dayNumber < 6){
            weekday=false;
        }
        else {
            System.out.println("Вы ввели некорректные данные!");
            return;
        }

        System.out.println("Если у вас отпуск, введите true, если нет - false:");
        boolean vacation = console.nextBoolean();

        String answer = sleepIn(weekday, vacation) ? "Лафа, спим дальше!" : "Подъем!!! Пора на работу!";
        System.out.println(answer);
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleepOrNo;
        if(weekday == false && vacation == false){
            sleepOrNo = false;
            //System.out.println("Подъем!!! Пора на работу!");
        }
        else {
            sleepOrNo = true;
            //System.out.println("Лафа, спим дальше!");
        }
        return sleepOrNo;
    }
}
