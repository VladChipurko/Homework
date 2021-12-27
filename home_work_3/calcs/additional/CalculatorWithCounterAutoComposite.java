package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithOperator calculator = new CalculatorWithOperator();

    private long CountOperation;

    public void incrementCountOperation(){
        CountOperation++;
    }

    public long getCountOperation() {
        return CountOperation;
    }


    public double addition(double a, double b) {
        incrementCountOperation();
        return calculator.addition(a, b);
    }

    public double subtraction(double a, double b){
        incrementCountOperation();
        return calculator.subtraction(a, b);
    }

    public double intelligence(double a, double b){
        incrementCountOperation();
        return calculator.intelligence(a, b);
    }

    public double division(double a, double b){
        incrementCountOperation();
        return calculator.division(a, b);
    }

    public double exponent(double a, double b){
        incrementCountOperation();
        return calculator.exponent(a, b);
    }

    public int modul(int a){
        incrementCountOperation();
        return calculator.modul(a);
    }

    public double square(double a){
        incrementCountOperation();
        return calculator.square(a);
    }
}
