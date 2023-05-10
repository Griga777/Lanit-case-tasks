import example.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

import static org.testng.Assert.assertThrows;

public class NegativeTest {

    @DataProvider
    public Object[][] negativeDataForTask1() {
        return new Object[][]{
                {"", "-85.0"},
                {"357.3", ""},
                {"#", "159.0"},
                {"-3.0", "five"},
                {"2147483648.0", "3.5"},
                {"-9.99", "-2147483649.0"}
        };
    }

    @Test(dataProvider = "negativeDataForTask1", expectedExceptions = TasksException.class)
    void negativeTestForTask1(String number1, String number2) {
        String[] numbers = {number1, number2};
        Task1.findMaximumValueOfTwoNumbers(numbers);
    }

    @DataProvider
    public Object[][] negativeDataForTask2() {
        return new Object[][]{
                {"", "-85"},
                {"157", ""},
                {"#", "999"},
                {"-5", "five"},
                {"2147483648", "54"},
                {"-11", "-2147483649"}
        };
    }

    @Test(dataProvider = "negativeDataForTask2", expectedExceptions = TasksException.class)
    void negativeTestForTask2(String number1, String number2) {
        String[] numbers = {number1, number2};
        Task2.swapValues(numbers);
    }

    @DataProvider
    public Object[][] negativeDataForTask3() {
        return new Object[][]{
                {"", "я люблю пиво!"},
                {"одинаковая строка", "одинаковая строка"}
        };
    }

    @Test(dataProvider = "negativeDataForTask3", expectedExceptions = TasksException.class)
    void negativeTestForTask3(String s, String t) {
        Task3.permutation(s, t);
    }

    @DataProvider
    public Object[][] negativeDataForTask4() {
        return new Object[][]{
                {""},
                {"один"},
                {"-five"},
                {"2147483648"},
                {"-2147483649"}
        };
    }

    @Test(dataProvider = "negativeDataForTask4", expectedExceptions = TasksException.class)
    void negativeTestForTask4(String number) {
        Task4.outputWordOrNumber(number);
    }

    @DataProvider
    public Object[][] negativeDataForTask5() {
        return new Object[][]{
                {new Integer[]{10, null, 11}},
                {new Integer[]{null, null}}
        };
    }

    @Test(dataProvider = "negativeDataForTask5")
    void negativeTestForTask5(Integer[] numbers) {
        assertThrows(NullPointerException.class, () -> Task5.returnNearestNumber(numbers));
    }

    @DataProvider
    public Object[][] negativeDataForTask6() {
        return new Object[][]{
                {""},
                {"1234567890"},
                {"+/-;.!~`&%#@?,_*(.):№$^"},
                {"Это ЦИФРА 9"}
        };
    }

    @Test(dataProvider = "negativeDataForTask6", expectedExceptions = TasksException.class)
    void negativeTestForTask6(String s) {
        Task6.returnModifiedString(s);
    }

    @DataProvider
    public Object[][] negativeDataForTask7() {
        return new Object[][]{
                {-100},
                {0},
                {1},
                {99},
                {1000}
        };
    }

    @Test(dataProvider = "negativeDataForTask7", expectedExceptions = TasksException.class)
    void negativeTestForTask7(int n) {
        Task7.calculateSumDigitsThreeDigitNumber(n);
    }
}
