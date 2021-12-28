package home_work_3.calcs.additional;

public class CalculatorWithMemory {

    private double memory;
    private double bufer;

    /**
     * Метод записи значения в память
     */
    public void toMemory(){
        memory = bufer;
    }

    /**
     * Метод получения из памяти (при его вызове память обнуляется)
     * @return
     */
    public double getMemory(){
        double a;
        a = memory;
        memory = 0;
        return a;
    }

    /**
     * Метод сложения
     */
    public double addition(double a, double b){
        bufer = a + b;
        return bufer;
    }

    /**
     * Метод вычитания
     */
    public double subtraction(double a, double b){
        bufer = a - b;
        return bufer;
    }

    /**
     * Метод умножения
     */
    public double intelligence(double a, double b){
        bufer = a * b;
        return bufer;
    }

    /**
     * Метод деления
     */
    public double division(double a, double b){
        bufer = a / b;
        return bufer;
    }

    /**
     * Метод возведения в целую степень дробного положительного числа
     */
    public double exponent(double a, double b){
        for (int i = 1; i < b; i++){
            a *= a;
        }
        bufer = a;
        return bufer;
    }

    /**
     * Метод нахождения модуля числа
     */
    public double modul(double a){
        if(a < 0){
            bufer = -a;
        }else{
            bufer = a;
        }
        return bufer;
    }

    /**
     * Метод нахождения квадратного корня
     */
    public double square(double a){
        bufer = Math.sqrt(a);
        return bufer;
    }
}
