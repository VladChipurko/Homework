package home_work_4.main;

import home_work_4.dto.DataContainer;
import home_work_4.service.comparators.IntegerComparator;
import home_work_4.service.comparators.StringComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        /**
         * Для примера сделал 2 контейнера, подготовил для них 2 компаратора
         */
        DataContainer<String> containerString = new DataContainer<>(new String[0]);
        DataContainer<Integer> containerInteger = new DataContainer<>(new Integer[]{999, 888, 77, null, 44});

        /**
         * String-контейнер
         */
        System.out.println("Первоначальный массив - " + containerString.toString());
        System.out.println("Индекс ячейки куда попали данные - " + containerString.add("Привет"));
        System.out.println("Индекс ячейки куда попали данные - " + containerString.add("Как дела"));
        System.out.println("Так массив выглядит сейчас - " + containerString.toString());
        System.out.println("Индекс ячейки куда попали данные - " + containerString.add("Работаю"));
        System.out.println("Индекс ячейки куда попали данные - " + containerString.add("Давай потом"));
        System.out.println("Так массив выглядит сейчас - " + containerString.toString());
        System.out.println("Результат удаления данных из ячейки с индексом 0 - " + containerString.delete(0));
        System.out.println("Так массив выглядит сейчас - " + containerString.toString());
        containerString.sort(new StringComparator());//сортируем массив
        System.out.println("Отсортированный массив - " + containerString.toString() + "\n");

        /**
         * Integer-контейнер
         */
        System.out.println("Первоначальный массив без null-ов - " + containerInteger.toString());
        System.out.println("Первоначальный массив с null-ами - " + Arrays.toString(containerInteger.getItems()));
        System.out.println("Индекс ячейки куда вставилось '15' - " + containerInteger.add(15));
        System.out.println("Индекс ячейки куда вставилось '648' - " + containerInteger.add(648));
        System.out.println("Новый массив - " + containerInteger.toString());
        System.out.println("Результат удаления ячейки с индексом 0 - " + containerInteger.delete(0));
        System.out.println("Теперь массив выглядит так - " + containerInteger.toString());
        containerInteger.sort(new IntegerComparator());//сортируем массив
        System.out.println("Отсортированный массив - " + containerInteger.toString());
    }
}
