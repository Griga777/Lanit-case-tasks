package example;

//В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
public class Task7 {
    public static void calculateSumDigitsThreeDigitNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
