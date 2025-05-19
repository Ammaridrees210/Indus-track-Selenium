package org.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class webData {
        private String username;
        private String password;
        private boolean isValid;
        private String email;
        private String passwordNew;
        private String confirmPassword;
        private String role;
        private String firstName;
        private String lastName;
        private String phone;
        private String mobileProvider;
        private String street;
        private String city;
        private String state;
        private String zip;
        private String country;
        private String vehicleName;
        private String calendarName;
        private String invoiceReminder;
        private String contractServiceReminder;
        private String contractsUpcomingReminder;
        private String equipmentReminder;
        private String vehicleRegistrationReminder;
        private String vehicleLicense;
        private String vehicleMedical;
        private String redirectLoginPage;
        private String estimateTemplate;
        private String estimateEmail;
        private String invoiceEmail;
        private String invoiceReminderEmail;
        private String serviceAgreement;
        private String membershipEmail;
        private String formEmail;


        public webData() {}

        public String getUsername() {
                return username;
        }
        public void setUserName(String username) {
                this.username = username;
        }
        public String getPassword() {
                return password;
        }
        public void setPassword(String password) {
                this.password = password;
        }
        public boolean isValid() {
                return isValid;
        }
        public void setValid(boolean isValid) {
                this.isValid = isValid;
        }
        public String getEmail() {return email;}
        public String getRole(){
                return role;
        }
        public void setRole(String role){
                this.role = role;
        }
        public String getMobileProvider(){
                return mobileProvider;
        }
        public void setMobileProvider(){
                this.mobileProvider = mobileProvider;
        }
        public String getCalendarName(){
                return calendarName;
        }
        public String getVehicleName(){
                return vehicleName;
        }
        public void setVehicleName(String vehicleName){this.vehicleName = vehicleName;}
        public void setCalendarName(String calendarName){
                this.calendarName = calendarName;
        }
        public String getInvoiceReminder(){return invoiceReminder;}
        public void  setInvoiceReminder(String invoiceReminder){this.invoiceReminder = invoiceReminder; }
        public String getContractServiceReminder(){return contractServiceReminder;}
        public void  setContractServiceReminder(String contractServiceReminder){this.contractServiceReminder = contractServiceReminder; }
        public String getContractsUpcomingReminder(){return contractsUpcomingReminder;}
        public void  setContractsUpcomingReminder(String contractsUpcomingReminder){this.contractsUpcomingReminder = contractsUpcomingReminder; }
        public String getEquipmentReminder(){return equipmentReminder;}
        public void  setEquipmentReminder(String equipmentReminder){this.equipmentReminder = equipmentReminder; }
        public String getVehicleRegistrationReminder(){return vehicleRegistrationReminder;}
        public void  setVehicleRegistrationReminder(String vehicleRegistrationReminder){this.vehicleRegistrationReminder = vehicleRegistrationReminder; }
        public String getVehicleLicense(){return vehicleLicense;}
        public void  setVehicleLicense(String vehicleLicense){this.vehicleLicense = vehicleLicense; }
        public String getVehicleMedical(){return vehicleMedical;}
        public void  setVehicleMedical(String vehicleMedical){this.vehicleMedical = vehicleMedical; }
        public void setEmail(String email) {
                this.email = email;
        }
        public String getPasswordNew() {
                return passwordNew;
        }
        public void setPasswordNew(String passwordNew) {
                this.passwordNew = passwordNew;
        }
        public String getConfirmPassword() {
                return confirmPassword;
        }
        public void setConfirmPassword(String confirmPassword) {
                this.confirmPassword = confirmPassword;
        }
        public String getFirstName() {
                return firstName;
        }
        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
        public String getLastName() {
                return lastName;
        }
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
        public String getPhone() {
                return phone;
        }
        public void setPhone(String phone) {
                this.phone = phone;
        }
        public String getStreet() {
                return street;
        }
        public void setStreet(String street) {
                this.street = street;
        }
        public String getCity() {
                return city;
        }
        public void setCity(String city) {
                this.city = city;
        }
        public String getState() {
                return state;
        }
        public void setState(String state) {
                this.state = state;
        }
        public String getZip() {
                return zip;
        }
        public void setZip(String zip) {
                this.zip = zip;
        }
        public String getCountry() {
                return country;
        }
        public void setCountry(String country) { this.country = country;}
        public String getRedirectLoginPage() {
                return redirectLoginPage;
        }
        public void setRedirectLoginPage(String redirectLoginPage) {
                this.redirectLoginPage = redirectLoginPage;
        }
        public String getEstimateTemplate() {
                return estimateTemplate;
        }
        public void setEstimateTemplate(String estimateTemplate) {
                this.estimateTemplate = estimateTemplate;
        }
        public String getEstimateEmail() {return estimateEmail;}
        public void setEstimateEmail(String estimateEmail) {
                this.estimateEmail = estimateEmail;
        }
        public String getInvoiceEmail() {
                return invoiceEmail;
        }
        public void setInvoiceEmail(String invoiceEmail) {
                this.invoiceEmail = invoiceEmail;
        }
        public String getInvoiceReminderEmail() {
                return invoiceReminderEmail;
        }
        public void setInvoiceReminderEmail(String invoiceReminderEmail) {this.invoiceReminderEmail = invoiceReminderEmail;}
        public String getServiceAgreement() {
                return serviceAgreement;
        }
        public void setServiceAgreement(String serviceAgreement) {
                this.serviceAgreement = serviceAgreement;
        }
        public String getMembershipEmail() {
                return membershipEmail;
        }
        public void setMembershipEmail(String membershipEmail) {
                this.membershipEmail = membershipEmail;
        }
        public String getFormEmail() {
                return formEmail;
        }
        public void setFormEmail(String formEmail) {
                this.formEmail = formEmail;
        }
}
