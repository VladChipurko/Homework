package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long CountOperation;

    /**
     * Метод увеличения счетчика использования
     */
    public void incrementCountOperation(){
        CountOperation++;
    }

    @Override
    public double exponent(double a, double b) {
        incrementCountOperation();
        return super.exponent(a, b);
    }

    @Override
    public int modul(int a) {
        incrementCountOperation();
        return super.modul(a);
    }

    @Override
    public double square(double a) {
        incrementCountOperation();
        return super.square(a);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double intelligence(double a, double b) {
        incrementCountOperation();
        return super.intelligence(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    /**
     * Метод возвращающий кол-во использований калькулятора
     * @return
     */
    public long getCountOperation() {
        return CountOperation;
    }
}
