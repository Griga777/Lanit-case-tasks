import example.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"-5.0", "-7.0"};
        System.out.println(Task1.findMaximumValueOfTwoNumbers(numbers));
        System.out.println("======================");

        String[] numbers1 = {"-9", "9"};
        System.out.println(Arrays.toString(Task2.swapValues(numbers1)));
        System.out.println("======================");

        System.out.println(Task3.permutation("я люблю пиво!", "пиво люблю я!"));
        System.out.println("======================");

        Task4.outputWordOrNumber(10);
        System.out.println("======================");

        Integer[] values = {8, 22, 12};
        System.out.println(Task5.returnNearestNumber(values));
        System.out.println("======================");

        System.out.println(Task6.returnModifiedString("Это новый тестик"));
        System.out.println("======================");

        Task7.calculateSumDigitsThreeDigitNumber(159);
        System.out.println("======================");

        System.out.println(Task8.removeDuplicateSymbols("Hello Word of Tanks"));
        System.out.println("======================");
    }
}
