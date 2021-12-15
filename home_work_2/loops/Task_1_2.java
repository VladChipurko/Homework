package home_work_2.loops;

public class Task_1_2 {
    public static void main(String[] args) {
        //извиняюсь за такую корявую проверку на дробность числа, но она и так сломала мне мозг
        //пытался придумать как сделать проверку аргумента на ввод не числа, но так и не смог...
        if(args.length == 0){
            System.out.println("Ошибка: введите аргумент, целое число");
            return;
        }
        Double x = Double.parseDouble(args[0]);
        if(x%1 != 0){
            System.out.println("Введено не целое число");
            return;
        }

        int number = Integer.parseInt(args[0]);

        int numberCopy = number;
        int count = 0;
        while (numberCopy != 0) {
            count++;
            numberCopy /= 10;
        }

        int[] arr = new int[count];
        for(int i = 0; number != 0; i++){
            arr[(arr.length-1)-i] = number%10;
            number /= 10;
        }

        long multi = 1;
        for (int a: arr){
            multi *= a;
        }

        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " * ");
        }
        System.out.println(arr[arr.length - 1] + " = " + multi);
    }
}
