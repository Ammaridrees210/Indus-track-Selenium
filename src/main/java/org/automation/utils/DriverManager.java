package org.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
        private static WebDriver driver;

        public static WebDriver createWebDriver() {
                if (driver == null) {
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--start-maximized"); // Open in maximized mode
                        options.addArguments("--disable-notifications"); // Disable pop-ups
                        driver = new ChromeDriver(options);
                }
                return driver;
        }

        public static void quitDriver() {
                if (driver != null) {
                        driver.quit();
                        driver = null;
                }
        }
}
