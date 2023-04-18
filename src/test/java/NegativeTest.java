import example.Task1;
import example.TasksException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
}
