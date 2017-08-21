/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

/**
 *
 * @author chathura
 */
public class Reader implements User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobile;
    private String street;
    private String city;
    private String postalCode;
    private String nid;

    /**
     *
     * @param email
     * @param password
     */
    public Reader(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters
    /**
     *
     * @return String
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *
     * @return String
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @return String
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @return String
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     *
     * @return String
     */
    public String getStreet() {
        return this.street;
    }

    /**
     *
     * @return String
     */
    public String getCity() {
        return this.city;
    }

    /**
     *
     * @return String
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     *
     * @return String
     */
    public String getNid() {
        return this.nid;
    }

    // Setters
    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     *
     * @param nid
     */
    public void setNid(String nid) {
        this.nid = nid;
    }

    public String[] toStringArray() {
        return new String[]{
            this.firstName,
            this.lastName,
            this.email,
            this.mobile,
            this.street,
            this.city,
            this.postalCode,
            this.nid
        };
    }

}
