package org.automation.pages;

import org.data.webData;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.automation.locators.OfficerPageLocators.*;
import org.testng.Assert;

import java.time.Duration;

public class OfficerPage {
        private final WebDriver driver;
        private final WebDriverWait wait;

        // Constructor
        public OfficerPage(WebDriver driver) {
                this.driver = driver;
                this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void newEmail(String email) {
                driver.findElement(officerUserEmail).sendKeys(email);
        }

        public void passwordNew(String passwordNew) {
                driver.findElement(officerNewPassword).sendKeys(passwordNew);
        }

        public void confirmNewPassword(String confirmPassword){
                driver.findElement(confirmPasswordNew).sendKeys(confirmPassword);
        }

        public void firstName(String firstName){
                driver.findElement(firstNameOfOfficerUser).clear();
                driver.findElement(firstNameOfOfficerUser).sendKeys(firstName);
        }

        public void lastName(String lastName){
                driver.findElement(lastNameOfOfficerUser).clear();
                driver.findElement(lastNameOfOfficerUser).sendKeys(lastName);
        }

        public void phone(String phone){
                driver.findElement(phoneNumberOfofficerUser).clear();
                driver.findElement(phoneNumberOfofficerUser).sendKeys(phone);
        }

        public void street(String street){
                driver.findElement(streetOfofficerUser).clear();
                driver.findElement(streetOfofficerUser).sendKeys(street);
        }

        public void city(String city){
                driver.findElement(cityNameOfofficerUser).clear();
                driver.findElement(cityNameOfofficerUser).sendKeys(city);
        }

        public void state(String state){
                driver.findElement(stateOfofficerUser).clear();
                driver.findElement(stateOfofficerUser).sendKeys(state);
        }

        public void zip(String zip){
                driver.findElement(zipCodeofficerUser).clear();
                driver.findElement(zipCodeofficerUser).sendKeys(zip);
        }
        public void country(String country){
                driver.findElement(countryofficerUser).clear();
                driver.findElement(countryofficerUser).sendKeys(country);
        }

        public void clickOutsideDropdown() {
                driver.findElement(outsideElement).click();
        }

        public void clickOnFilterfield(String email){
                driver.findElement(SearchOfficerUser).sendKeys(email);
        }

        public String getSelectedRoleText() {
                return driver.findElement(clickOnRole).getText().trim();
        }

        public String getOfficerFirstName() {
                return driver.findElement(firstNameOfOfficerUser).getAttribute("value");
        }
        public String getOfficerLastName() {
                return driver.findElement(lastNameOfOfficerUser).getAttribute("value");
        }
        public String getOfficerPhoneNumber() {
                return driver.findElement(phoneNumberOfofficerUser).getAttribute("value");
        }
        public String getSelectedMobileProviderText() {
                return driver.findElement(selectOptionOfMobile).getText().trim();
        }
        public String getOfficerStreet() {
                return driver.findElement(streetOfofficerUser).getAttribute("value");
        }
        public String getOfficerCityName() {
                return driver.findElement(cityNameOfofficerUser).getAttribute("value");
        }
        public String getOfficerStateName() {
                return driver.findElement(stateOfofficerUser).getAttribute("value");
        }
        public String getOfficerZipNumber() {
                return driver.findElement(zipCodeofficerUser).getAttribute("value");
        }
        public String getOfficerCountryName() {
                return driver.findElement(countryofficerUser).getAttribute("value");
        }
        public String getSelectedCalendarText(){
                return driver.findElement(clickOnSelectCalendarToOpenDropDown).getText().trim();
        }
        public String getSelectedVehicleText(){
                return driver.findElement(clickOnMapVisibilityDropdown).getText().trim();
        }
        public String getSelectedRedirectpathNameAfterLoginText(){
                return driver.findElement(clickOnDropDownToSelectRedirectPage).getText().trim();
        }
        public String getSelectedEstimeateTemplateText(){
                return driver.findElement(clickOnEstimateDropDown).getText().trim();
        }
        public String getSelectedEmailEstimeateTemplateText(){
                return driver.findElement(clickOnEstimateEmailTemplateDropdown).getText().trim();
        }
        public String getSelectedInvoiceEmailemplateText(){
                return driver.findElement(clickOnInvoiceEmailTemplateDropdown).getText().trim();
        }
        public String getSelectedInvoiceReminderEmailTemplateText(){
                return driver.findElement(clickOnInvoiceReminderEmailDropdown).getText().trim();
        }
        public String getSelectedServiceAgreementEmailTemplateText(){
                return driver.findElement(clickOnServiceAgreementDropdown).getText().trim();
        }
        public String getSelectedMembershipEmailemplateText(){
                return driver.findElement(clickOnMembershipEmailDropdown).getText().trim();
        }
        public String getSelectedFormEmailTemplateText(){
                return driver.findElement(clickOnFormEmailDropdown).getText().trim();
        }

        public void clickProfileIcon() {
                driver.findElement(profileIcon).click();
        }

        public void clickLogout() {
                driver.findElement(logoutButton).click();
        }

        public void createOfficeUser(webData userData) {
                handleHtmlPasswordAlertIfPresent();
                navigateToOfficerUser();
                registrationOfOfficerUser(userData);
                permissionSettingOfOfficerUser();
                notificationOfOfficerUser();
                userPreferenceOfOfficerUser();
                handleLogoutFlow();
        }

        public void verifyCreatedOfficerUserData(webData userData){
                handleHtmlPasswordAlertIfPresent();
                performAssertionToVerifyInputDataOfOfficerUser(userData);
        }

        public void updateOfficerUser(webData userData){
                handleHtmlPasswordAlertIfPresent();
                navigateToOfficerUser();
                clickOnFilterfield(userData.getEmail());
                waitInSeconds(5);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSearchCreatedOfficerUser)).click();
                waitInSeconds(6);
                fillOfficerUserForm(userData);
                selectUpdatedRole();
                selectUpdatedMobileNetProvider();
                permissionSettingOfUpdatedOfficerUser();
                notificationOfOfficerUser();
                userPreferenceOfUpdatedOfficerUser();
                handleLogoutFlow();
        }
        public void verifyUpdatedOfficerUserData(webData userData){
                handleHtmlPasswordAlertIfPresent();
                performAssertionToVerifyUpdatedInputDataOfOfficerUser(userData);

        }

        public void navigateToOfficerUser() {
                waitInSeconds(5);
                wait.until(ExpectedConditions.elementToBeClickable(settingsIcon)).click();
                waitInSeconds(8);
                wait.until(ExpectedConditions.visibilityOfElementLocated(officerUserTab)).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(visibilityOfLoader));
                wait.until(ExpectedConditions.visibilityOfElementLocated(officerUserList));
                waitInSeconds(5);
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

        public void fillOfficerUserForm(webData userData){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnNewPassword)).click();
                passwordNew(userData.getPasswordNew());
                waitInSeconds(2);
                confirmNewPassword(userData.getConfirmPassword());
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSaveButtonForPassword)).click();
                firstName(userData.getFirstName());
                lastName(userData.getLastName());
                phone(userData.getPhone());
                street(userData.getStreet());
                city(userData.getCity());
                state(userData.getState());
                zip(userData.getZip());
                country(userData.getCountry());
        }

        public void registrationOfOfficerUser(webData userData) {
                wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
                waitInSeconds(5);
                newEmail(userData.getEmail());
                fillOfficerUserForm(userData);
                selectRole();
                waitInSeconds(2);
                selectMobileNetProvider();
        }

        public void selectRole(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnRole)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionEditView));
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionEditView)).click();
        }
        public void selectUpdatedRole(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnRole)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionAdmin));
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionAdmin)).click();
        }

        public void selectMobileNetProvider(){
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionOfMobile)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(optionFromDropDownOfMobile));
                wait.until(ExpectedConditions.elementToBeClickable(optionFromDropDownOfMobile)).click();
        }
        public void selectUpdatedMobileNetProvider(){
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionOfMobile)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(updateOptionFromDropDownOfMobile));
                wait.until(ExpectedConditions.elementToBeClickable(updateOptionFromDropDownOfMobile)).click();
        }

        public void permissionSettingOfUpdatedOfficerUser(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(crossDefaultMapSelectgion)).click();
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectCalendarToOpenDropDown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectUpdateOptionFromCalendarDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectUpdateOptionFromCalendarDropdown)).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMapVisibilityDropdown)).click();
                waitInSeconds(3);
                wait.until(ExpectedConditions.elementToBeClickable(clickOndropdownlistToDeSelectVehicle)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOndropdownlistToSelectUpdateVehicle)).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }
        public void permissionSettingOfOfficerUser(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(crossDefaultMapSelectgion)).click();
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectCalendarToOpenDropDown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionFromCalendarDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionFromCalendarDropdown)).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMapVisibilityForVehiclesAllOption)).click();
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMapVisibilityDropdown)).click();
                waitInSeconds(3);
                wait.until(ExpectedConditions.elementToBeClickable(clickOndropdownlistToSelectVehicle)).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }

        public void notificationOfOfficerUser(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnNotificationTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnJobToViewNotificationOptions)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInvoiceToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimatesToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMobileUserToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnContractsToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEquipmentToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInventoryToViewNotificationOption)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnVehiclesToViewNotificationOption)).click();
        }

        public void userPreferenceOfUpdatedOfficerUser(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnUserPreferenceTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnDropDownToSelectRedirectPage)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionFromDropDownForUpdateRedirectPageAfterLogin));
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionFromDropDownForUpdateRedirectPageAfterLogin)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimateDropDown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnEstimatelistToSelectUpdatedTemplate));
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimatelistToSelectUpdatedTemplate)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimateEmailTemplateDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheUpdatedEstimateEmailOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheUpdatedEstimateEmailOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInvoiceEmailTemplateDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheUpdatedInvoiceEmailOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheUpdatedInvoiceEmailOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInvoiceReminderEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheUpdatedInvoiceReminderOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheUpdatedInvoiceReminderOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnServiceAgreementDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectUpdateTheServiceAgreementOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectUpdateTheServiceAgreementOptionFromDropdown)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMembershipEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheUpdatedMembershipEmailOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheUpdatedMembershipEmailOptionFromDropdown)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnFormEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheUpdatedFormEmailOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheUpdatedFormEmailOptionFromDropdown)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSaveButton)).click();
                waitInSeconds(5);
        }

        public void userPreferenceOfOfficerUser(){
                wait.until(ExpectedConditions.elementToBeClickable(clickOnUserPreferenceTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnDropDownToSelectRedirectPage)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionFromDropDownForRedirectPageAfterLogin));
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionFromDropDownForRedirectPageAfterLogin)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimateDropDown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnEstimatelistToSelectTemplate));
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimatelistToSelectTemplate)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnEstimateEmailTemplateDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheEstimateEmailOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheEstimateEmailOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInvoiceEmailTemplateDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheInvoiceEmailOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheInvoiceEmailOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnInvoiceReminderEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheInvoiceReminderOptionFromTheDropdownList));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheInvoiceReminderOptionFromTheDropdownList)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnServiceAgreementDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheServiceAgreementOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheServiceAgreementOptionFromDropdown)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMembershipEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheMembershipEmailOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheMembershipEmailOptionFromDropdown)).click();
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnFormEmailDropdown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectTheFormEmailOptionFromDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectTheFormEmailOptionFromDropdown)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSaveButton)).click();
                waitInSeconds(5);
        }

        public void performAssertionToVerifyInputDataOfOfficerUser(webData officerUser) {
                navigateToOfficerUser();
                clickOnFilterfield(officerUser.getEmail());
                waitInSeconds(5);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSearchCreatedOfficerUser)).click();
                waitInSeconds(6);
                Assert.assertEquals(getSelectedRoleText(), "Edit & View", "Edit & View selection mismatch");
                Assert.assertEquals(getOfficerFirstName(), officerUser.getFirstName(), "Officer firstname mismatch");
                Assert.assertEquals(getOfficerLastName(), officerUser.getLastName(), "Officer lastname mismatch");
                Assert.assertEquals(getOfficerPhoneNumber(), officerUser.getPhone(), "Officer phone Number mismatch");
                Assert.assertEquals(getSelectedMobileProviderText(), "AT&T Mobility (Cingular)", "Mobile provider selection mismatch");
                Assert.assertEquals(getOfficerStreet(), officerUser.getStreet(), "Officer name mismatch");
                Assert.assertEquals(getOfficerCityName(), officerUser.getCity(), "Officer name mismatch");
                Assert.assertEquals(getOfficerStateName(), officerUser.getState(), "Officer name mismatch");
                Assert.assertEquals(getOfficerZipNumber(), officerUser.getZip(), "Officer name mismatch");
                Assert.assertEquals(getOfficerCountryName(), officerUser.getCountry(), "Officer name mismatch");
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedCalendarText(), "Master Schedule", "Calendar selection mismatch");
                Assert.assertEquals(getSelectedVehicleText(), "Usman Flow", "Vehicle selection mismatch");
                wait.until(ExpectedConditions.elementToBeClickable(clickOnUserPreferenceTab)).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedRedirectpathNameAfterLoginText(), "Map", "Map selection mismatch");
                Assert.assertEquals(getSelectedEstimeateTemplateText(), "HVAC Maintenance Proposal Copy", "Estimate is mismatch");
                Assert.assertEquals(getSelectedEmailEstimeateTemplateText(), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceEmailemplateText(), "Invoice For Smoke Testing", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceReminderEmailTemplateText(), "Reminder: Invoice {{InvoiceNumber}} from {{Compan", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedServiceAgreementEmailTemplateText(), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedMembershipEmailemplateText(), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email Email is mismatch");
                Assert.assertEquals(getSelectedFormEmailTemplateText(), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email is mismatch");
        }
        public void performAssertionToVerifyUpdatedInputDataOfOfficerUser(webData updateOfficerUser) {
                navigateToOfficerUser();
                clickOnFilterfield(updateOfficerUser.getEmail());
                waitInSeconds(5);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSearchCreatedOfficerUser)).click();
                waitInSeconds(6);
                Assert.assertEquals(getSelectedRoleText(), "Admin", "Admin selection mismatch");
                Assert.assertEquals(getOfficerFirstName(), updateOfficerUser.getFirstName(), "Officer firstname mismatch");
                Assert.assertEquals(getOfficerLastName(), updateOfficerUser.getLastName(), "Officer lastname mismatch");
                Assert.assertEquals(getOfficerPhoneNumber(), updateOfficerUser.getPhone(), "Officer phone Number mismatch");
                Assert.assertEquals(getSelectedMobileProviderText(), "Cellular One", "Mobile provider selection mismatch");
                Assert.assertEquals(getOfficerStreet(), updateOfficerUser.getStreet(), "Officer name mismatch");
                Assert.assertEquals(getOfficerCityName(), updateOfficerUser.getCity(), "Officer name mismatch");
                Assert.assertEquals(getOfficerStateName(), updateOfficerUser.getState(), "Officer name mismatch");
                Assert.assertEquals(getOfficerZipNumber(), updateOfficerUser.getZip(), "Officer name mismatch");
                Assert.assertEquals(getOfficerCountryName(), updateOfficerUser.getCountry(), "Officer name mismatch");
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedCalendarText(), "Lawn Jobs", "Calendar selection mismatch");
                Assert.assertEquals(getSelectedVehicleText(), "Ken's crew", "Vehicle selection mismatch");
                wait.until(ExpectedConditions.elementToBeClickable(clickOnUserPreferenceTab)).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedRedirectpathNameAfterLoginText(), "Customer", "Customer selection mismatch");
                Assert.assertEquals(getSelectedEstimeateTemplateText(), "Planned Maintenance Agreement", "Estimate is mismatch");
                Assert.assertEquals(getSelectedEmailEstimeateTemplateText(), "Company Default", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceEmailemplateText(), "Invoice {{InvoiceNumber}} from {{CompanyName}}", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceReminderEmailTemplateText(), "Company Default", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedServiceAgreementEmailTemplateText(), "Company Default", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedMembershipEmailemplateText(), "Company Default", "Form Email Email is mismatch");
                Assert.assertEquals(getSelectedFormEmailTemplateText(), "Company Default", "Form Email is mismatch");
        }
        public void handleLogoutFlow() {
                WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon));
                Assert.assertTrue(profile.isDisplayed(), "Login was not successful. Profile icon not found.");
                clickProfileIcon();
                clickLogout();
        }

        private void waitInSeconds(int seconds) {
                try {
                        Thread.sleep(seconds * 1000L);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}
