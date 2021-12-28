package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    /**
     * Объявление поля счетчика
     */
    private long countOperation;

    /**
     * Метод увеличения счетчика на 1
     */
    public void incrementCountOperation() { countOperation = countOperation + 1; }

    /**
     * Метод возвращения счетчика использования калькулятора
     */
    public long getCountOperation(){
        return countOperation;
    }
}
