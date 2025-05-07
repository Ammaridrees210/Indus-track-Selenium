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

    @DataProvider(name = "officerUserData")
    public Object[][] getOfficerUserData() throws IOException {
        List<webData> officerUsers = TestDataUtil.getOfficerUserData();
        Object[][] data = new Object[officerUsers.size()][1];
        for (int i = 0; i < officerUsers.size(); i++) {
            data[i][0] = officerUsers.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserData", priority = 1)
    public void createOfficerUser(webData officerUser) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.createOfficeUser(officerUser);
    }

    @Test(dataProvider = "officerUserData", priority = 2)
    public void verifyOfficerUser(webData officerUser) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyCreatedOfficerUserData(officerUser);
    }

    @DataProvider(name = "officerUserDataUpdate")
    public Object[][] getUpdateOfficerUserData() throws IOException {
        List<webData> updateData = TestDataUtil.getUpdateOfficerUserData();
        Object[][] data = new Object[updateData.size()][1];
        for (int i = 0; i < updateData.size(); i++) {
            data[i][0] = updateData.get(i);
        }
        return data;
    }

    @Test(dataProvider = "officerUserDataUpdate", priority = 3)
    public void enterUpdateOfficerUser(webData updateOfficerUser) throws IOException {
        webData loginData = TestDataUtil.getValidData().get(0);
        loginPage.login(loginData.getUsername(), loginData.getPassword());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.updateOfficerUser(updateOfficerUser);
    }

    @Test(dataProvider = "officerUserData", priority = 4)
    public void verifyupdatedOfficerUser(webData updateOfficerUser) throws IOException {
        webData loginData = TestDataUtil.getUpdateOfficerUserData().get(0);
        loginPage.login(loginData.getEmail(), loginData.getPasswordNew());

        OfficerPage officerPage = new OfficerPage(driver);
        officerPage.verifyUpdatedOfficerUserData(updateOfficerUser);
    }
}
