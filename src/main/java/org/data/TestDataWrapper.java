package org.data;

import java.util.List;

public class TestDataWrapper {
        private List<webData> validAdmin;
        private List<webData> invalidAdmin;
        private List<webData> officerUser;
        private List<webData> updateOfficerUser;

        public List<webData> getvalidAdmin() {
                return validAdmin;
        }

        public List<webData> getinvalidAdmin() {
                return invalidAdmin;
        }

        public List<webData> getOfficerUser() {
                return officerUser;
        }
        public List<webData> getUpdateOfficerUser() {
                return updateOfficerUser;
        }

        public void setUpdateOfficerUser(List<webData> updateOfficerUser) {
                this.updateOfficerUser = updateOfficerUser;
        }

        public void setvalidAdmin(List<webData> validAdmin) {
                this.validAdmin = validAdmin;
        }

        public void setinvalidAdmin(List<webData> invalidAdmin) {
                this.invalidAdmin = invalidAdmin;
        }

        public void setofficerUser(List<webData> officerUser) {
                this.officerUser = officerUser;
        }
}
