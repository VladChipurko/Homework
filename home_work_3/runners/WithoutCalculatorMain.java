package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result = equation();

        System.out.println("Результат - " + result);
    }
    public static double equation(){
        double x =4.1 + 15 * 7 + (28.0 / 5) * (28.0 / 5);//результат == 140.45999999999998
        return x;
    }
}
