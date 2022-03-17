package tests;

import org.testng.annotations.*;

public class Base {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");

    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");

    }

}
