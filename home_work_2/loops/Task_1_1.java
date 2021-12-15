package home_work_2.loops;

public class Task_1_1 {
    public static void main(String[] args) {
        //при вводе числа больше 25 происходит переполнение
        if(args.length == 0){
            System.out.println("Ошибка: введите аргумент, целое число от 1 до 25");
            return;
        }
        long number = Long.parseLong(args[0]);
        if(number < 1 || number > 25){
            System.out.println("Вы ввели некорректные данные");
            return;
        }

        long multi = 1;
        for(long i = 1; i <= number;i++){
            multi *= i;
            if(i < number){
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " = " + multi);
            }
        }
    }
}
