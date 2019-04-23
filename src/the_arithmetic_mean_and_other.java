import java.util.Scanner;

public class the_arithmetic_mean_and_other {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

                //Вводная информация. Что будем делать.

        System.out.print("Написать программу, которая будет выполнять следующие действия:\n" +
                "1. Ввод трех чисел с клавиатуры X,Y,Z\n" +
                "2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z\n" +
                "3. Деление среднего арифметического на 2 без остатка \n" +
                "4. Если полученное число больше 3, то вывести на экран сообщение \"Программа выполнена корректно\n" +
                "Let's go \n");

                //Блок переменных (Объявление + ввод из консоли)

        double arithmetic_mean;
        long arithmetic_mean_half;

        double X , Y , Z;
        System.out.println("Введите переменную X: ");
        X = in.nextDouble();
        System.out.println("Введите переменную Y: ");
        Y = in.nextDouble();
        System.out.println("Введите переменную Z: ");
        Z = in.nextDouble();

                //Data processing

        arithmetic_mean = (X + Y + Z) / 3;
        System.out.println("Среднее арифметическое трёх чисел = " + arithmetic_mean);
        arithmetic_mean_half = (long) arithmetic_mean / 2;
        System.out.println("Целочисленный результат деления среднего арифметического трёх чисел на 2 = " + arithmetic_mean_half);

        if (arithmetic_mean_half > 3) {

            System.out.println("Программа выполнена корректно");

        }

    }
}
