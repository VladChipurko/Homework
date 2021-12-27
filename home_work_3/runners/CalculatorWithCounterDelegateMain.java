package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        /**
         * Создание объекта калькулятора класса CalculatorWithCounterAutoAgregation
         */
        CalculatorWithCounterAutoAgregation agregation =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());

        double a1 = agregation.division(28,5);//  28/5
        double a2 = agregation.exponent(a1, 2);//  (28//5)^2
        double a3 = agregation.intelligence(15,7);//  15 * 7
        double a4 = agregation.addition(4.1, a3);// 4.1 + 15 * 7
        double result = agregation.addition(a4,a2);// 4.1 + 15 * 7 + (28 / 5) ^ 2


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Count of using = " + agregation.getCountOperation());

        /**
         * Создание объекта калькулятора класса CalculatorWithCounterAutoComposite
         */
        CalculatorWithCounterAutoComposite composite =
                new CalculatorWithCounterAutoComposite(/*передаем сюда new калькулятор*/);

        double b1 = composite.division(28,5);//  28/5
        double b2 = composite.exponent(b1, 2);//  (28//5)^2
        double b3 = composite.intelligence(15,7);//  15 * 7
        double b4 = composite.addition(4.1, b3);// 4.1 + 15 * 7
        double result2 = composite.addition(b4,b2);// 4.1 + 15 * 7 + (28 / 5) ^ 2


        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result2);
        System.out.println("Count of using = " + composite.getCountOperation());
    }
}
