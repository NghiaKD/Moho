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
public class Order {
    private int id;
    private String account;
    private Date date;
    private String note;
    private double amount;

    public Order() {
    }

    public Order(int id, String account, Date date, String note, double amount) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.note = note;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public Date getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
