package example;

//Напишите функцию, меняющую местами значения переменных, не используя временные переменные.
public class Task2 {
    public static String[] swapValues(String[] numbers) {
        int a;
        int b;

        if (numbers[0].equals("") || numbers[1].equals("")) {
            throw new TasksException("Числа не должны быть пустыми");
        }
        try {
            a = Integer.parseInt(numbers[0]);
            b = Integer.parseInt(numbers[1]);
        } catch (NumberFormatException e) {
            throw new TasksException("Введенные значения не являются числом", e);
        }
        if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE || b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) {
            throw new TasksException("Превышен порог значений");
        }

        // Пример для a = 9, b = 4
        a = a + b; // a = 9 + 4 = 13 - сумма 9 и 4
        b = a - b; // b = 13 - 4 = 9
        a = a - b; // a = 13 - 9 = 4
        return new String[]{String.valueOf(a), String.valueOf(b)};
    }
}
