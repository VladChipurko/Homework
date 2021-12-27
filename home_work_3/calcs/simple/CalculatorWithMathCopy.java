package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод сложения
     */
    public double addition(double a, double b){
        return a + b;
    }

    /**
     * Метод вычитания
     */
    public double subtraction(double a, double b){
        return a - b;
    }

    /**
     * Метод умножения
     */
    public double intelligence(double a, double b){
        return a * b;
    }

    /**
     * Метод деления
     */
    public double division(double a, double b){
        return a / b;
    }

    /**
     * Метод возведения в целую степень дробного положительного числа
     */
    public double exponent(double a, double b) { return Math.pow(a,b); }

    /**
     * Метод нахождения модуля числа
     */
    public int modul(int a) { return Math.abs(a); }

    /**
     * Метод нахождения квадратного корня
     */
    public double square(double a){
        return Math.sqrt(a);
    }
}
