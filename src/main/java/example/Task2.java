package example;

//Напишите функцию, меняющую местами значения переменных, не используя временные переменные.
public class Task2 {
    public static void swapValues(int a, int b) {
        // Пример для a = 9, b = 4
        a = a - b; // a = 9 - 4 = 5 - разница м/у 9 и 4
        b = a + b; // b = 5 + 4 = 9
        a = b - a; // a = 9 - 5 = 4

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
