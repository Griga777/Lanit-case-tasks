package example;

//В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
public class Task7 {
    public static Integer calculateSumDigitsThreeDigitNumber(int n) {
        int max = 999;
        int min = 100;
        int sum = 0;

        if (n == 0 || n < 0) {
            throw new TasksException("Число должно быть натуральным");
        }
        if (n > max || n < min) {
            throw new TasksException("Число должно быть трёхзначным");
        }
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
