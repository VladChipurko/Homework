package home_work_1;

import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {

        //Вычислим площадь крута
        System.out.println("Введите радиус крута:");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double s = Math.PI * Math.pow(r, 2);
        System.out.println(s);

        //Возведем число 5 в куб, и выведем на экран целое его значение
        System.out.println("Введите пожалуйста любое число от 1 до 100:");
        int a = scan.nextInt();
        System.out.printf("Число " + a + " в кубе = %.0f \n", Math.pow(a, 3));

        //Найдем большее из 2 чисел
        System.out.println("Введите 2 любых числа(1ое число - enter - 2ое число)");
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        System.out.println("Максимальное из этих 2 чисел - " + Math.max(b1, b2));

        //Генерация рандомного числа и округление до ближайшего целого числа
        double random = Math.random() * 100;
        System.out.println("Просто покажу вам случайное число - " + Math.round(random));
    }
}
