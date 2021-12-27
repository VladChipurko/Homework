package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    private long CountOperation;
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    public void incrementCountOperation(){
        CountOperation++;
    }

    public long getCountOperation() {
        return CountOperation;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator1){
        this.calculator1 = calculator1;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator2){
        this.calculator2 = calculator2;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator3){
        this.calculator3 = calculator3;
    }

    public double addition(double a, double b) {
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.addition(a, b);
        } else if (calculator2 != null) {
            return calculator2.addition(a, b);
        }
        return calculator3.addition(a, b);
    }

    public double subtraction(double a, double b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.subtraction(a, b);
        } else if (calculator2 != null) {
            return calculator2.subtraction(a, b);
        }
        return calculator3.subtraction(a, b);
    }

    public double intelligence(double a, double b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.intelligence(a, b);
        } else if (calculator2 != null) {
            return calculator2.intelligence(a, b);
        }
        return calculator3.intelligence(a, b);
    }

    public double division(double a, double b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.division(a, b);
        } else if (calculator2 != null) {
            return calculator2.division(a, b);
        }
        return calculator3.division(a, b);
    }

    public double exponent(double a, double b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.exponent(a, b);
        } else if (calculator2 != null) {
            return calculator2.exponent(a, b);
        }
        return calculator3.exponent(a, b);
    }

    public int modul(int a){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.modul(a);
        } else if (calculator2 != null) {
            return calculator2.modul(a);
        }
        return calculator3.modul(a);
    }

    public double square(double a){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.square(a);
        } else if (calculator2 != null) {
            return calculator2.square(a);
        }
        return calculator3.square(a);
    }
}
