package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int[] arraysOfInts = new int[10];
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число от 0 до 9");
        arraysOfInts[0] = console.nextInt();
        System.out.println("Еще одно число от 0 до 9");
        arraysOfInts[1] = console.nextInt();
        System.out.println("И еще");
        arraysOfInts[2] = console.nextInt();
        System.out.println("Еще");
        arraysOfInts[3] = console.nextInt();
        System.out.println("Продолжаем");
        arraysOfInts[4] = console.nextInt();
        System.out.println("Еще немного");
        arraysOfInts[5] = console.nextInt();
        System.out.println("Почти все");
        arraysOfInts[6] = console.nextInt();
        System.out.println("Пошутил, но осталось совсем чуть-чуть");
        arraysOfInts[7] = console.nextInt();
        System.out.println("Еще одну циферку");
        arraysOfInts[8] = console.nextInt();
        System.out.println("Ура, последняя!!!");
        arraysOfInts[9] = console.nextInt();

        System.out.println(createPhoneNumber(arraysOfInts));
    }
    static String createPhoneNumber(int[] a){
        String phoneNumber = "(" + a[0] + a[1] + a[2] + ") " +a[3] + a[4] + a[5] + "-" + a[6] + a[7] +a[8] +a[9];
        return phoneNumber;
    }
}
