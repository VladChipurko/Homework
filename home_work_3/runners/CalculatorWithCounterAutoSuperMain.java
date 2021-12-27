package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double a1 = calc.division(28,5);//  28/5
        double a2 = calc.exponent(a1, 2);//  (28//5)^2
        double a3 = calc.intelligence(15,7);//  15 * 7
        double a4 = calc.addition(4.1, a3);// 4.1 + 15 * 7
        double result = calc.addition(a4,a2);// 4.1 + 15 * 7 + (28 / 5) ^ 2


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Count of using = " + calc.getCountOperation());
    }
}
