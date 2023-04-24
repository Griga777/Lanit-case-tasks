package example;

//Реализуйте функцию, которая для заданного числа (int) печатает «foo», если это число делится на 3 без остатка,
//печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на 15 без остатка, печатает само число в остальных случаях.
public class Task4 {
    public static void outputWordOrNumber(String number) {
        int value;

        if (number.equals("")) {
            throw new TasksException("Число не должно быть пустым");
        }
        try {
            value = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new TasksException("Введенное значение не является числом", e);
        }
        if (value > Double.MAX_VALUE || value < Double.MIN_VALUE) {
            throw new TasksException("Превышен порог значений");
        }

        if (value % 15 == 0) {
            System.out.println("foobar");
        } else if (value % 3 == 0) {
            System.out.println("foo");
        } else if (value % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println(number);
        }
    }
}
