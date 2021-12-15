package home_work_2.loops;

public class Task_1_5 {
    public static void main(String[] args) {
        calculator(2, 5);
        System.out.println();
        calculator(6, 9);
    }
    public static void calculator(int from, int to){
        for(int i = 1; i <= 10; i++){
            for(int number = from; number <= to; number++) {
                System.out.print(number + " x " + i + " = " + (number*i) + "\t\t");
            }
            System.out.print("\n");
        }
    }
}
