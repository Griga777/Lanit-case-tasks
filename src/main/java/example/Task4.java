package example;

//Реализуйте функцию, которая для заданного числа (int) печатает «foo», если это число делится на 3 без остатка,
//печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на 15 без остатка, печатает само число в остальных случаях.
public class Task4 {
    public static void outputWordOrNumber(int number) {
        if (number % 15 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println(number);
        }
    }
}
