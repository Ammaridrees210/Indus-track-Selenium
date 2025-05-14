package org.automation.pages;

import org.data.webData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class OfficerPage {
        private final WebDriver driver;
        private final CommonPage common;

        public String streetOfOfficerUser = "[placeholder='Street']";
        public String cityNameOfOfficerUser = "[placeholder='City']";
        public String stateOfOfficerUser = "[placeholder='State']";
        public String zipCodeOfficerUser = "[placeholder='ZIP']";
        public String countryOfficerUser = "[placeholder='Country']";
        public String settingsIcon = ".topMenuSettings";
        public String officerUserTab = "ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)";
        public String visibilityOfLoader = ".sk-circle12";
        public String officerUserList = ".btn.btn-default.clearfilter";
        public String addNewButton = "button[class='btn btn-primary btn-sm m-l-sm m-r-sm']";
        public String officerUserEmail = "input[placeholder='Please Enter your email']";
        public String clickOnNewPassword = "div[class='col-sm-8'] a";
        public String officerNewPassword = "[name=\'pwd\']";
        public String confirmPasswordNew = "[name=\'repwd\']";
        public String clickOnSaveButtonForPassword = ".mat-focus-indicator.btn.btn-info.mat-button.mat-button-base._mat-animation-noopable";
        public String clickOnRole = "[formcontrolname=\"role\"]";
        public String selectOptionViewOnly = "mat-option:nth-child(1) span:nth-child(1)";
        public String selectOptionEditView = "mat-option:nth-child(2) span:nth-child(1)";
        public String selectOptionAdmin = "mat-option:nth-child(3) span:nth-child(1)";
        public String selectOptionCustomize = "mat-option:nth-child(4) span:nth-child(1)";
        public String firstNameOfOfficerUser = "[formcontrolname='firstName']";
        public String lastNameOfOfficerUser = "[formcontrolname='lastName']";
        public String phoneNumberOfOfficerUser = "[formcontrolname='phone']";
        public String selectOptionOfMobile = "[formcontrolname=\"mobileProvider\"]";
        public String OptionFromDropDownOfMobileViewOnly = "mat-option:nth-child(2) span:nth-child(1)";
        public String OptionFromDropDownOfMobileEditView = "mat-option:nth-child(3) span:nth-child(1)";
        public String OptionFromDropDownOfMobileAdmin = "mat-option:nth-child(4) span:nth-child(1)";
        public String OptionFromDropDownOfMobileCustomize = "mat-option:nth-child(5) span:nth-child(1)";
        public String clickOnPremissionTab = "div[id='mat-tab-label-1-1'] div[class='mat-tab-label-content']";
        public String crossDefaultMapSelection = "i[title=\"Delete\"]";
        public String clickOnSelectCalendarToOpenDropDown = "[formcontrolname=\"schedulers\"]";
        public String selectOptionFromCalendarDropdownForViewOnly = "mat-option:nth-child(1) mat-pseudo-checkbox:nth-child(1)";
        public String selectOptionFromCalendarDropdownForEditView = "mat-option:nth-child(2) mat-pseudo-checkbox:nth-child(1)";
        public String selectOptionFromCalendarDropdownForAdmin = "mat-option:nth-child(4) mat-pseudo-checkbox:nth-child(1)";
        public String selectOptionFromCalendarDropdownForCustomize = "mat-option:nth-child(5) mat-pseudo-checkbox:nth-child(1)";
        public String outsideElement = "body";
        public String clickOnMapVisibilityForVehiclesAllOption = "mat-checkbox[formcontrolname=\"allowAllVehicleGroups\"] div[class=\"mat-checkbox-inner-container\"]";
        public String clickOnMapVisibilityDropdown = "[formcontrolname=\"vehicleGroups\"]";
        public String clickOnDropDownListToSelectVehicle = "mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)";
        public String clickOnNotificationTab = "//div[contains(text(),'Notifications')]";
        public String clickOnJobToViewNotificationOptions = "mat-expansion-panel:nth-child(1)";
        public String clickOnInvoiceToViewNotificationOption = "mat-expansion-panel:nth-child(2)";
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
        public String SearchOfficerUser = "//input[@class='form-control ng-untouched ng-pristine ng-valid']";
        public String clickOnSearchCreatedOfficerUser = "tbody tr:nth-child(1) td:nth-child(2)";
        public String profileIcon = ".dropdown .fa-user-circle";
        public String logoutButton = "a[title='LogOut']";
        public String clickOnEnableButton = "button[class='btn btn-primary pull-right']";
        public String jobTogleSelectors = "mat-accordion mat-expansion-panel:nth-child(1) mat-slide-toggle";
        public String invoiceTogleSelector = "mat-accordion mat-expansion-panel:nth-child(2) mat-slide-toggle";
        public String invoiceReinderTogleSelector = "mat-accordion mat-expansion-panel:nth-child(2) input";
        public String estimateTogleSelector = "mat-accordion mat-expansion-panel:nth-child(3) mat-slide-toggle";
        public String mobileUserTogleSelector = "mat-accordion mat-expansion-panel:nth-child(4) mat-slide-toggle";
        public String contractsTogleSelector = "mat-accordion mat-expansion-panel:nth-child(5) mat-slide-toggle";
        public String contractReminderDays = "mat-accordion mat-expansion-panel:nth-child(5) input";
        public String equipmentTogleSelector = "mat-accordion mat-expansion-panel:nth-child(6) mat-slide-toggle";
        public String equipmentReminderDays = "mat-accordion mat-expansion-panel:nth-child(6) input";
        public String inventoryTogleSelector = "mat-accordion mat-expansion-panel:nth-child(7) mat-slide-toggle";
        public String vehiclesTogleSelector = "mat-accordion mat-expansion-panel:nth-child(8) mat-slide-toggle";
        public String vehicleReminderDays = "mat-accordion mat-expansion-panel:nth-child(8) input";

        // Constructor
        public OfficerPage(WebDriver driver) {
                this.driver = driver;
                this.common = new CommonPage(driver);
        }

        public void newEmail(String email) {
                common.findElementByCss(officerUserEmail).sendKeys(email);
        }

        public void passwordNew(String passwordNew) {
                common.findElementByCss(officerNewPassword).sendKeys(passwordNew);
        }

        public void confirmNewPassword(String confirmPassword) {
                common.findElementByCss(confirmPasswordNew).sendKeys(confirmPassword);
        }

        public void firstName(String firstName) {
                common.findElementByCss(firstNameOfOfficerUser).clear();
                common.findElementByCss(firstNameOfOfficerUser).sendKeys(firstName);
        }

        public void lastName(String lastName) {
                common.findElementByCss(lastNameOfOfficerUser).clear();
                common.findElementByCss(lastNameOfOfficerUser).sendKeys(lastName);
        }

        public void phone(String phone) {
                common.findElementByCss(phoneNumberOfOfficerUser).clear();
                common.findElementByCss(phoneNumberOfOfficerUser).sendKeys(phone);
        }

        public void street(String street) {
                common.findElementByCss(streetOfOfficerUser).clear();
                common.findElementByCss(streetOfOfficerUser).sendKeys(street);
        }

        public void city(String city) {
               common.findElementByCss(cityNameOfOfficerUser).clear();
                common.findElementByCss(cityNameOfOfficerUser).sendKeys(city);
        }

        public void state(String state) {
                common.findElementByCss(stateOfOfficerUser).clear();
                common.findElementByCss(stateOfOfficerUser).sendKeys(state);
        }

        public void zip(String zip) {
                common.findElementByCss(zipCodeOfficerUser).clear();
                common.findElementByCss(zipCodeOfficerUser).sendKeys(zip);
        }

        public void country(String country) {
                common.findElementByCss(countryOfficerUser).clear();
                common.findElementByCss(countryOfficerUser).sendKeys(country);
        }

        public void clickOutsideDropdown() {
                common.findElementByCss(outsideElement).click();
        }

        public void clickOnFilterfield(String email) {
                common.waitForElementClickableByXpath(SearchOfficerUser).sendKeys(email);
        }

        public String getSearchedEmailText() {
                return common.findElementByCss(clickOnSearchCreatedOfficerUser).getText().trim();
        }

        public String getOfficerAttributeValue(String cssSelector) {
                return common.findElementByCss(cssSelector).getAttribute("value");
        }

        public String getSelectedDropdownText(String cssSelector) {
                return common.findElementByCss(cssSelector).getText().trim();
        }

        public void clickProfileIcon() {
                common.findElementByCss(profileIcon).click();
        }

        public void clickLogout() {
                common.findElementByCss(logoutButton).click();
        }


        public void createOfficeUser(String role, webData userData) {
                navigateToOfficerUser();
                AddNewOfficerUser();
                fillOfficerUserForm(userData);
                waitInSeconds(2);
                if (role.equalsIgnoreCase ("ViewOnly")) {
                        selectRoleViewOnly();
                        selectMobileNetProviderForViewOnly();
                        permissionSettingOfficerUserForViewOnly();
                        notificationOfOfficerUser();
                        userPreferenceOfOfficerUser();

                } else if (role.equalsIgnoreCase("EditView")) {
                        selectRoleEditView();
                        selectMobileNetProviderForEditView();
                        permissionSettingOfficerUserForEditView();
                        notificationOfOfficerUser();
                        userPreferenceOfOfficerUser();

                } else if (role.equalsIgnoreCase("Admin")) {
                        selectRoleAdmin();
                        selectMobileNetProviderForAdmin();
                        permissionSettingOfficerUserForAdmin();
                        notificationOfOfficerUser();
                        userPreferenceOfOfficerUser();

                } else if (role.equalsIgnoreCase("Customize")) {
                        selectRoleCustomize();
                        selectMobileNetProviderForAdmin();
                        selectMobileNetProviderForCustomize();
                        permissionSettingOfficerUserForCustomize();
                        notificationOfOfficerUser();
                        userPreferenceOfCustomizeOfficerUser();
                }

                logoutFlow();
        }

        public void verifyViewOnlyCreatedOfficerUserData(webData officerUserViewOnly) {
                navigateToOfficerUser();
                clickOnFilterfield(officerUserViewOnly.getEmail());
                Assert.assertEquals(getSearchedEmailText(), "hamza@gmail.com", "Searched Email mismatch");
                logoutFlow();

        }

        public void verifyEditViewCreatedOfficerUserData(webData officerUserEditView) {
                navigateToOfficerUser();
                clickOnFilterfield(officerUserEditView.getEmail());
                Assert.assertEquals(getSearchedEmailText(), "hamzakh@gmail.com", "Searched Email mismatch");
                logoutFlow();

        }

        public void verifyAdminCreatedOfficerUserData(webData officerUserAdmin) {
                performAssertionToVerifyAdminInputDataOfOfficerUser(officerUserAdmin);
                logoutFlow();
        }

        public void verifyCustomizeCreatedOfficerUserData(webData OfficerUserCustomize) {
                performAssertionToVerifyCustomizeInputDataOfOfficerUser(OfficerUserCustomize);
                logoutFlow();
        }

        public void navigateToOfficerUser() {
                waitInSeconds(5);
                common.waitForElementClickableByCss(settingsIcon).click();
                waitInSeconds(10);
                common.waitForElementVisibleByCss(officerUserTab).click();
                common.waitForElementVisibleByCss(visibilityOfLoader);
                common.waitForElementVisibleByCss(officerUserList);
                waitInSeconds(5);
        }

        public void fillOfficerUserForm(webData userData) {
                newEmail(userData.getEmail());
                common.waitForElementClickableByCss(clickOnNewPassword).click();
                passwordNew(userData.getPasswordNew());
                waitInSeconds(2);
                confirmNewPassword(userData.getConfirmPassword());
                common.waitForElementClickableByCss(clickOnSaveButtonForPassword).click();
                firstName(userData.getFirstName());
                lastName(userData.getLastName());
                phone(userData.getPhone());
                street(userData.getStreet());
                city(userData.getCity());
                state(userData.getState());
                zip(userData.getZip());
                country(userData.getCountry());
        }

        public void AddNewOfficerUser() {
                common.waitForElementClickableByCss(addNewButton).click();
                waitInSeconds(5);
        }

        public void selectRoleViewOnly() {
                common.waitForElementClickableByCss(clickOnRole).click();
                common.waitForElementVisibleByCss(selectOptionViewOnly);
                waitInSeconds(2);
                common.waitForElementClickableByCss(selectOptionViewOnly).click();
        }
        public void selectRoleEditView() {
                common.waitForElementClickableByCss(clickOnRole).click();
                common.waitForElementVisibleByCss(selectOptionEditView);
                waitInSeconds(2);
                common.waitForElementClickableByCss(selectOptionEditView).click();
        }
        public void selectRoleAdmin() {
                common.waitForElementClickableByCss(clickOnRole).click();
                common.waitForElementVisibleByCss(selectOptionAdmin);
                waitInSeconds(2);
                common.waitForElementClickableByCss(selectOptionAdmin).click();
        }
        public void selectRoleCustomize() {
                common.waitForElementClickableByCss(clickOnRole).click();
                common.waitForElementVisibleByCss(selectOptionCustomize);
                waitInSeconds(2);
                common.waitForElementClickableByCss(selectOptionCustomize).click();
        }

        public void selectMobileNetProviderForViewOnly() {
                common.waitForElementClickableByCss(selectOptionOfMobile).click();
                common.waitForElementVisibleByCss(OptionFromDropDownOfMobileViewOnly);
                common.waitForElementClickableByCss(OptionFromDropDownOfMobileViewOnly).click();
        }

        public void selectMobileNetProviderForEditView() {
                common.waitForElementClickableByCss(selectOptionOfMobile).click();
                common.waitForElementVisibleByCss(OptionFromDropDownOfMobileEditView);
                common.waitForElementClickableByCss(OptionFromDropDownOfMobileEditView).click();
        }

        public void selectMobileNetProviderForAdmin() {
                common.waitForElementClickableByCss(selectOptionOfMobile).click();
                common.waitForElementVisibleByCss(OptionFromDropDownOfMobileAdmin);
                common.waitForElementClickableByCss(OptionFromDropDownOfMobileAdmin).click();
        }

        public void selectMobileNetProviderForCustomize() {
                common.waitForElementClickableByCss(selectOptionOfMobile).click();
                common.waitForElementVisibleByCss(OptionFromDropDownOfMobileCustomize);
                common.waitForElementClickableByCss(OptionFromDropDownOfMobileCustomize).click();
        }

        public void permissionSettingOfficerUserForViewOnly() {
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                common.waitForElementClickableByCss(crossDefaultMapSelection).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnSelectCalendarToOpenDropDown).click();
                common.waitForElementVisibleByCss(selectOptionFromCalendarDropdownForViewOnly);
                common.waitForElementClickableByCss(selectOptionFromCalendarDropdownForViewOnly).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                common.waitForElementClickableByCss(clickOnMapVisibilityForVehiclesAllOption).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnMapVisibilityDropdown).click();
                waitInSeconds(3);
                common.waitForElementClickableByCss(clickOnDropDownListToSelectVehicle).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }

        public void permissionSettingOfficerUserForEditView() {
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                common.waitForElementClickableByCss(crossDefaultMapSelection).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnSelectCalendarToOpenDropDown).click();
                common.waitForElementVisibleByCss(selectOptionFromCalendarDropdownForEditView);
                common.waitForElementClickableByCss(selectOptionFromCalendarDropdownForEditView).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                common.waitForElementClickableByCss(clickOnMapVisibilityForVehiclesAllOption).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnMapVisibilityDropdown).click();
                waitInSeconds(3);
                common.waitForElementClickableByCss(clickOnDropDownListToSelectVehicle).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }

        public void permissionSettingOfficerUserForAdmin() {
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                common.waitForElementClickableByCss(crossDefaultMapSelection).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnSelectCalendarToOpenDropDown).click();
                common.waitForElementVisibleByCss(selectOptionFromCalendarDropdownForAdmin);
                common.waitForElementClickableByCss(selectOptionFromCalendarDropdownForAdmin).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                common.waitForElementClickableByCss(clickOnMapVisibilityForVehiclesAllOption).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnMapVisibilityDropdown).click();
                waitInSeconds(3);
                common.waitForElementClickableByCss(clickOnDropDownListToSelectVehicle).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }
        public void permissionSettingOfficerUserForCustomize() {
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                common.waitForElementClickableByCss(clickOnEnableButton).click();
                common.waitForElementClickableByCss(crossDefaultMapSelection).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnSelectCalendarToOpenDropDown).click();
                common.waitForElementVisibleByCss(selectOptionFromCalendarDropdownForCustomize);
                common.waitForElementClickableByCss(selectOptionFromCalendarDropdownForCustomize).click();
                waitInSeconds(2);
                clickOutsideDropdown();
                common.waitForElementClickableByCss(clickOnMapVisibilityForVehiclesAllOption).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnMapVisibilityDropdown).click();
                waitInSeconds(3);
                common.waitForElementClickableByCss(clickOnDropDownListToSelectVehicle).click();
                clickOutsideDropdown();
                waitInSeconds(3);
        }


        public void notificationOfOfficerUser() {
                common.waitForElementClickableByXpath(clickOnNotificationTab).click();
                common.waitForElementClickableByCss(clickOnJobToViewNotificationOptions).click();
                List<WebElement> SelectJobTogles = driver.findElements(By.cssSelector(jobTogleSelectors));
                WebElement jobFirstElement = SelectJobTogles.get(0);
                jobFirstElement.click();
                WebElement jobSecondElement = SelectJobTogles.get(1);
                jobSecondElement.click();
                WebElement jobThirdElement = SelectJobTogles.get(2);
                jobThirdElement.click();
                WebElement jobForthElement = SelectJobTogles.get(3);
                jobForthElement.click();

                common.waitForElementClickableByCss(clickOnInvoiceToViewNotificationOption).click();
                List<WebElement> SelectInvoiceTogles = driver.findElements(By.cssSelector(invoiceTogleSelector));
                WebElement invoiceFirstElement = SelectInvoiceTogles.get(0);
                invoiceFirstElement.click();
                WebElement invoiceSecondElement = SelectInvoiceTogles.get(1);
                invoiceSecondElement.click();
                WebElement invoiceThirdElement = SelectInvoiceTogles.get(2);
                invoiceThirdElement.click();
                WebElement invoiceForthElement = SelectInvoiceTogles.get(3);
                invoiceForthElement.click();
                List<WebElement> SelectInvoiceReminderDateInput = driver.findElements(By.cssSelector(invoiceReinderTogleSelector));
                WebElement overdueInvoicesReminderDate = SelectInvoiceReminderDateInput.get(1);
                overdueInvoicesReminderDate.clear();
                overdueInvoicesReminderDate.sendKeys("1");

                common.waitForElementClickableByCss(clickOnEstimatesToViewNotificationOption).click();
                List<WebElement> SelectEstimateTogles = driver.findElements(By.cssSelector(estimateTogleSelector));
                WebElement estimateFirstElement = SelectEstimateTogles.get(0);
                estimateFirstElement.click();
                WebElement estimateSecondElement = SelectEstimateTogles.get(1);
                estimateSecondElement.click();
                WebElement estimateThirdElement = SelectEstimateTogles.get(2);
                estimateThirdElement.click();
                WebElement estimateForthElement = SelectEstimateTogles.get(3);
                estimateForthElement.click();
                WebElement estimateFifthElement = SelectEstimateTogles.get(4);
                estimateFifthElement.click();
                WebElement estimateSixthElement = SelectEstimateTogles.get(5);
                estimateSixthElement.click();

                common.waitForElementClickableByCss(clickOnMobileUserToViewNotificationOption).click();
                List<WebElement> SelectMobileUserTogles = driver.findElements(By.cssSelector(mobileUserTogleSelector));
                WebElement mobileFirstElement = SelectMobileUserTogles.get(0);
                mobileFirstElement.click();
                WebElement mobileSecondElement = SelectMobileUserTogles.get(1);
                mobileSecondElement.click();
                WebElement mobileThirdElement = SelectMobileUserTogles.get(2);
                mobileThirdElement.click();
                WebElement mobileForthElement = SelectMobileUserTogles.get(3);
                mobileForthElement.click();
                WebElement mobileFifthElement = SelectMobileUserTogles.get(4);
                mobileFifthElement.click();
                WebElement mobileSixthElement = SelectMobileUserTogles.get(5);
                mobileSixthElement.click();
                WebElement mobileSeventhElement = SelectMobileUserTogles.get(6);
                mobileSeventhElement.click();
                WebElement mobileEighthElement = SelectMobileUserTogles.get(7);
                mobileEighthElement.click();


                common.waitForElementClickableByCss(clickOnContractsToViewNotificationOption).click();
                List<WebElement> SelectContractsTogles = driver.findElements(By.cssSelector(contractsTogleSelector));
                WebElement contractsFirstElement = SelectContractsTogles.get(0);
                contractsFirstElement.click();
                WebElement contractsSecondElement = SelectContractsTogles.get(1);
                contractsSecondElement.click();
                WebElement contractsThirdElement = SelectContractsTogles.get(2);
                contractsThirdElement.click();
                WebElement contractsForthElement = SelectContractsTogles.get(3);
                contractsForthElement.click();

                List<WebElement> SelectContractsReminderDateInput = driver.findElements(By.cssSelector(contractReminderDays));
                WebElement serviceContractExpirationReminderDate = SelectContractsReminderDateInput.get(1);
                serviceContractExpirationReminderDate.clear();
                serviceContractExpirationReminderDate.sendKeys("1");
                WebElement upcomingServiceReminderDate = SelectContractsReminderDateInput.get(4);
                upcomingServiceReminderDate.clear();
                upcomingServiceReminderDate.sendKeys("1");

                common.waitForElementClickableByCss(clickOnEquipmentToViewNotificationOption).click();
                List<WebElement> SelectEquipmentTogles = driver.findElements(By.cssSelector(equipmentTogleSelector));
                WebElement equipmentsFirstElement = SelectEquipmentTogles.get(0);
                equipmentsFirstElement.click();
                List<WebElement> SelectEquipmentReminderDateInput = driver.findElements(By.cssSelector(equipmentReminderDays));
                WebElement equipmentRegistrationReminderDate = SelectEquipmentReminderDateInput.get(1);
                equipmentRegistrationReminderDate.clear();
                equipmentRegistrationReminderDate.sendKeys("1");

                common.waitForElementClickableByCss(clickOnInventoryToViewNotificationOption).click();
                List<WebElement> SelectInventoryTogles = driver.findElements(By.cssSelector(inventoryTogleSelector));
                WebElement inventoryFirstElement = SelectInventoryTogles.get(0);
                inventoryFirstElement.click();
                WebElement inventorySecondElement = SelectInventoryTogles.get(1);
                inventorySecondElement.click();
                WebElement inventoryThirdElement = SelectInventoryTogles.get(2);
                inventoryThirdElement.click();
                WebElement inventoryForthElement = SelectInventoryTogles.get(3);
                inventoryForthElement.click();

                common.waitForElementClickableByCss(clickOnVehiclesToViewNotificationOption).click();
                List<WebElement> SelectVehiclesTogles = driver.findElements(By.cssSelector(vehiclesTogleSelector));
                WebElement vehiclesFirstElement = SelectVehiclesTogles.get(0);
                vehiclesFirstElement.click();
                WebElement vehiclesSecondElement = SelectVehiclesTogles.get(1);
                vehiclesSecondElement.click();
                WebElement vehiclesThirdElement = SelectVehiclesTogles.get(2);
                vehiclesThirdElement.click();
                WebElement vehiclesForthElement = SelectVehiclesTogles.get(3);
                vehiclesForthElement.click();
                WebElement vehiclesFifthElement = SelectVehiclesTogles.get(4);
                vehiclesFifthElement.click();
                WebElement vehiclesSixthElement = SelectVehiclesTogles.get(5);
                vehiclesSixthElement.click();
                List<WebElement> SelectVehiclesReminderDateInput = driver.findElements(By.cssSelector(vehicleReminderDays));
                WebElement vehicleRegistrationReminderDate = SelectVehiclesReminderDateInput.get(1);
                vehicleRegistrationReminderDate.clear();
                vehicleRegistrationReminderDate.sendKeys("1");
                WebElement licenseRenewalReminderDate = SelectVehiclesReminderDateInput.get(4);
                licenseRenewalReminderDate.clear();
                licenseRenewalReminderDate.sendKeys("3");
                WebElement medicalCardRenwalReminderDate = SelectVehiclesReminderDateInput.get(7);
                medicalCardRenwalReminderDate.clear();
                medicalCardRenwalReminderDate.sendKeys("2");
        }

        public void userPreferenceOfCustomizeOfficerUser() {
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

        public void performAssertionToVerifyAdminInputDataOfOfficerUser(webData officerUserAdmin) {
                navigateToOfficerUser();
                clickOnFilterfield(officerUserAdmin.getEmail());
                waitInSeconds(5);
                common.waitForElementClickableByCss(clickOnSearchCreatedOfficerUser).click();
                waitInSeconds(6);
                Assert.assertEquals(getSelectedDropdownText(clickOnRole), "Admin", "Admin selection mismatch");
                Assert.assertEquals(getOfficerAttributeValue(firstNameOfOfficerUser), officerUserAdmin.getFirstName(), "Officer firstname mismatch");
                Assert.assertEquals(getOfficerAttributeValue(lastNameOfOfficerUser), officerUserAdmin.getLastName(), "Officer lastname mismatch");
                Assert.assertEquals(getOfficerAttributeValue(phoneNumberOfOfficerUser), officerUserAdmin.getPhone(), "Officer phone Number mismatch");
                Assert.assertEquals(getSelectedDropdownText(selectOptionOfMobile), "Cellular One", "Mobile provider selection mismatch");
                Assert.assertEquals(getOfficerAttributeValue(streetOfOfficerUser), officerUserAdmin.getStreet(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(cityNameOfOfficerUser), officerUserAdmin.getCity(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(stateOfOfficerUser), officerUserAdmin.getState(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(zipCodeOfficerUser), officerUserAdmin.getZip(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(countryOfficerUser), officerUserAdmin.getCountry(), "Officer name mismatch");
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedDropdownText(clickOnSelectCalendarToOpenDropDown), "HVAC", "Calendar selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMapVisibilityDropdown), "Usman Flow", "Vehicle selection mismatch");
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedDropdownText(clickOnDropDownToSelectRedirectPage), "Map", "Map selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateDropDown), "HVAC Maintenance Proposal Copy", "Estimate is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateEmailTemplateDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceEmailTemplateDropdown), "Invoice For Smoke Testing", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceReminderEmailDropdown), "Reminder: Invoice {{InvoiceNumber}} from {{Compan", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnServiceAgreementDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMembershipEmailDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnFormEmailDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email is mismatch");
                common.waitForElementVisibleByCss(clickOnSaveButton).click();
                waitInSeconds(5);
        }

        public void performAssertionToVerifyCustomizeInputDataOfOfficerUser(webData officerUserCustomize) {
                navigateToOfficerUser();
                clickOnFilterfield(officerUserCustomize.getEmail());
                waitInSeconds(5);
                common.waitForElementClickableByCss(clickOnSearchCreatedOfficerUser).click();
                waitInSeconds(6);
                Assert.assertEquals(getSelectedDropdownText(clickOnRole), "Customize", "Customize selection mismatch");
                Assert.assertEquals(getOfficerAttributeValue(firstNameOfOfficerUser), officerUserCustomize.getFirstName(), "Officer firstname mismatch");
                Assert.assertEquals(getOfficerAttributeValue(lastNameOfOfficerUser), officerUserCustomize.getLastName(), "Officer lastname mismatch");
                Assert.assertEquals(getOfficerAttributeValue(phoneNumberOfOfficerUser), officerUserCustomize.getPhone(), "Officer phone Number mismatch");
                Assert.assertEquals(getSelectedDropdownText(selectOptionOfMobile), "Qwest", "Mobile provider selection mismatch");
                Assert.assertEquals(getOfficerAttributeValue(streetOfOfficerUser), officerUserCustomize.getStreet(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(cityNameOfOfficerUser), officerUserCustomize.getCity(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(stateOfOfficerUser), officerUserCustomize.getState(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(zipCodeOfficerUser), officerUserCustomize.getZip(), "Officer name mismatch");
                Assert.assertEquals(getOfficerAttributeValue(countryOfficerUser), officerUserCustomize.getCountry(), "Officer name mismatch");
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedDropdownText(clickOnSelectCalendarToOpenDropDown), "Lawn Jobs", "Calendar selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMapVisibilityDropdown), "Usman Flow", "Vehicle selection mismatch");
                common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
                waitInSeconds(2);
                Assert.assertEquals(getSelectedDropdownText(clickOnDropDownToSelectRedirectPage), "Customer", "Customer selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateDropDown), "Planned Maintenance Agreement", "Estimate is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateEmailTemplateDropdown), "Company Default", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceEmailTemplateDropdown), "Invoice {{InvoiceNumber}} from {{CompanyName}}", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceReminderEmailDropdown), "Company Default", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnServiceAgreementDropdown), "Company Default", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMembershipEmailDropdown), "Company Default", "Form Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnFormEmailDropdown), "Company Default", "Form Email is mismatch");
                common.waitForElementVisibleByCss(clickOnSaveButton).click();
                waitInSeconds(5);
        }

        public void logoutFlow() {
                WebElement profile = common.waitForElementVisibleByCss(profileIcon);
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