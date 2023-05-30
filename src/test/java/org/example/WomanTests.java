package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WomanTests {
    @DataProvider(name = "womanData")
    public Object[][] womanData() {
        return new Object[][] {
                {"Alice", "Smith", 58, null, "Smith"},
                {"Emma", "Johnson", 62, null, "Johnson"},
                {"Olivia", "Williams", 63, null, "Williams"},
                {"Sophia", "Brown", 65, null, "Brown"},
                {"Mia", "Davis", 60, new Man("John", "Smith", 62), "Smith"},
                {"Ava", "Miller", 61, new Man("Robert", "Johnson", 63), "Johnson"}
        };
    }

    @Test(dataProvider = "womanData")
    public void testIsRetired(String firstName, String lastName, int age, Man partner, String expectedLastName) {
        Woman woman = new Woman(firstName, lastName, age);
        woman.setPartner(partner);
        Assert.assertEquals(woman.isRetired(), age >= 60);
    }

    @Test(dataProvider = "womanData")
    public void testGetLastName(String firstName, String lastName, int age, Man partner, String expectedLastName) {
        Woman woman = new Woman(firstName, lastName, age);
        woman.setPartner(partner);
        Assert.assertEquals(woman.getLastName(), expectedLastName);
    }
}
