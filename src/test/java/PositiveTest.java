import example.Task1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {

    @DataProvider
    public Object[][] positiveDataForTask1() {
        return new Object[][]{
                {-1, -1, -1},
                {-1, 0, 0},
                {0, 0, 0},
                {0, 1, 1},
                {1, 1, 1},
                {-1, 1, 1},
                {-2147483648, -2147483648, -2147483648},
                {2147483647, 2147483647, 2147483647},
                {-2147483648, 2147483647, 2147483647},
                {-3, -9, -3},
                {993, 109, 993}
        };
    }

    @Test(dataProvider = "positiveDataForTask1")
    void positiveTestForTask1(int number1, int number2, int resultProvider) {
        Integer result = Task1.findMaximumValueOfTwoNumbers(number1, number2);
        Assert.assertEquals(result, resultProvider);
    }
}

