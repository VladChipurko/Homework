package home_work_2.arrays;

import java.util.Scanner;

public class TaskArrays_2_2 {
    public static void main(String[] args) {
        int[] container = TaskArrays_2_1_1.arrayFromConsole();
        method1(container);
        method2(container);
        method3(container);
    }

    public static void method1(int[] a){
        //do...while
        int i = 0;
        do {
            System.out.print(a[i] + " ");
            i++;
        }while (i<a.length);
        System.out.println("");

        //while
        i = 0;
        while (i < a.length){
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println("");

        //for
        for(i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        //foreach
        for(int foreach : a){
            System.out.print(foreach + " ");
        }
        System.out.println(" ");
    }
    public static void method2(int[] b){
        //do...while
        int i = 0;
        do {
            System.out.print(b[i] + " ");
            i++;
            i++;
        }while (i<b.length);
        System.out.println("");

        //while
        i = 0;
        while (i < b.length){
            System.out.print(b[i] + " ");
            i++;
            i++;
        }
        System.out.println("");

        //for
        for(i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
            i++;
        }
        System.out.println("");

        //foreach
        int j = 0;
        for(int foreach : b){
            if(j%2 == 0){
                System.out.print(foreach + " ");
            }
            j++;
        }
        System.out.println(" ");
    }

    public static void method3(int[] c){
        int[] reversed = new int[c.length];
        for (int i=0; i<c.length; i++) {
            reversed[i] = c[c.length - 1 - i];
        }

        //do...while
        int i = 0;
        do {
            System.out.print(reversed[i] + " ");
            i++;
        }while (i < reversed.length);
        System.out.println("");

        //while
        i = 0;
        while (i < reversed.length){
            System.out.print(reversed[i] + " ");
            i++;
        }
        System.out.println("");

        //for
        for(i = 0; i < reversed.length; i++){
            System.out.print(reversed[i] + " ");
        }
        System.out.println("");

        //foreach
        for(int foreach : reversed){
            System.out.print(foreach + " ");
        }
        System.out.println(" ");
    }
}
