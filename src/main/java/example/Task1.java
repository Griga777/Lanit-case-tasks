package example;

//Напишите метод, находящий максимальное из двух чисел, не используя операторы if-else или любые другие операторы сравнения.
public class Task1 {
    public static String findMaximumValueOfTwoNumbers(String[] numbers) {
        double value1;
        double value2;

        if (numbers[0].equals("") || numbers[1].equals("")) {
            throw new TasksException("Числа не должны быть пустыми");
        }
        try {
            value1 = Double.parseDouble(numbers[0]);
            value2 = Double.parseDouble(numbers[1]);
        } catch (NumberFormatException e) {
            throw new TasksException("Введенные значения не являются числом", e);
        }
        if (value1 > Integer.MAX_VALUE || value1 < Integer.MIN_VALUE || value2 > Integer.MAX_VALUE || value2 < Integer.MIN_VALUE) {
            throw new TasksException("Превышен порог значений");
        }
//        return String.format("%.3f", Math.max(value1, value2)); // 1 вариант
        return String.format("%.3f", (value1 + value2 + Math.abs(value1 - value2)) / 2); // 2 вариант
    }
}
