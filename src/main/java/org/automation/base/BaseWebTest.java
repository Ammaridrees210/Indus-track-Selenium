package org.automation.base;

import org.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class BaseWebTest {
        protected WebDriver driver;

        @BeforeClass
        public void setUp() {
                driver = DriverManager.createWebDriver();
        }

        @AfterClass
        public void tearDown() {
                if (driver != null) {
                driver.quit();
                }
        }
}
