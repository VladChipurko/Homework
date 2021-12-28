package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();


        double a1 = calculator.division(28,5);//  28/5
        calculator.toMemory();
        System.out.println(calculator.getMemory());
        double a2 = calculator.exponent(a1, 2);//  (28//5)^2
        calculator.toMemory();
        System.out.println(calculator.getMemory());
        double a3 = calculator.intelligence(15,7);//  15 * 7
        calculator.toMemory();
        System.out.println(calculator.getMemory());
        double a4 = calculator.addition(4.1, a3);// 4.1 + 15 * 7
        calculator.toMemory();
        System.out.println(calculator.getMemory());
        System.out.println(calculator.getMemory());//выведет 0, потому что при прошлом вызове метода память обнулилась
        double result = calculator.addition(a4,a2);// 4.1 + 15 * 7 + (28 / 5) ^ 2


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
