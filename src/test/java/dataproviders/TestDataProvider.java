package dataproviders;

import org.example.Man;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "personData")
    public static Object[][] personData() {
        return new Object[][]{
                {"John", "Doe", 50, false},
                {"Mike", "Smith", 70, true},
                {"Adam", "Johnson", 65, true},
                {"David", "Brown", 55, false}
        };
    }

    @DataProvider(name = "womanData")
    public static Object[][] womanData() {
        return new Object[][]{
                {"Mary", "Johnson", 50, null, "Johnson"},
                {"Sarah", "Smith", 65, new Man("John", "Doe", 70), "Doe"},
                {"Emma", "Brown", 55, new Man("David", "Brown", 60), "Brown"},
                {"Julia", "Davis", 70, null, "Davis"}
        };
    }
}