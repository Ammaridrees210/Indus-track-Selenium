package org.automation.pages;

import org.data.webData;
import org.openqa.selenium.By;
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
        private final CommonPage common;



        public String clickOnPremissionTab = "div[id='mat-tab-label-1-1'] div[class='mat-tab-label-content']";
        public String crossDefaultMapSelection = "i[title=\"Delete\"]";
        public String clickOnSelectCalendarToOpenDropDown = "[formcontrolname=\"schedulers\"]";
        public String selectOptionFromCalendarDropdown = "mat-option:nth-child(5) mat-pseudo-checkbox:nth-child(1)");
        public String selectUpdateOptionFromCalendarDropdown = "mat-option:nth-child(4) mat-pseudo-checkbox:nth-child(1)");
        public String outsideElement = "body";
        public String clickOnMapVisibilityForVehiclesAllOption = "mat-checkbox[formcontrolname=\"allowAllVehicleGroups\"] div[class=\"mat-checkbox-inner-container\"]");
        public String clickOnMapVisibilityDropdown = "[formcontrolname=\"vehicleGroups\"]";
        public String clickOnDropDownListToSelectVehicle = "mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)";
        public String clickOnDropDownlistToDeSelectVehicle = "mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)";
        public String clickOnDropDownlistToSelectUpdateVehicle = "mat-option:nth-child(2) mat-pseudo-checkbox:nth-child(1)";

        public String clickOnNotificationTab = "//div[contains(text(),'Notifications')]";
        public String clickOnJobToViewNotificationOptions = "mat-expansion-panel:nth-child(1)";
        public String clickOnJobPutOnHold = ".mat-slide-toggle-thumb";
        public String clickOnRecipient = "div[class=\"mat-select-value ng-tns-c138-55\"] span:nth-child(1)";
        public String selectEmailOfJobOnHold = "mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)";
        public String selectOptionJobOnHoldPopup = "label[for='mat-slide-toggle-2-input'] div[class=\"mat-slide-toggle-thumb-container\"]";
        public String selectOptionJobCompleted = "label[for='mat-slide-toggle-3-input'] div[class='mat-slide-toggle-thumb']";
        public String selectOptionJobCompletedPopup = "label[for='mat-slide-toggle-4-input'] div[class='mat-slide-toggle-thumb']";
        public String clickOnInvoiceToViewNotificationOption = "mat-expansion-panel:nth-child(2)";
        public String selectOptionInvoiceOverDue = "//span[contains(text(),'Overdue Invoices')]//preceding-sibling::div";
        public String selectOptionInvoiceOverDuePopup = "label[for='mat-slide-toggle-6-input'] div[class=\"mat-slide-toggle-thumb-container\"]";
        public String selectOptionInvoicePaid = "//span[contains(text(),'Paid Invoices')]//preceding-sibling::div";
        public String selectOptionInvoicePaidPopup = "label[for='mat-slide-toggle-8-input'] div[class='mat-slide-toggle-thumb']";
        public String clickOnEstimatesToViewNotificationOption = "mat-expansion-panel:nth-child(3)";
        public String clickOnMobileUserToViewNotificationOption = "mat-expansion-panel:nth-child(4)";
        public String clickOnContractsToViewNotificationOption = "mat-expansion-panel:nth-child(5)";
        public String clickOnEquipmentToViewNotificationOption = "mat-expansion-panel:nth-child(6)";
        public String clickOnInventoryToViewNotificationOption = "mat-expansion-panel:nth-child(7)";
        public String clickOnVehiclesToViewNotificationOption = "mat-expansion-panel:nth-child(8)";
        public String clickOnUserPreferenceTab ="//div[contains(text(),'User Preferences')]";
        public String clickOnDropDownToSelectRedirectPage = "[formcontrolname=\"defaultTab\"]";
        public String selectOptionFromDropDownForRedirectPageAfterLogin = "mat-option:nth-child(1) span:nth-child(1)";
        public String selectOptionFromDropDownForUpdateRedirectPageAfterLogin = "mat-option:nth-child(2) span:nth-child(1)";
        public String clickOnEstimateDropDown = "[formcontrolname=\"defaultEstimateTemplateId\"]";
        public String clickOnEstimatelistToSelectTemplate = "mat-option:nth-child(2) span:nth-child(1)";
        public String clickOnEstimatelistToSelectUpdatedTemplate = "mat-option:nth-child(3) span:nth-child(1)";
        public String clickOnEstimateEmailTemplateDropdown = "[formcontrolname=\"defaultEstimateEmailTemplateId\"]";
        public String selectTheEstimateEmailOptionFromTheDropdownList = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectTheUpdatedEstimateEmailOptionFromTheDropdownList = "mat-option:nth-child(1) span:nth-child(1)";
        public String clickOnInvoiceEmailTemplateDropdown = "[formcontrolname=\"defaultInvoiceEmailTemplateId\"]";
        public String selectTheInvoiceEmailOptionFromTheDropdownList = "mat-option:nth-child(3) span:nth-child(1)";
        public String selectTheUpdatedInvoiceEmailOptionFromTheDropdownList = "mat-option:nth-child(2) span:nth-child(1)";
        public String clickOnInvoiceReminderEmailDropdown = "[formcontrolname=\"defaultInvoiceReminderEmailTemplateId\"]";
        public String selectTheInvoiceReminderOptionFromTheDropdownList = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectTheUpdatedInvoiceReminderOptionFromTheDropdownList = "mat-option:nth-child(1) span:nth-child(1)";
        public String clickOnServiceAgreementDropdown = "[formcontrolname=\"defaultServiceAgreementEmailTemplateId\"]";
        public String selectTheServiceAgreementOptionFromDropdown = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectUpdateTheServiceAgreementOptionFromDropdown = "mat-option:nth-child(1) span:nth-child(1)";
        public String clickOnMembershipEmailDropdown = "[formcontrolname=\"defaultMembershipEmailTemplateId\"]";
        public String selectTheMembershipEmailOptionFromDropdown = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectTheUpdatedMembershipEmailOptionFromDropdown = "mat-option:nth-child(1) span:nth-child(1)";
        public String clickOnFormEmailDropdown = "[formcontrolname=\"defaultFormEmailTemplateId\"]";
        public String selectTheFormEmailOptionFromDropdown = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectTheUpdatedFormEmailOptionFromDropdown = "mat-option:nth-child(1) span:nth-child(1)";
        public String clickOnSaveButton = "mat-dialog-actions button:nth-child(2)";

        // Constructor
        public OfficerPage(WebDriver driver) {
                this.driver = driver;
                this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                this.common = new CommonPage(driver);
        }

        public void newEmail(String email) {
                driver.findElement(officerUserEmail).sendKeys(email);
        }

        public void passwordNew(String passwordNew) {
                driver.findElement(officerNewPassword).sendKeys(passwordNew);
        }

        public void confirmNewPassword(String confirmPassword) {
                driver.findElement(confirmPasswordNew).sendKeys(confirmPassword);
        }

        public void firstName(String firstName) {
                driver.findElement(firstNameOfOfficerUser).clear();
                driver.findElement(firstNameOfOfficerUser).sendKeys(firstName);
        }

        public void lastName(String lastName) {
                driver.findElement(lastNameOfOfficerUser).clear();
                driver.findElement(lastNameOfOfficerUser).sendKeys(lastName);
        }

        public void phone(String phone) {
                driver.findElement(phoneNumberOfOfficerUser).clear();
                driver.findElement(phoneNumberOfOfficerUser).sendKeys(phone);
        }

        public void street(String street) {
                driver.findElement(streetOfOfficerUser).clear();
                driver.findElement(streetOfOfficerUser).sendKeys(street);
        }

        public void city(String city) {
                driver.findElement(cityNameOfOfficerUser).clear();
                driver.findElement(cityNameOfOfficerUser).sendKeys(city);
        }

        public void state(String state) {
                driver.findElement(stateOfOfficerUser).clear();
                driver.findElement(stateOfOfficerUser).sendKeys(state);
        }

        public void zip(String zip) {
                driver.findElement(zipCodeOfficerUser).clear();
                driver.findElement(zipCodeOfficerUser).sendKeys(zip);
        }

        public void country(String country) {
                driver.findElement(countryOfficerUser).clear();
                driver.findElement(countryOfficerUser).sendKeys(country);
        }

        public void clickOutsideDropdown() {
                driver.findElement(outsideElement).click();
        }

        public void clickOnFilterfield(String email) {
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
                return driver.findElement(phoneNumberOfOfficerUser).getAttribute("value");
        }

        public String getSelectedMobileProviderText() {
                return driver.findElement(selectOptionOfMobile).getText().trim();
        }

        public String getOfficerStreet() {
                return driver.findElement(streetOfOfficerUser).getAttribute("value");
        }

        public String getOfficerCityName() {
                return driver.findElement(cityNameOfOfficerUser).getAttribute("value");
        }

        public String getOfficerStateName() {
                return driver.findElement(stateOfOfficerUser).getAttribute("value");
        }

        public String getOfficerZipNumber() {
                return driver.findElement(zipCodeOfficerUser).getAttribute("value");
        }

        public String getOfficerCountryName() {
                return driver.findElement(countryOfficerUser).getAttribute("value");
        }

        public String getSelectedCalendarText() {
                return driver.findElement(clickOnSelectCalendarToOpenDropDown).getText().trim();
        }

        public String getSelectedVehicleText() {
                return driver.findElement(clickOnMapVisibilityDropdown).getText().trim();
        }

        public String getSelectedRedirectpathNameAfterLoginText() {
                return driver.findElement(clickOnDropDownToSelectRedirectPage).getText().trim();
        }

        public String getSelectedEstimeateTemplateText() {
                return driver.findElement(clickOnEstimateDropDown).getText().trim();
        }

        public String getSelectedEmailEstimeateTemplateText() {
                return driver.findElement(clickOnEstimateEmailTemplateDropdown).getText().trim();
        }

        public String getSelectedInvoiceEmailemplateText() {
                return driver.findElement(clickOnInvoiceEmailTemplateDropdown).getText().trim();
        }

        public String getSelectedInvoiceReminderEmailTemplateText() {
                return driver.findElement(clickOnInvoiceReminderEmailDropdown).getText().trim();
        }

        public String getSelectedServiceAgreementEmailTemplateText() {
                return driver.findElement(clickOnServiceAgreementDropdown).getText().trim();
        }

        public String getSelectedMembershipEmailemplateText() {
                return driver.findElement(clickOnMembershipEmailDropdown).getText().trim();
        }

        public String getSelectedFormEmailTemplateText() {
                return driver.findElement(clickOnFormEmailDropdown).getText().trim();
        }

        public void clickProfileIcon() {
                driver.findElement(profileIcon).click();
        }

        public void clickLogout() {
                driver.findElement(logoutButton).click();
        }

        public void createOfficeUser(webData userData) {
                navigateToOfficerUser();
                registrationOfOfficerUser(userData);
                permissionSettingOfOfficerUser();
                notificationOfOfficerUser();
                userPreferenceOfOfficerUser();
                handleLogoutFlow();
        }

        public void verifyCreatedOfficerUserData(webData userData) {
                performAssertionToVerifyInputDataOfOfficerUser(userData);
        }

        public void updateOfficerUser(webData userData) {
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

        public void verifyUpdatedOfficerUserData(webData userData) {
                performAssertionToVerifyUpdatedInputDataOfOfficerUser(userData);

        }

        public void navigateToOfficerUser() {
                waitInSeconds(5);
                wait.until(ExpectedConditions.elementToBeClickable(settingsIcon)).click();
                waitInSeconds(10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(officerUserTab)).click();
                wait.until(ExpectedConditions.invisibilityOfElementLocated(visibilityOfLoader));
                wait.until(ExpectedConditions.visibilityOfElementLocated(officerUserList));
                waitInSeconds(5);
        }

        public void fillOfficerUserForm(webData userData) {
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

        public void selectRole() {
                wait.until(ExpectedConditions.elementToBeClickable(clickOnRole)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionEditView));
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionEditView)).click();
        }

        public void selectUpdatedRole() {
                wait.until(ExpectedConditions.elementToBeClickable(clickOnRole)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectOptionAdmin));
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionAdmin)).click();
        }

        public void selectMobileNetProvider() {
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionOfMobile)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(optionFromDropDownOfMobile));
                wait.until(ExpectedConditions.elementToBeClickable(optionFromDropDownOfMobile)).click();
        }

        public void selectUpdatedMobileNetProvider() {
                wait.until(ExpectedConditions.elementToBeClickable(selectOptionOfMobile)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(updateOptionFromDropDownOfMobile));
                wait.until(ExpectedConditions.elementToBeClickable(updateOptionFromDropDownOfMobile)).click();
        }

        public void permissionSettingOfUpdatedOfficerUser() {
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(crossDefaultMapSelection)).click();
                waitInSeconds(2);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectCalendarToOpenDropDown)).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(selectUpdateOptionFromCalendarDropdown));
                wait.until(ExpectedConditions.elementToBeClickable(selectUpdateOptionFromCalendarDropdown)).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnMapVisibilityDropdown)).click();
                waitInSeconds(3);
                wait.until(ExpectedConditions.elementToBeClickable(clickOnDropDownlistToDeSelectVehicle)).click();
                wait.until(ExpectedConditions.elementToBeClickable(clickOnDropDownlistToSelectUpdateVehicle)).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }

        public void permissionSettingOfOfficerUser() {
                wait.until(ExpectedConditions.elementToBeClickable(clickOnPremissionTab)).click();
                wait.until(ExpectedConditions.elementToBeClickable(crossDefaultMapSelection)).click();
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
                wait.until(ExpectedConditions.elementToBeClickable(clickOnDropDownListToSelectVehicle)).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }

        public void notificationOfOfficerUser() {
                common.waitForElementClickableByXpath(clickOnNotificationTab).click();
                common.waitForElementClickableByCss(clickOnJobToViewNotificationOptions).click();
                // wait.until(ExpectedConditions.elementToBeClickable(clickOnJobPutOnHold)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(clickOnRecipient)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectEmailOfJobOnHold)).click();
                // clickOutsideDropdown();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionJobOnHoldPopup)).click();
                // waitInSeconds(2);
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionJobCompleted)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionJobCompletedPopup)).click();
                // waitInSeconds(5);

                common.waitForElementClickableByCss(clickOnInvoiceToViewNotificationOption).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionInvoiceOverDue)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionInvoiceOverDuePopup)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionInvoicePaid)).click();
                // wait.until(ExpectedConditions.elementToBeClickable(selectOptionInvoicePaidPopup)).click();

                common.waitForElementClickableByCss(clickOnEstimatesToViewNotificationOption).click();
                common.waitForElementClickableByCss(clickOnMobileUserToViewNotificationOption).click();
                common.waitForElementClickableByCss(clickOnContractsToViewNotificationOption).click();
                common.waitForElementClickableByCss(clickOnEquipmentToViewNotificationOption).click();
                common.waitForElementClickableByCss(clickOnInventoryToViewNotificationOption).click();
                common.waitForElementClickableByCss(clickOnVehiclesToViewNotificationOption).click();
        }

        public void userPreferenceOfUpdatedOfficerUser() {
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
                common.waitForElementVisibleByCss(clickOnDropDownToSelectRedirectPage).click();
                common.waitForElementVisibleByCss(selectOptionFromDropDownForUpdateRedirectPageAfterLogin);
                common.waitForElementVisibleByCss(selectOptionFromDropDownForUpdateRedirectPageAfterLogin).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnEstimateDropDown).click();
                common.waitForElementVisibleByCss(clickOnEstimatelistToSelectUpdatedTemplate);
                common.waitForElementVisibleByCss(clickOnEstimatelistToSelectUpdatedTemplate).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnEstimateEmailTemplateDropdown).click();
                common.waitForElementVisibleByCss(selectTheUpdatedEstimateEmailOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheUpdatedEstimateEmailOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnInvoiceEmailTemplateDropdown).click();
                common.waitForElementVisibleByCss(selectTheUpdatedInvoiceEmailOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheUpdatedInvoiceEmailOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnInvoiceReminderEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheUpdatedInvoiceReminderOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheUpdatedInvoiceReminderOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnServiceAgreementDropdown).click();
                common.waitForElementVisibleByCss(selectUpdateTheServiceAgreementOptionFromDropdown);
                common.waitForElementVisibleByCss(selectUpdateTheServiceAgreementOptionFromDropdown).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnMembershipEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheUpdatedMembershipEmailOptionFromDropdown);
                common.waitForElementVisibleByCss(selectTheUpdatedMembershipEmailOptionFromDropdown).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnFormEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheUpdatedFormEmailOptionFromDropdown);
                common.waitForElementVisibleByCss(selectTheUpdatedFormEmailOptionFromDropdown).click();
                common.waitForElementVisibleByCss(clickOnSaveButton).click();
                waitInSeconds(5);
        }

        public void userPreferenceOfOfficerUser() {
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
                common.waitForElementClickableByCss(clickOnDropDownToSelectRedirectPage).click();
                common.waitForElementVisibleByCss(selectOptionFromDropDownForRedirectPageAfterLogin);
                common.waitForElementVisibleByCss(selectOptionFromDropDownForRedirectPageAfterLogin).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnEstimateDropDown).click();
                common.waitForElementVisibleByCss(clickOnEstimatelistToSelectTemplate);
                common.waitForElementVisibleByCss(clickOnEstimatelistToSelectTemplate).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnEstimateEmailTemplateDropdown).click();
                common.waitForElementVisibleByCss(selectTheEstimateEmailOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheEstimateEmailOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnInvoiceEmailTemplateDropdown).click();
                common.waitForElementVisibleByCss(selectTheInvoiceEmailOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheInvoiceEmailOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnInvoiceReminderEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheInvoiceReminderOptionFromTheDropdownList);
                common.waitForElementVisibleByCss(selectTheInvoiceReminderOptionFromTheDropdownList).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnServiceAgreementDropdown).click();
                common.waitForElementVisibleByCss(selectTheServiceAgreementOptionFromDropdown);
                common.waitForElementVisibleByCss(selectTheServiceAgreementOptionFromDropdown).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnMembershipEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheMembershipEmailOptionFromDropdown);
                common.waitForElementVisibleByCss(selectTheMembershipEmailOptionFromDropdown).click();
                clickOutsideDropdown();
                common.waitForElementVisibleByCss(clickOnFormEmailDropdown).click();
                common.waitForElementVisibleByCss(selectTheFormEmailOptionFromDropdown);
                common.waitForElementVisibleByCss(selectTheFormEmailOptionFromDropdown).click();
                common.waitForElementVisibleByCss(clickOnSaveButton).click();
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
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
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
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedRedirectpathNameAfterLoginText(), "Customer", "Customer selection mismatch");
                Assert.assertEquals(getSelectedEstimeateTemplateText(), "Planned Maintenance Agreement", "Estimate is mismatch");
                Assert.assertEquals(getSelectedEmailEstimeateTemplateText(), "Company Default", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceEmailemplateText(), "Invoice {{InvoiceNumber}} from {{CompanyName}}", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedInvoiceReminderEmailTemplateText(), "Company Default", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedServiceAgreementEmailTemplateText(), "Company Default", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedMembershipEmailemplateText(), "Company Default", "Form Email is mismatch");
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