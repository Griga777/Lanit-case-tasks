import example.Task1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {

    @DataProvider
    public Object[][] positiveDataForTask1() {
        return new Object[][]{
                {"-1.0", "-1.0", -1.0},
                {"-1.0", "0.0", 0.0},
                {"0.0", "0.0", 0.0},
                {"0.0", "1.0", 1.0},
                {"1.0", "1.0", 1.0},
                {"-1.0", "1.0", 1.0},
                {"-2147483648.0", "-2147483648.0", -2147483648.0},
                {"-2147483647.0", "-2147483648.0", -2147483647.0},
                {"2147483647.0", "2147483647.0", 2147483647.0},
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

//    @DataProvider
//    public Object[][] positiveDataForTask2() {
//        return new Object[][]{
//                {-1, -1, -1, -1},
//                {-1, 0, 0, -1},
//                {0, 0, 0},
//                {0, 1, 1},
//                {1, 1, 1},
//                {-1, 1, 1},
//                {-2147483648, -2147483648, -2147483648},
//                {-2147483647, -2147483648, -2147483647},
//                {2147483647, 2147483647, 2147483647},
//                {2147483646, 2147483647, 2147483647},
//                {-2147483648, 2147483647, 2147483647},
//                {-3, -9, -3},
//                {993, 109, 993}
//        };
//    }

//    @Test(dataProvider = "positiveDataForTask2")
//    void positiveTestForTask2(double number1, double number2, double resultProvider) {
//        Double result = Task1.findMaximumValueOfTwoNumbers(number1, number2);
//        Assert.assertEquals(result, resultProvider);
//    }
}

