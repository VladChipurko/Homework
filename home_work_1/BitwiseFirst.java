package home_work_1;

public class BitwiseFirst {
    public static void main(String[] args) {
        int a = 42;//00101010
        int b = 15;//00001111

        int c = ~a;//00101010 - 11010101 1 меняется на 0, и наоборот
        int d = ~b;//00001111 - 11110000
        System.out.println(c);//-43
        System.out.println(d);//-16
        int e = a & b;//00001010 если и в a и в b 1, то итоговая 1
        System.out.println(e);//10
        int f = a | b;//00101111 если в a или b 1 то итоговая 1
        System.out.println(f);//47
        int g = a^b;//00100101 в случае если только в a или только в b 1 тогда итоговая 1
        System.out.println(g);//37
        int h = a>>2;//00001010 сдвиг вправо на указанное колво , слева замещается нулями
        System.out.println(h);//10
        int i = b<<2;//00111100 сдвиг влево на 2 ,справа появляются 0
        System.out.println(i);//60
        int j = a>>>1;//00010101 сдвиг вправо на указанное колво
        System.out.println(j);//21

        a &= b;//00001010 если в обоих переменных 1, то итоговая 1, в конце полученное значение присваивается в а
        System.out.println(a);//10
        a |= b;//00001111 или в a  или в b 1 - итоговая 1, полученный результат данной операции присаиваем в а
        System.out.println(a);//15
        a ^= b;//00000000 или только в а или только в b 1, тогда 1. Получился 0, так как сравнивали 00001111 с 00001111
        System.out.println(a);//0
        b >>= 2;//00000011 сдвиг вправо на 2 (слева появляются 0)
        System.out.println(b);//3
        b <<= 2;//00001100 сдвиг влево на 2
        System.out.println(b);//12
    }
}
