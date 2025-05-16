package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public By getErrorMessageByLocator() {
        return By.cssSelector("form[role='form'] span[class='ng-star-inserted']");
    }

    public WebElement findElementByCss(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }

    public WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementVisibleByCss(String cssSelector) {
        return waitForElementVisible(By.cssSelector(cssSelector));
    }

    public WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForElementClickableByCss(String cssSelector) {
        return waitForElementClickable(By.cssSelector(cssSelector));
    }

    public WebElement waitForElementClickableByXpath(String cssSelector) {
        return waitForElementClickable(By.xpath(cssSelector));
    }

    public void waitForUrlContains(String partialUrl) {
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }

}
