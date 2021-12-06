package home_work_1;

public class SecondTask {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double c = 8;

        //2.1
        double one = a+b/c;
        System.out.println(one);

        //2.2
        double two = (a+b)/c;
        System.out.println(two);

        //2.3
        double three = (a+b++)/c;
        System.out.println(three);

        //2.4
        b = 2;
        double four = (a+b++)/--c;
        System.out.println(four);

        //2.5
        b = 2;
        c = 8;
        double five = (a*b>>b++)/--c;
        System.out.println(five);

        //2.6
        b = 2;
        c = 8;
        double six = (a + 7 > 20 ? 68 : 22 * b >> b++)/--c;
        System.out.println(six);

        //2.7 не записан , так как в условии присутствуют данные для типа boolean и числовые

        //2.8
        boolean eight = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(eight);//false

        //2.9
        boolean nine = true && false;
        System.out.println(nine);//false
    }
}
