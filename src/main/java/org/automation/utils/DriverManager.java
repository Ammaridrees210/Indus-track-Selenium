package org.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
        private static WebDriver driver;

        public static WebDriver createWebDriver() {
                if (driver == null) {
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("--start-maximized");
                        options.addArguments("--disable-notifications");
                        options.addArguments("--incognito");
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
