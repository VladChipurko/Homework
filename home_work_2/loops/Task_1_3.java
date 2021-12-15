package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста введите число которое мы будем возводить в степень:");
        double a = scan.nextDouble();
        System.out.println("Введите степень, не отрицательную и целую");
        int b = scan.nextInt();
        if(b<0){
            System.out.println("Ну попросил же целое и неотрицательное");
            return;
        }

        double multi=a;
        for(int i = 1; i < b; i++){
            multi*=a;
        }
        System.out.println(a + " ^ " + b + " = " + multi);
    }
}
