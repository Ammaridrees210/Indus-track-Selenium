package org.data;

import java.util.List;

public class TestDataWrapper {
        private List<webData> validAdmin;
        private List<webData> invalidAdmin;
        private List<webData> officerUserViewOnly;
        private List<webData> officerUserEditView;
        private List<webData> officerUserAdmin;
        private List<webData> officerUserCustomize;
        private List<webData> updateOfficerUser;

        public List<webData> getvalidAdmin() {
                return validAdmin;
        }

        public List<webData> getinvalidAdmin() {
                return invalidAdmin;
        }

        public List<webData> getOfficerUserViewOnly(){
                return officerUserViewOnly;
        }
        public List<webData> getOfficerUserEditView(){
                return officerUserEditView;
        }
        public List<webData> getOfficerUserAdmin(){
                return officerUserAdmin;
        }
        public List<webData> getUpdateOfficerUser() {
                return updateOfficerUser;
        }
        public List<webData> getOfficerUserCustomize() {
                return officerUserCustomize;
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

        public void setOfficerUserViewOnly(List<webData> officerUserViewOnly){
                this.officerUserViewOnly = officerUserViewOnly;
        }
        public void setOfficerUserEditView(List<webData> officerUserEditView){
                this.officerUserEditView = officerUserEditView;
        }
        public void setOfficerUserAdmin(List<webData> officerUserAdmin){
                this.officerUserAdmin = officerUserAdmin;
        }
        public void setOfficerUserCustomize(List<webData> officerUserCustomize){
                this.officerUserCustomize = officerUserCustomize;
        }
}
