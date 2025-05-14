package org;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.automation.pages.LoginPage;
import org.automation.base.BaseWebTest;
import org.automation.pages.OfficerPage;
import org.automation.utils.TestDataUtil;
import org.data.webData;

import java.io.IOException;
import java.util.List;

public class OfficerUserTest extends BaseWebTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUpLogin() {
        driver.get("https://onetrackuiprerelease.azurewebsites.net/login");
        loginPage = new LoginPage(driver);
    }

    @DataProvider(name = "officerUserViewOnly")
    public Object[][] getOfficerUserViewOnlyData() throws IOException {
        List<webData> officerUserViewOnly = TestDataUtil.getOfficerUserViewOnlyData();
        Object[][] data = new Object[officerUserViewOnly.size()][1];
        for (int i = 0; i < officerUserViewOnly.size(); i++) {
            data[i][0] = officerUserViewOnly.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserViewOnly", priority = 1)
    public void createOfficerUserViewOnly(webData officerUserViewOnly) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.createOfficeUser("ViewOnly", officerUserViewOnly);
    }

    @Test(dataProvider = "officerUserViewOnly", priority = 2)
    public void verifyOfficerUserViewOnly(webData officerUserViewOnly) throws IOException {
        webData loginData = TestDataUtil.getOfficerUserViewOnlyData().get(0);
        loginPage.login(loginData.getEmail(), loginData.getPasswordNew());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyViewOnlyCreatedOfficerUserData(officerUserViewOnly);
    }

    @DataProvider(name = "officerUserViewEditAccess")
    public Object[][] getOfficerUserEditViewData() throws IOException {
        List<webData> officerUserEditView = TestDataUtil.getOfficerUserEditViewData();
        Object[][] data = new Object[officerUserEditView.size()][1];
        for (int i = 0; i < officerUserEditView.size(); i++) {
            data[i][0] = officerUserEditView.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserViewEditAccess", priority = 3)
    public void createOfficerUserEditView(webData officerUserEditView) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.createOfficeUser("EditView" ,officerUserEditView);
    }

    @Test(dataProvider = "officerUserViewEditAccess", priority = 4)
    public void verifyOfficerUserViewEdit(webData officerUserEditView) throws IOException {
        webData loginData = TestDataUtil.getOfficerUserEditViewData().get(0);
        loginPage.login(loginData.getEmail(), loginData.getPasswordNew());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyEditViewCreatedOfficerUserData(officerUserEditView);
    }

    @DataProvider(name = "officerUserAdminAccess")
    public Object[][] getOfficerUserAdminData() throws IOException {
        List<webData> officerUserAdmin = TestDataUtil.getOfficerUserAdminData();
        Object[][] data = new Object[officerUserAdmin.size()][1];
        for (int i = 0; i < officerUserAdmin.size(); i++) {
            data[i][0] = officerUserAdmin.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserAdminAccess", priority = 5)
    public void createOfficerUserAdmin(webData officerUserAdmin) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.createOfficeUser("Admin", officerUserAdmin);
    }

    @Test(dataProvider = "officerUserAdminAccess", priority = 6)
    public void verifyOfficerUserAdmin(webData officerUserAdmin) throws IOException {
        webData loginData = TestDataUtil.getOfficerUserAdminData().get(0);
        loginPage.login(loginData.getEmail(), loginData.getPasswordNew());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyAdminCreatedOfficerUserData(officerUserAdmin);
    }

    @DataProvider(name = "officerUserCustomizeAccess")
    public Object[][] getOfficerUserCustomize() throws IOException {
        List<webData> officerUserCustomize = TestDataUtil.getOfficerUserCustomizeData();
        Object[][] data = new Object[officerUserCustomize.size()][1];
        for (int i = 0; i < officerUserCustomize.size(); i++) {
            data[i][0] = officerUserCustomize.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserCustomizeAccess", priority = 7)
    public void createOfficerUserCustomize(webData officerUserCustomize) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.createOfficeUser("Customize",officerUserCustomize);
    }

    @Test(dataProvider = "officerUserCustomizeAccess", priority = 8)
    public void verifyOfficerUserCustomize(webData officerUserCustomize) throws IOException {
        webData loginData = TestDataUtil.getOfficerUserCustomizeData().get(0);
        loginPage.login(loginData.getEmail(), loginData.getPasswordNew());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyCustomizeCreatedOfficerUserData(officerUserCustomize);
    }
}
