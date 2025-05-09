package org;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.automation.base.BaseWebTest;
import org.automation.pages.LoginPage;
import org.automation.utils.TestDataUtil;
import org.data.webData;

import java.io.IOException;
import java.util.List;

public class UserLoginTest extends BaseWebTest {

        private LoginPage loginPage;

        @BeforeMethod
        public void setup() {
                driver.get("https://onetrackuiprerelease.azurewebsites.net/login");
                loginPage = new LoginPage(driver);
        }

        @DataProvider(name = "validData")
        public Object[][] provideValidData() throws IOException {
                List<webData> data = TestDataUtil.getValidData();
                return convertToObjectArray(data);
        }

        @DataProvider(name = "invalidData")
        public Object[][] provideInvalidData() throws IOException {
                List<webData> data = TestDataUtil.getInvalidData();
                return convertToObjectArray(data);
        }

        private Object[][] convertToObjectArray(List<webData> data) {
                Object[][] testData = new Object[data.size()][2];
                for (int i = 0; i < data.size(); i++) {
                        testData[i][0] = data.get(i).getUsername();
                        testData[i][1] = data.get(i).getPassword();
                }
                return testData;
        }

        @Test(dataProvider = "validData")
        public void testValidLogin(String username, String password) {
                loginPage.login(username, password);
                loginPage.handleValidLoginFlow();
        }

        @Test(dataProvider = "invalidData")
        public void testInvalidLogin(String username, String password) {
                loginPage.login(username, password);
                if (password == null || password.isEmpty()) {
                        loginPage.handleForgotPasswordFlow(username);
                } else {
                        loginPage.handleInvalidLoginFlow();
                }
        }
}
