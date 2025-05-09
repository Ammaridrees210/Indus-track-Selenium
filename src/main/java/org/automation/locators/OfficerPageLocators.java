package org.automation.locators;

import org.openqa.selenium.By;

public class OfficerPageLocators {

    private static By cs(String selector) {
        return By.cssSelector(selector);
    }

    private static By xpath(String expression) {
        return By.xpath(expression);
    }

    public static final By settingsIcon = cs(".topMenuSettings");
    public static final By officerUserTab = cs("ul:nth-child(1) > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)");
    public static final By visibilityOfLoader = cs(".sk-circle12");
    public static final By officerUserList = cs(".btn.btn-default.clearfilter");
    public static final By addNewButton = cs("button[class='btn btn-primary btn-sm m-l-sm m-r-sm']");
    public static final By officerUserEmail = cs("input[placeholder='Please Enter your email']");
    public static final By clickOnNewPassword = cs("div[class='col-sm-8'] a");
    public static final By officerNewPassword = cs("[name=\'pwd\']");
    public static final By confirmPasswordNew = cs("[name=\'repwd\']");
    public static final By clickOnSaveButtonForPassword = cs(".mat-focus-indicator.btn.btn-info.mat-button.mat-button-base._mat-animation-noopable");
    public static final By clickOnRole = cs("[formcontrolname=\"role\"]");
    public static final By selectOptionEditView = cs("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectOptionAdmin = cs("mat-option:nth-child(3) span:nth-child(1)");
    public static final By firstNameOfOfficerUser = cs("[formcontrolname='firstName']");
    public static final By lastNameOfOfficerUser = cs("[formcontrolname='lastName']");
    public static final By phoneNumberOfOfficerUser = cs("[formcontrolname='phone']");
    public static final By selectOptionOfMobile = cs("[formcontrolname=\"mobileProvider\"]");
    public static final By optionFromDropDownOfMobile = cs("mat-option:nth-child(3) span:nth-child(1)");
    public static final By updateOptionFromDropDownOfMobile = cs("mat-option:nth-child(4) span:nth-child(1)");
    public static final By streetOfOfficerUser = cs("[placeholder='Street']");
    public static final By cityNameOfOfficerUser = cs("[placeholder='City']");
    public static final By stateOfOfficerUser = cs("[placeholder='State']");
    public static final By zipCodeOfficerUser = cs("[placeholder='ZIP']");
    public static final By countryOfficerUser = cs("[placeholder='Country']");
    public static final By clickOnPremissionTab = cs("div[id='mat-tab-label-1-1'] div[class='mat-tab-label-content']");
    public static final By crossDefaultMapSelection = cs("i[title=\"Delete\"]");
    public static final By clickOnSelectCalendarToOpenDropDown = cs("[formcontrolname=\"schedulers\"]");
    public static final By selectOptionFromCalendarDropdown = cs("mat-option:nth-child(5) mat-pseudo-checkbox:nth-child(1)");
    public static final By selectUpdateOptionFromCalendarDropdown = cs("mat-option:nth-child(4) mat-pseudo-checkbox:nth-child(1)");
    public static final By outsideElement = cs("body");
    public static final By clickOnMapVisibilityForVehiclesAllOption = cs("mat-checkbox[formcontrolname=\"allowAllVehicleGroups\"] div[class=\"mat-checkbox-inner-container\"]");
    public static final By clickOnMapVisibilityDropdown = cs("[formcontrolname=\"vehicleGroups\"]");
    public static final By clickOnDropDownListToSelectVehicle = cs("mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)");
    public static final By clickOnDropDownlistToDeSelectVehicle = cs("mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)");
    public static final By clickOnDropDownlistToSelectUpdateVehicle = By.cssSelector("mat-option:nth-child(2) mat-pseudo-checkbox:nth-child(1)");
    public static final By clickOnNotificationTab = xpath("//div[contains(text(),'Notifications')]");
    public static final By clickOnJobToViewNotificationOptions = By.cssSelector("mat-expansion-panel:nth-child(1)");
    public static final By clickOnJobPutOnHold = By.cssSelector(".mat-slide-toggle-thumb");
    public static final By clickOnRecipient = By.cssSelector("div[class=\"mat-select-value ng-tns-c138-55\"] span:nth-child(1)");
    public static final By selectEmailOfJobOnHold = By.cssSelector("mat-option:nth-child(3) mat-pseudo-checkbox:nth-child(1)");
    public static final By selectOptionJobOnHoldPopup = By.cssSelector("label[for='mat-slide-toggle-2-input'] div[class=\"mat-slide-toggle-thumb-container\"]");
    public static final By selectOptionJobCompleted = By.cssSelector("label[for='mat-slide-toggle-3-input'] div[class='mat-slide-toggle-thumb']");
    public static final By selectOptionJobCompletedPopup = By.cssSelector("label[for='mat-slide-toggle-4-input'] div[class='mat-slide-toggle-thumb']");
    public static final By clickOnInvoiceToViewNotificationOption = By.cssSelector("mat-expansion-panel:nth-child(2)");
    public static final By selectOptionInvoiceOverDue = xpath("//span[contains(text(),'Overdue Invoices')]//preceding-sibling::div");
    public static final By selectOptionInvoiceOverDuePopup = By.cssSelector("label[for='mat-slide-toggle-6-input'] div[class=\"mat-slide-toggle-thumb-container\"]");
    public static final By selectOptionInvoicePaid = xpath("//span[contains(text(),'Paid Invoices')]//preceding-sibling::div");
    public static final By selectOptionInvoicePaidPopup = By.cssSelector("label[for='mat-slide-toggle-8-input'] div[class='mat-slide-toggle-thumb']");





    public static final By clickOnEstimatesToViewNotificationOption = By.cssSelector("mat-expansion-panel:nth-child(3)");
    public static final By clickOnMobileUserToViewNotificationOption = By.cssSelector("mat-expansion-panel:nth-child(4)");
    public static final By clickOnContractsToViewNotificationOption = By.cssSelector("mat-expansion-panel:nth-child(5)");
    public static final By clickOnEquipmentToViewNotificationOption =By.cssSelector("mat-expansion-panel:nth-child(6)");
    public static final By clickOnInventoryToViewNotificationOption = By.cssSelector("mat-expansion-panel:nth-child(7)");
    public static final By clickOnVehiclesToViewNotificationOption =By.cssSelector("mat-expansion-panel:nth-child(8)");
    public static final By clickOnUserPreferenceTab = xpath("//div[contains(text(),'User Preferences')]");
    public static final By clickOnDropDownToSelectRedirectPage = By.cssSelector("[formcontrolname=\"defaultTab\"]");
    public static final By selectOptionFromDropDownForRedirectPageAfterLogin = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By selectOptionFromDropDownForUpdateRedirectPageAfterLogin = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By clickOnEstimateDropDown = By.cssSelector("[formcontrolname=\"defaultEstimateTemplateId\"]");
    public static final By clickOnEstimatelistToSelectTemplate = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By clickOnEstimatelistToSelectUpdatedTemplate = By.cssSelector("mat-option:nth-child(3) span:nth-child(1)");
    public static final By clickOnEstimateEmailTemplateDropdown = By.cssSelector("[formcontrolname=\"defaultEstimateEmailTemplateId\"]");
    public static final By selectTheEstimateEmailOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectTheUpdatedEstimateEmailOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By clickOnInvoiceEmailTemplateDropdown = By.cssSelector("[formcontrolname=\"defaultInvoiceEmailTemplateId\"]");
    public static final By selectTheInvoiceEmailOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(3) span:nth-child(1)");
    public static final By selectTheUpdatedInvoiceEmailOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By clickOnInvoiceReminderEmailDropdown = By.cssSelector("[formcontrolname=\"defaultInvoiceReminderEmailTemplateId\"]");
    public static final By selectTheInvoiceReminderOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectTheUpdatedInvoiceReminderOptionFromTheDropdownList = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By clickOnServiceAgreementDropdown = By.cssSelector("[formcontrolname=\"defaultServiceAgreementEmailTemplateId\"]");
    public static final By selectTheServiceAgreementOptionFromDropdown = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectUpdateTheServiceAgreementOptionFromDropdown = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By clickOnMembershipEmailDropdown = By.cssSelector("[formcontrolname=\"defaultMembershipEmailTemplateId\"]");
    public static final By selectTheMembershipEmailOptionFromDropdown = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectTheUpdatedMembershipEmailOptionFromDropdown = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By clickOnFormEmailDropdown = By.cssSelector("[formcontrolname=\"defaultFormEmailTemplateId\"]");
    public static final By selectTheFormEmailOptionFromDropdown = By.cssSelector("mat-option:nth-child(2) span:nth-child(1)");
    public static final By selectTheUpdatedFormEmailOptionFromDropdown = By.cssSelector("mat-option:nth-child(1) span:nth-child(1)");
    public static final By clickOnSaveButton = By.cssSelector("mat-dialog-actions button:nth-child(2)");
    public static final By SearchOfficerUser = xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid']");
    public static final By clickOnSearchCreatedOfficerUser = By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)");
    public static final By profileIcon = By.cssSelector(".dropdown .fa-user-circle");
    public static final By logoutButton = By.cssSelector("a[title='LogOut']");


//    public String getElementByCss(String selector) {
//    };
}