import example.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {

    @DataProvider
    public Object[][] positiveDataForTask1() {
        return new Object[][]{
                {"-1.0", "0.0", 0.0},
                {"0.0", "0.0", 0.0},
                {"0.0", "1.0", 1.0},
                {"-1.0", "1.0", 1.0},
                {"-2147483648.0", "-2147483647.0", -2147483647.0},
                {"2147483646.0", "2147483647.0", 2147483647.0},
                {"-2147483648.0", "2147483647.0", 2147483647.0},
                {"-3.3", "-9.53", -3.3},
                {"993.0", "109.9", 993.0}
        };
    }

    @Test(dataProvider = "positiveDataForTask1")
    void positiveTestForTask1(String number1, String number2, double resultProvider) {
        String[] numbers = {number1, number2};
        String result = Task1.findMaximumValueOfTwoNumbers(numbers);
        Assert.assertEquals(result, String.format("%.3f", resultProvider));
    }

    @DataProvider
    public Object[][] positiveDataForTask2() {
        return new Object[][]{
                {"-1", "0", new String[]{"0", "-1"}},
                {"0", "0", new String[]{"0", "0"}},
                {"0", "1", new String[]{"1", "0"}},
                {"-1", "1", new String[]{"1", "-1"}},
                {"-2147483648", "-2147483647", new String[]{"-2147483647", "-2147483648"}},
                {"2147483646", "2147483647", new String[]{"2147483647", "2147483646"}},
                {"-2147483648", "2147483647", new String[]{"2147483647", "-2147483648"}},
                {"-123", "-1000", new String[]{"-1000", "-123"}},
                {"15500", "505", new String[]{"505", "15500"}}
        };
    }

    @Test(dataProvider = "positiveDataForTask2")
    void positiveTestForTask2(String number1, String number2, String[] resultProvider) {
        String[] numbers = {number1, number2};
        String[] result = Task2.swapValues(numbers);
        Assert.assertEquals(result, resultProvider);
    }

    @DataProvider
    public Object[][] positiveDataForTask3() {
        return new Object[][]{
                {"я люблю пиво!", "пиво люблю я!", true},
                {"я люблю играть в футбол!", "я играю в футбол с друзьями", false},
                {"::%№!)?*//+;_(%$~&^)", "::%^!(?*//+;_)%$~&)№", true}
        };
    }

    @Test(dataProvider = "positiveDataForTask3")
    void positiveTestForTask3(String s, String t, boolean resultProvider) {
        Boolean result = Task3.permutation(s, t);
        Assert.assertEquals(result, resultProvider);
    }

    @DataProvider
    public Object[][] positiveDataForTask4() {
        return new Object[][]{
                {-1, "-1"},
                {0, "foobar"},
                {1, "1"},
                {-2147483648, "-2147483648"},
                {-2147483647, "-2147483647"},
                {2147483646, "foo"},
                {2147483647, "2147483647"},
                {-225, "foobar"},
                {9, "foo"},
                {1550, "bar"},
                {-17, "-17"}
        };
    }

    @Test(dataProvider = "positiveDataForTask4")
    void positiveTestForTask4(Integer number, String resultProvider) {
        String result = Task4.outputWordOrNumber(number);
        Assert.assertEquals(result, resultProvider);
    }

    @DataProvider
    public Object[][] positiveDataForTask5() {
        return new Object[][]{
                {new Integer[]{0, 0}, 0},
                {new Integer[]{-1, 1, 0}, 1},
                {new Integer[]{10, 10}, 10},
                {new Integer[]{9, 11, 22}, 11},
                {new Integer[]{-2147483648, -2147483647, 2147483647, 2147483646}, 2147483646},
                {new Integer[]{5, 7, 3}, 7},
                {new Integer[]{256, 128, 1024}, 128},
                {new Integer[]{-30, -50, -25900, -1005, -99}, -30},
                {new Integer[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1}, Integer.MIN_VALUE + 1}
        };
    }

    @Test(dataProvider = "positiveDataForTask5")
    void positiveTestForTask5(Integer[] numbers, int resultProvider) {
        Integer result = Task5.returnNearestNumber(numbers);
        Assert.assertEquals(result, resultProvider);
    }

    @DataProvider
    public Object[][] positiveDataForTask6() {
        return new Object[][]{
                {"лето", "лето"},
                {"claSS", "SSalc"},
                {"Футбол", "лобтуФ"},
                {"Это НОВЫЙ тестик", "Это ЙЫВОН китсет"},
                {"I like PIZZA", "I like AZZIP"}
        };
    }

    @Test(dataProvider = "positiveDataForTask6")
    void positiveTestForTask6(String s, String resultProvider) {
        String result = Task6.returnModifiedString(s);
        Assert.assertEquals(result, resultProvider);
    }

    @DataProvider
    public Object[][] positiveDataForTask7() {
        return new Object[][]{
                {100, 1},
                {101, 2},
                {998, 26},
                {999, 27},
                {159, 15}
        };
    }

    @Test(dataProvider = "positiveDataForTask7")
    void positiveTestForTask7(int n, int resultProvider) {
        Integer result = Task7.calculateSumDigitsThreeDigitNumber(n);
        Assert.assertEquals(result, resultProvider);
    }
}

