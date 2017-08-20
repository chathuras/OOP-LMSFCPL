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
    private final String email;
    private final String password;
    private String mobile;
    private String address1;
    private String address2;
    private String city;
    private String province;
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
    public String getAddress1() {
        return this.address1;
    }

    /**
     *
     * @return String
     */
    public String getAddress2() {
        return this.address2;
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
    public String getProvince() {
        return this.province;
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
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     *
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
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
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     *
     * @param nid
     */
    public void setNid(String nid) {
        this.nid = nid;
    }

}
