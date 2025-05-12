package org.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final CommonPage common;

    public String reminderWordAssertion = "div[id='mat-dialog-title-0'] h4";
    public String crossIcon = "i[title='Close dialog']";
    public String forgotPasswordHyperLink = ".pull-left";
    public String visibilityOfForgotPasswordLink = "/forgotpassword";
    public String visibilityOfForgotPasswordWording = "div[class='ibox-content'] h3";
    public String userNameSelector = "#mat-input-0";
    public String userPassword = "#mat-input-1";
    public String loginButton = "button[type='submit']";
    public String logoutButton = "a[title='LogOut']";
    public String profileFavicon = ".dropdown .fa-user-circle";
    public String loginPageHyperLink = "a[href='/']";
    public String requestResetLinkButton = "span.mat-button-wrapper";
    public String getErrorMassageElement = "form[role='form'] span[class='ng-star-inserted']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        this.common = new CommonPage(driver);
    }

    public void closeReminderPopupIfPresent() {
        try {
            waitInSeconds(4);
            WebElement reminderPopup = wait
                    .until(ExpectedConditions.visibilityOf(common.findElementByCss(reminderWordAssertion)));
            if (reminderPopup.isDisplayed()) {
                common.findElementByCss(crossIcon).click();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            WebElement element = common.findElementByCss(getErrorMassageElement);
            return element.isDisplayed();
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void handleInvalidLoginFlow() {
        common.waitForElementVisible(common.getErrorMessageByLocator());
        Assert.assertTrue(isErrorMessageDisplayed(), "The Username/Password is not correct.");
    }

    public void handleForgotPasswordFlow(String email) {
        common.waitForElementClickableByCss(forgotPasswordHyperLink).click();
        common.waitForUrlContains(visibilityOfForgotPasswordLink);
        common.waitForElementVisible( visibilityOfForgotPasswordWording));
        // Verify final URL
        String expectedUrl = "https://onetrackuiprerelease.azurewebsites.net/forgotpassword";
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl, "Forgot Password redirection URL mismatch.");
        common.waitForElementVisibleByCss(userNameSelector).sendKeys(email);
        common.waitForElementClickableByCss(requestResetLinkButton).click();
        common.waitForElementClickableByCss(loginPageHyperLink).click();

    }

    public void handleValidLoginFlow() {
        By profileIcon =  profileFavicon);
        WebElement profile =common.waitForElementVisible(profileIcon);
        Assert.assertTrue(profile.isDisplayed(), "Login was not successful. Profile icon not found.");
        profile.click();
        common.findElementByCss(logoutButton).click();
    }

    public void login(String username, String password) {
        common.findElementByCss(userNameSelector).sendKeys(username);
        common.findElementByCss(userPassword).sendKeys(password);
        common.findElementByCss(loginButton).click();
        closeReminderPopupIfPresent();
    }

    private void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}