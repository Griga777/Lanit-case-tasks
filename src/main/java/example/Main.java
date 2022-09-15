package example;

public class Main {
    public static void main(String[] args) {
        Task1.findMaximumValueOfTwoNumbers(-5, -7);
        System.out.println("======================");
        Task2.swapValues(-9, 9);
        System.out.println("======================");
        System.out.println(Task3.permutation("я люблю пиво!", "пиво люблю я!"));
        System.out.println("======================");
        Task4.outputWordOrNumber(91);
        System.out.println("======================");
        int[] numbers = {12, 22, 8};
        System.out.println(Task5.returnNearestNumber(numbers));
        System.out.println("======================");
        Task7.calculateSumDigitsThreeDigitNumber(159);
        System.out.println("======================");
    }
}
