/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

/**
 *
 * @author ngdugn
 */
public class Account {
    private String email;
    private String password;
    private boolean isadmin;
    private String name;
    private boolean gender;
    private String phone;
    private String address;
    private Date DOB;

    public Account() {
    }

    public Account(String email, String password, boolean isadmin, String name, boolean gender, String phone, String address, Date DOB) {
        this.email = email;
        this.password = password;
        this.isadmin = isadmin;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
    
    
    
}
