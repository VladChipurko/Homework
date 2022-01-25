package home_work_5.service;

import home_work_5.dto.EasySearch;

public class WarServiceTask5 {

    /**
     * Задание 5
     * Статический метод который выводит информацию о количестве слов "война" "и" "мир" в тексте
     * без учета регистра
     */
    public static void task5Run(){
        EasySearch easySearch = new EasySearch();
        WarService warService = new WarService();

        System.out.println("Слово 'война' встречается в тексте - " +
                easySearch.search(warService.warAndPeace().toLowerCase(), "война") + " раз");

        System.out.println("Слово 'и' встречается в тексте - " +
                easySearch.search(warService.warAndPeace().toLowerCase(), "и") + " раз");

        System.out.println("Слово 'мир' встречается в тексте - " +
                easySearch.search(warService.warAndPeace().toLowerCase(), "мир") + " раз");
    }
}
