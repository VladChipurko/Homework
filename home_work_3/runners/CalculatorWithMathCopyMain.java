package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc1 = new CalculatorWithMathCopy();

        double result = calc1.addition(calc1.addition(4.1, calc1.intelligence(15,7)),
                calc1.exponent(calc1.division(28,5), 2));//результат == 140.45999999999998

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
