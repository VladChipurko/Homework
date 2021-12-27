package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Переопределяем метод возведения в степень
     */
    public double exponent(double a, double b) { return Math.pow(a,b); }

    /**
     * Переопределяем метод нахождения модуля числа
     */
    public int modul(int a) { return Math.abs(a); }

    /**
     * Переопределяем метод нахождения квадратного корня
     */
    public double square(double a){
        return Math.sqrt(a);
    }
}
