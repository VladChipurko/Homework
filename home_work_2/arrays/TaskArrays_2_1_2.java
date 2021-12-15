package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskArrays_2_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которому будет соответствовать размер массива");
        int count = scan.nextInt();
        System.out.println("Введите ограничение по числам");
        int limit = scan.nextInt();
        int[] container = arrayRandom(count, limit);
        for(int a: container){
            System.out.print(a + " ");
        }
    }
    public static int[] arrayRandom(int a, int b){
        int[] arr = new int[a];
        Random rnd = new Random();
        for(int i = 0; i < a; i++){
            arr[i] = rnd.nextInt(b);
        }
        return arr;
    }
}
