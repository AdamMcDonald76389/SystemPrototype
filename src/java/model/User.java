package model;


/*
 * generic backend class for user
 * will pull from database once properly integrated
 * @parameter role checks admin status
 * subject to change
 */
    public class User {
        private long id;
        private String username;
        private String email;
        private String password;
        private String address;
        private String city;
        private String zipCode;
        private String cardNumber;
        private String role; // "admin" or "user"


    public User(long id, String username, String email, String password, String address, String city, String zipCode, String cardNumber, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.cardNumber = cardNumber;
        this.role = role;
    }

    public User(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}