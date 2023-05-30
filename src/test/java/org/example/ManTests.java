package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ManTests {

    @DataProvider(name = "manDataProvider")
    public Object[][] manDataProvider() {
        return new Object[][] {
                {"John", "Doe", 50, false},
                {"Mike", "Smith", 70, true},
                {"Adam", "Johnson", 65, true},
                {"David", "Brown", 55, false}
        };
    }

    @Test(dataProvider = "manDataProvider")
    public void testIsRetired(String firstName, String lastName, int age, boolean expectedRetired) {
        Man man = new Man(firstName, lastName, age);
        assertEquals(man.isRetired(), expectedRetired);
    }
}