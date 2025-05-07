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
        public static List<webData> getOfficerUserData() throws IOException {
                ObjectMapper mapper = new ObjectMapper();
                TestDataWrapper wrapper = mapper.readValue(
                        new File("src/test/resources/Data.json"),
                        TestDataWrapper.class
                );
                return wrapper.getOfficerUser();
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
