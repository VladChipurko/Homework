package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcCount = new CalculatorWithCounterClassic();

        double a1 = calcCount.division(28,5);//  28/5
        calcCount.incrementCountOperation();
        double a2 = calcCount.exponent(a1, 2);//  (28//5)^2
        calcCount.incrementCountOperation();
        double a3 = calcCount.intelligence(15,7);//  15 * 7
        calcCount.incrementCountOperation();
        double a4 = calcCount.addition(4.1, a3);// 4.1 + 15 * 7
        calcCount.incrementCountOperation();
        double result = calcCount.addition(a4,a2);// 4.1 + 15 * 7 + (28 / 5) ^ 2
        calcCount.incrementCountOperation();


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Count of using = " + calcCount.getCountOperation());
    }
}
