package home_work_2.arrays;

import java.util.Scanner;

public class TaskArrays_2_1_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        for(int a: container){
            System.out.print(a + " ");//вывод для себя, для наглядности
        }
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
}
