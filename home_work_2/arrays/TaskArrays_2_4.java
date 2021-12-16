package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class TaskArrays_2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которому будет соответствовать размер массива");
        int count = scan.nextInt();
        System.out.println("Введите ограничение по числам");
        int limit = scan.nextInt();
        int[] container = ArraysUtils.arrayRandom(count, limit);

        for(int elem : container){
            System.out.print(elem + " ");
        }

        task_2_4_1(container);
        task_2_4_2(container);
        task_2_4_3(container);
        task_2_4_4(container);
        task_2_4_6(container);
        task_2_4_5(container);
    }

    public static void task_2_4_1(int[] array1){
        System.out.print("\nЗадание 2.4.1 -  ");
        int summ1 = 0;
        for(int a1: array1){
            if(a1%2 == 0 && a1 >0){
                summ1 += a1;
            }
        }
        System.out.println(summ1);
    }

    public static void task_2_4_2(int[] array2){
        System.out.print("Задание 2.4.2 -  ");
        int max = (array2[0] > array2[2]) ? array2[0] : array2[2];
        for(int i = 4; i < array2.length; i++){
            max = (max > array2[i]) ? max : array2[i];
            i++;
        }
        System.out.println(max);
    }

    public static void task_2_4_3(int[] array3){
        System.out.print("Задание 2.4.3 -  ");
        int summa = 0;
        for(int a3 : array3){
            summa += a3;
        }
        int average = summa / array3.length;
        for(int i = 0; i < array3.length; i++){
            if(array3[i] < average){
                System.out.print(array3[i] + " ");
            }
        }
        System.out.println("");
    }

    public static void task_2_4_4(int[] array4){
        System.out.print("Задание 2.4.4 -  ");
        int min1 = array4[0];
        int min2 = array4[0];
        int minInd1 = 0;
        for(int i = 1; i <array4.length; i++){
            //min1 = (min1 > array4[i]) ? array4[i] : min1;
            if(min1 > array4[i]){
                min1 = array4[i];
                minInd1 = i;
            }
        }
        for(int i=1; i <array4.length; i++){
            if (i == minInd1){
                continue;
            }else{
                min2 = (min2 > array4[i]) ? array4[i] : min2;
            }
        }
        System.out.print(min1 + " " + min2 + "\n");
    }

    public static void task_2_4_5(int[] array5){
        System.out.print("Задание 2.4.5:\nВведите нижний интервал:\n");
        Scanner scan2 = new Scanner(System.in);
        int low = scan2.nextInt();
        System.out.println("Введите верхний интервал");
        int hight = scan2.nextInt();
        int i = 0;
        int m = array5.length;
        int j;
        while (i < m){
            if(array5[i] >= low && array5[i] <= hight){
                m -= 1;
                for(j=i; j < m; j++){
                    array5[j] = array5[j+1];
                }
            }else{
                i++;
            }
        }
        for(i = m; i < array5.length; i++){
            array5[i] = 0;
        }
        for(int minus:array5){
            System.out.print(minus + " ");
        }
    }

    public static void task_2_4_6(int[] array6){
        System.out.print("Задание 2.4.6 -  ");
        int sum =0;
        int element = 0;
        int num = 0;
        for(int i =0; i < array6.length; i++){
            num = array6[i];
            while(num != 0){
                element = num % 10;
                sum += element;
                if(i == array6.length-1 && num < 10){
                    System.out.print(element);
                }else {
                    System.out.print(element + " + ");
                }
                num /= 10;
            }
        }
        System.out.print(" = " + sum + "\n");
    }
}
