package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Define locators using By
    private By usernameField = By.cssSelector("#mat-input-0");
    private By passwordField = By.cssSelector("#mat-input-1");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By reminderLocator = By.cssSelector("div[id='mat-dialog-title-0'] h4");
    private By closeButton = By.cssSelector("i[title='Close dialog']");
    private By profileIcon = By.cssSelector(".dropdown .fa-user-circle");
    private By logoutButton = By.cssSelector("a[title='LogOut']");
    private By errorMessageLocator = By.cssSelector("form[role='form'] span[class='ng-star-inserted']");
    private By forgotPasswordLink = By.cssSelector(".pull-left");
    private By forgotEmailField = By.cssSelector("#mat-input-0");
    private By requestResetLinkButton = By.cssSelector("span.mat-button-wrapper");
    private By loginHyperlink = By.cssSelector("a[href='/']");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    // Action methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void closeReminderPopupIfPresent() {
        try {
            WebElement reminderPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(reminderLocator));
            if (reminderPopup.isDisplayed()) {
                driver.findElement(closeButton).click();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void clickProfileIcon() {
        driver.findElement(profileIcon).click();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }

    public WebElement getErrorMessageElement() {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageLocator));
        } catch (TimeoutException e) {
            return null;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator));
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void handleInvalidLoginFlow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(getErrorMessageByLocator()));
        Assert.assertTrue(isErrorMessageDisplayed(), "The Username/Password is not correct.");
    }


    public By getErrorMessageByLocator() {
        return errorMessageLocator;
    }

    public boolean isLoginButtonDisabled() {
        WebElement button = driver.findElement(loginButton);
        return !button.isEnabled() || button.getAttribute("disabled") != null;
    }

    public void clickForgotPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink)).click();
    }
    public void enterForgotEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotEmailField)).sendKeys(email);
    }
    
    public void clickRequestResetLink() {
        wait.until(ExpectedConditions.elementToBeClickable(requestResetLinkButton)).click();
    }

    public void clickLoginHyperLink(){
        wait.until(ExpectedConditions.elementToBeClickable(loginHyperlink)).click();
    }

    public void handleHtmlPasswordAlertIfPresent() {
        try {
        WebElement okButton = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//button[contains(text(),'OK')]")
        ));
        if (okButton.isDisplayed()) {
            okButton.click();
            System.out.println("Handled HTML password alert by clicking OK.");
        }
        } catch (TimeoutException e) {
        }
    }

    public void handleForgotPasswordFlow(String username) {
        clickForgotPassword();
        wait.until(ExpectedConditions.urlContains("/forgotpassword"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ibox-content'] h3")));
        // Verify final URL
        String expectedUrl = "https://onetrackuiprerelease.azurewebsites.net/forgotpassword";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl, "Forgot Password redirection URL mismatch.");
    
        enterForgotEmail(username);
        clickRequestResetLink();
        clickLoginHyperLink();
    }
    
    public void handleValidLoginFlow() {
        WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon));
        Assert.assertTrue(profile.isDisplayed(), "Login was not successful. Profile icon not found.");
        clickProfileIcon();
        clickLogout();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        handleHtmlPasswordAlertIfPresent();
        closeReminderPopupIfPresent();
    }
}
