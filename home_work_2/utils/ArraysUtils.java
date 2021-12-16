package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static void main(String[] args) {
    }

    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которому будет соответствовать размер массива");
        int count = scan.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            System.out.println("Введите число");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] arr = new int[size];
        Random rnd = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = rnd.nextInt(maxValueExclusion);
        }
        return arr;
    }
}
