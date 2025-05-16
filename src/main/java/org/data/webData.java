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

        public String getEmail() {
                return email;
        }

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
        
        public void setCountry(String country) {
                this.country = country;
        }
}
