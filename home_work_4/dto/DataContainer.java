package home_work_4.dto;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    /**
     * Задание 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения
     * передаваемых объектов. Да, именно T[] а не Object[]. Если использовать Object[] то это будет опасно и постоянно
     * придётся делать приведеление типов.
     */
    private T[] data;

    private T[] getData() {
        return data;
    }

    private void setData(T[] data) {
        this.data = data;
    }

    /**
     * Задание 3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор
     * DataContainer(T[]).
     *
     * @param data
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Задание 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data
     * и возвращает номер позиции в которую были вставлены данные, начиная с 0.
     * 4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней
     * заполненной позиции (ячейки).
     * 4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data =
     * [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
     * 4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data =
     * [1, 2, 3, null, null, null]. Метод add вернёт число -1. -1 будет индикатором того что данный
     * элемент в наш контейнер вставлять нельзя.
     * 4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data =
     * [1, 777, 3, null, null, null]. Метод add вернёт число 1.
     * 4.2 В случае если поле data переполнено, нужно придумать механизм который будет расширять пространство для
     * новых элементов. Тут вам поможет Arrays.copyOf.
     * 4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777].
     * Метод add вернёт число 3.
     * 4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
     *
     * @param item
     * @return
     */
    public int add(T item) {
        boolean biggerSize = false;
        if (item != null) {
            for (int i = 0; i < getData().length; i++) {
                if (getData()[i] == null) {
                    getData()[i] = item;
                    biggerSize = true;
                    return i;
                }
            }
            if (!biggerSize) {
                setData(Arrays.copyOf(getData(), getData().length + 1));
                for (int i = 0; i < getData().length; i++) {
                    if (getData()[i] == null) {
                        getData()[i] = item;
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /**
     * Задание 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из
     * data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
     * 5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0).
     * Метод get возвращает 9999
     * 5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
     */
    public T get(int index) {
        if (index >= getData().length) {
            return null;
        }
        return getData()[index];
    }

    /**
     * Задание 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
     */
    public T[] getItems() {
        return getData();
    }

    /**
     * Задание 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
     * 7.1 Метод возвращает true если у нас получилось удалить данные.
     * 7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete
     * вернёт true
     * 7.2 Метод возвращает false если нет такого индекса.
     * 7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод
     * delete вернёт false
     * 7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
     * 7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete
     * вернёт true
     */
    public boolean delete(int index) {
        boolean result = false;
        if (index < getData().length) {
            for (; index < getData().length - 1; index++) {
                getData()[index] = getData()[index + 1];
            }
            setData(Arrays.copyOf(getData(), getData().length - 1));
            return true;
        }
        return result;
    }

    /**
     * Задание 8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
     * 8.1 Метод возвращает true если у нас получилось удалить данные.
     * 8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete
     * вернёт true
     * 8.2 Метод возвращает false если нет такого элемента.
     * 8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод
     * delete вернёт false
     * 8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
     * 8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод
     * delete вернёт true
     */
    public boolean delete(T item) {
        boolean result = false;
        int index = getData().length;
        for (int i = 0; i < getData().length; i++) {
            if (getData()[i].equals(item)) {
                index = i;
                break;
            }
        }
        if (index < getData().length) {
            for (; index < getData().length - 1; index++) {
                getData()[index] = getData()[index + 1];
            }
            setData(Arrays.copyOf(getData(), getData().length - 1));
            return true;
        }
        return result;
    }

    /**
     * Задание 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается
     * сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
     * Классом Arrays пользоваться запрещено.
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < getData().length - 1; i++) {
            for (int j = getData().length - 1; j > i; j--) {
                if (comparator.compare(getData()[j], getData()[j - 1]) < 0) {
                    T buf = getData()[j - 1];
                    getData()[j - 1] = getData()[j];
                    getData()[j] = buf;
                }
            }
        }
    }

    /**
     * Задание 10. Переопределить метод toString() в классе, выводить содержимое data без ячеек в которых хранится null.
     */
    @Override
    public String toString() {
        int count = 0;
        for (int i = 0; i < getData().length; i++) {
            if (getData()[i] != null) {
                count++;
            }
        }
        String st = "";
        int a = 0;
        for (int i = 0; i < getData().length; i++) {
            if (getData()[i] != null) {
                if (a == count - 1) {
                    st += getData()[i];
                    break;
                }
                st += getData()[i] + ", ";
                a++;
            }
        }
//      наверняка можно было сделать это проще, но чтобы предусмотреть null в любой ячейке массива
//      смог придумать только так
        return "DataContainer{" +
                "data=[" + st +
                "]}";
    }
}
