package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calculator =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        double a1 = calculator.division(28,5);//  28/5
        double a2 = calculator.exponent(a1, 2);//  (28//5)^2
        double a3 = calculator.intelligence(15,7);//  15 * 7
        double a4 = calculator.addition(4.1, a3);// 4.1 + 15 * 7
        double result = calculator.addition(a4,a2);// 4.1 + 15 * 7 + (28 / 5) ^ 2


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Count of using = " + calculator.getCountOperation());
    }
}
