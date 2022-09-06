package example;

//Напишите метод, находящий максимальное из двух чисел, не используя операторы if-else или любые другие операторы сравнения.
public class Task1 {
    public static void findMaximumValueOfTwoNumbers(int number1, int number2) {
        int maxValue = Math.max(number1, number2);
        System.out.println(maxValue);
    }
}
