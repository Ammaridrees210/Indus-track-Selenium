package org.automation.pages;

import org.data.webData;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class OfficerPage {
        private final WebDriver driver;
        private final CommonPage common;
        private final Random rnd = new Random();  // <---- Initialize Random here


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
        public String roleOption = ".mat-select-panel mat-option span";
        public String firstNameOfOfficerUser = "[formcontrolname='firstName']";
        public String lastNameOfOfficerUser = "[formcontrolname='lastName']";
        public String phoneNumberOfOfficerUser = "[formcontrolname='phone']";
        public String selectOptionOfMobile = "[formcontrolname=\"mobileProvider\"]";
        public String selectMobileProviderOption = ".mat-select-panel mat-option span";
        public String clickOnPremissionTab = "div[id='mat-tab-label-1-1'] div[class='mat-tab-label-content']";
        public String crossDefaultMapSelection = "i[title=\"Delete\"]";
        public String clickOnSelectCalendarToOpenDropDown = "[formcontrolname=\"schedulers\"]";
        public String selectOptions = "mat-option span";
        public String outsideElement = "body";
        public String clickOnMapVisibilityForVehiclesAllOption = "mat-checkbox[formcontrolname=\"allowAllVehicleGroups\"] div[class=\"mat-checkbox-inner-container\"]";
        public String clickOnMapVisibilityDropdown = "[formcontrolname=\"vehicleGroups\"]";
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
        public String selectOption = "div[class='cdk-overlay-pane'] mat-option";
        public String clickOnEstimateDropDown = "[formcontrolname=\"defaultEstimateTemplateId\"]";
        public String clickOnEstimateEmailTemplateDropdown = "[formcontrolname=\"defaultEstimateEmailTemplateId\"]";
        public String clickOnInvoiceEmailTemplateDropdown = "[formcontrolname=\"defaultInvoiceEmailTemplateId\"]";
        public String clickOnInvoiceReminderEmailDropdown = "[formcontrolname=\"defaultInvoiceReminderEmailTemplateId\"]";
        public String clickOnServiceAgreementDropdown = "[formcontrolname=\"defaultServiceAgreementEmailTemplateId\"]";
        public String clickOnMembershipEmailDropdown = "[formcontrolname=\"defaultMembershipEmailTemplateId\"]";
        public String clickOnFormEmailDropdown = "[formcontrolname=\"defaultFormEmailTemplateId\"]";
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

        public void clickLogout() {
                common.findElementByCss(logoutButton).click();
        }

        public void createOfficeUser(webData userData) {
                boolean isCustomize = userData.getRole().equalsIgnoreCase("Customize");

                navigateToOfficerUser();
                AddNewOfficerUser();
                fillOfficerUserForm(userData);
                selectRole(userData.getRole());
                selectMobileProvider(userData.getMobileProvider());
                setPermissions(userData.getCalendarName(), userData.getVehicleName(),isCustomize);
                waitInSeconds(2);
                notificationOfOfficerUser(userData);
                userPreferenceOfOfficerUser(userData);
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

        public void selectRole(String roleName) {
                common.waitForElementClickableByCss(clickOnRole).click();
                List<WebElement> options = driver.findElements(By.cssSelector(roleOption));
                for (WebElement option : options) {
                        String text = option.getText().trim();
                        if (text.equalsIgnoreCase(roleName.trim())) {
                                waitInSeconds(1);
                                option.click();
                                System.out.println("Clicked option: " + text);
                                return;
                        }
                }
                throw new NoSuchElementException("Role option '" + roleName + "' not found in dropdown.");
        }

        public void selectMobileProvider(String providerName) {
                common.waitForElementClickableByCss(selectOptionOfMobile).click();
                List<WebElement> options = driver.findElements(By.cssSelector(selectMobileProviderOption));
                System.out.println("Mobile provider option found: " + options);

                for (WebElement option : options) {
                        String text = option.getText().trim();
                        System.out.println("Mobile provider option found: " + text);

                        if (text.equalsIgnoreCase(providerName.trim())) {
                                option.click();
                                System.out.println("Clicked mobile provider option: " + text);
                                return;
                        }
                }

                throw new NoSuchElementException("Mobile provider '" + providerName + "' not found in dropdown.");
        }

        private void safeClick(WebElement el) {
                try {
                        el.click();
                } catch (ElementClickInterceptedException e) {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
                }
        }

        public void setPermissions(String calendarName, String vehicleName, boolean enableCustomize) {
                common.waitForElementClickableByCss(clickOnPremissionTab).click();
                if (enableCustomize) {
                        common.waitForElementClickableByCss(clickOnEnableButton).click();
                }
                common.waitForElementClickableByCss(crossDefaultMapSelection).click();
                waitInSeconds(2);

                common.waitForElementClickableByCss(clickOnSelectCalendarToOpenDropDown).click();
                List<WebElement> calendarOptions = driver.findElements(By.cssSelector(selectOptions));
                for (WebElement option : calendarOptions) {
                        if (option.getText().trim().equalsIgnoreCase(calendarName.trim())) {
                                waitInSeconds(1);
                                option.click();
                                break;
                        }
                }

                clickOutsideDropdown();

                common.waitForElementClickableByCss(clickOnMapVisibilityForVehiclesAllOption).click();
                waitInSeconds(2);
                common.waitForElementClickableByCss(clickOnMapVisibilityDropdown).click();
                waitInSeconds(1);
                List<WebElement> vehicleOptions = driver.findElements(By.cssSelector(selectOptions));
                for (WebElement option : vehicleOptions) {
                        if (option.getText().trim().equalsIgnoreCase(vehicleName.trim())) {
                                waitInSeconds(1);
                                safeClick(option);
//                                option.click();
                                break;
                        }
                }
                clickOutsideDropdown();
                waitInSeconds(2);
        }

        public void notificationOfOfficerUser(webData userData) {

                common.waitForElementClickableByXpath(clickOnNotificationTab).click();
                common.waitForElementClickableByCss(clickOnJobToViewNotificationOptions).click();
                List<WebElement> selectJobTogles = driver.findElements(By.cssSelector(jobTogleSelectors));
                WebElement jobFirstElement = selectJobTogles.get(0);
                jobFirstElement.click();
                WebElement jobSecondElement = selectJobTogles.get(1);
                jobSecondElement.click();
                WebElement jobThirdElement = selectJobTogles.get(2);
                jobThirdElement.click();
                WebElement jobForthElement = selectJobTogles.get(3);
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
                List<WebElement> invDates = driver.findElements(By.cssSelector(invoiceReinderTogleSelector));
                invDates.get(1).clear();
                invDates.get(1).sendKeys(userData.getInvoiceReminder());

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
                List<WebElement> contractDates = driver.findElements(By.cssSelector(contractReminderDays));
                contractDates.get(1).clear();
                contractDates.get(1).sendKeys(userData.getContractServiceReminder());
                contractDates.get(4).clear();
                contractDates.get(4).sendKeys(userData.getContractsUpcomingReminder());

                common.waitForElementClickableByCss(clickOnEquipmentToViewNotificationOption).click();
                List<WebElement> SelectEquipmentTogles = driver.findElements(By.cssSelector(equipmentTogleSelector));
                WebElement equipmentsFirstElement = SelectEquipmentTogles.get(0);
                equipmentsFirstElement.click();
                List<WebElement> equipDates = driver.findElements(By.cssSelector(equipmentReminderDays));
                equipDates.get(1).clear();
                equipDates.get(1).sendKeys(userData.getEquipmentReminder());

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
                List<WebElement> vehicleDates = driver.findElements(By.cssSelector(vehicleReminderDays));
                vehicleDates.get(1).clear();
                vehicleDates.get(1).sendKeys(userData.getVehicleRegistrationReminder());
                vehicleDates.get(4).clear();
                vehicleDates.get(4).sendKeys(userData.getVehicleLicense());
                vehicleDates.get(7).clear();
                vehicleDates.get(7).sendKeys(userData.getVehicleMedical());
        }

        public void userPreferenceOfOfficerUser(webData userData) {
        // open the User Preference tab
        common.waitForElementClickableByXpath(clickOnUserPreferenceTab).click();
        // redirect‑page dropdown
        common.waitForElementClickableByCss(clickOnDropDownToSelectRedirectPage).click();
        chooseOptionByText(selectOption, userData.getRedirectLoginPage());

        // estimate‑template dropdown
        common.waitForElementClickableByCss(clickOnEstimateDropDown).click();
        chooseOptionByText(selectOption, userData.getEstimateTemplate());

        // estimate‑email template
        common.waitForElementClickableByCss(clickOnEstimateEmailTemplateDropdown).click();
        chooseOptionByText(selectOption, userData.getEstimateEmail());

        // invoice‑email template
        common.waitForElementClickableByCss(clickOnInvoiceEmailTemplateDropdown).click();
        chooseOptionByText(selectOption, userData.getInvoiceEmail());

        // invoice‑reminder template
        common.waitForElementClickableByCss(clickOnInvoiceReminderEmailDropdown).click();
        chooseOptionByText(selectOption, userData.getInvoiceReminder());

        // service‑agreement template
        common.waitForElementClickableByCss(clickOnServiceAgreementDropdown).click();
        chooseOptionByText(selectOption, userData.getServiceAgreement());

        // membership‑email template
        common.waitForElementClickableByCss(clickOnMembershipEmailDropdown).click();
        chooseOptionByText(selectOption, userData.getMembershipEmail());

        // form‑email template
        common.waitForElementClickableByCss(clickOnFormEmailDropdown).click();
        chooseOptionByText(selectOption, userData.getFormEmail());

        // save changes
        common.waitForElementClickableByCss(clickOnSaveButton).click();
        waitInSeconds(5);
        }

        private void chooseOptionByText(String optionsCssSelector, String visibleText) {
                List<WebElement> options = driver.findElements(By.cssSelector(optionsCssSelector));
                for (WebElement dropdownOption : options) {
                        if (dropdownOption.getText().trim().equalsIgnoreCase(visibleText.trim())) {
                                dropdownOption.click();
                                clickOutsideDropdown();
                                return;
                        }
                }
                // fallback: if nothing matches, click the first
                options.get(0).click();
                clickOutsideDropdown();
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
                Assert.assertEquals(getSelectedDropdownText(clickOnDropDownToSelectRedirectPage), "Estimates", "Map selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateDropDown), "HVAC System Installation Proposal", "Estimate is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateEmailTemplateDropdown), "Company Default", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceEmailTemplateDropdown), "Company Default", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceReminderEmailDropdown), "Company Default", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnServiceAgreementDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMembershipEmailDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnFormEmailDropdown), "Company Default", "Form Email is mismatch");
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
                Assert.assertEquals(getSelectedDropdownText(clickOnDropDownToSelectRedirectPage), "Schedule", "Customer selection mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateDropDown), "Planned Maintenance Agreement", "Estimate is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnEstimateEmailTemplateDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Estimate Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceEmailTemplateDropdown), "Invoice For Smoke Testing", "Invoice Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnInvoiceReminderEmailDropdown), "Company Default", "Invoice Reminder is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnServiceAgreementDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Service Agreeement Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnMembershipEmailDropdown), "Estimate {{EstimateNumber}} from {{CompanyName}}", "Form Email is mismatch");
                Assert.assertEquals(getSelectedDropdownText(clickOnFormEmailDropdown), "Company Default", "Form Email is mismatch");
                common.waitForElementVisibleByCss(clickOnSaveButton).click();
                waitInSeconds(5);
        }

        public void logoutFlow() {
                WebElement profile = common.waitForElementVisibleByCss(profileIcon);
                Assert.assertTrue(profile.isDisplayed(), "Login was not successful. Profile icon not found.");
                common.findElementByCss(profileIcon).click();
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