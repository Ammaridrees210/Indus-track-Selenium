package org.automation.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.data.webData;
import org.data.TestDataWrapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestDataUtil {

        public static List<webData> getValidData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                new File("src/test/resources/Data.json"),
                TestDataWrapper.class
                );
                return wrapper.getvalidAdmin();
        }

        public static List<webData> getInvalidData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                new File("src/test/resources/Data.json"),
                TestDataWrapper.class
                );
                return wrapper.getinvalidAdmin();
        }

        public static List<webData> getOfficerUserViewOnlyData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getOfficerUserViewOnly();
        }
        public static List<webData> getOfficerUserEditViewData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getOfficerUserEditView();
        }

        public static List<webData> getOfficerUserAdminData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getOfficerUserAdmin();
        }

        public static List<webData> getOfficerUserCustomizeData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getOfficerUserCustomize();
        }

        public static List<webData> getUpdateOfficerUserData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getUpdateOfficerUser();
        }
}
