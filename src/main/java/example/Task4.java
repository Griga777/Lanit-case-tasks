package example;

//Реализуйте функцию, которая для заданного числа (int) печатает «foo», если это число делится на 3 без остатка,
//печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на 15 без остатка, печатает само число в остальных случаях.
public class Task4 {
    public static String outputWordOrNumber(Integer number) {
        if (number == null) {
            throw new TasksException("Значение не должно быть пустым");
        }

        if (number % 15 == 0) {
            System.out.println("foobar");
            return "foobar";
        } else if (number % 3 == 0) {
            System.out.println("foo");
            return "foo";
        } else if (number % 5 == 0) {
            System.out.println("bar");
            return "bar";
        }
        System.out.println(number);
        return String.valueOf(number);
    }
}
