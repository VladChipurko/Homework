package home_work_5.main;

import home_work_5.dto.EasySearch;
import home_work_5.service.WarService;
import home_work_5.service.WarServiceTask5;

public class WarAndPeaceMain {
    public static void main(String[] args) {

        WarService service = new WarService();

        /**
         * Задание 2.1 Выводим количество использованных слов в тексте
         */
        System.out.println("Уникальных слов в тексте - " + service.getSetWords().size());

        /**
         * Задание 2.2 Выводим ТОП
         */
        service.getTop(10);

        /**
         * Задание 4.1
         */
        service.easySearchRun();

        /**
         * Задание 5
         */
        WarServiceTask5.task5Run();
    }
}
