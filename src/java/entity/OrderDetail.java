/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class OrderDetail {
    private int orderId;
    private int productId;
    private int colorId;
    private int quantity;
    private double cutPrice;

    public OrderDetail() {
    }

    public OrderDetail(int orderId, int productId, int colorId, int quantity, double cutPrice) {
        this.orderId = orderId;
        this.productId = productId;
        this.colorId = colorId;
        this.quantity = quantity;
        this.cutPrice = cutPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public int getColorId() {
        return colorId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCutPrice() {
        return cutPrice;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCutPrice(double cutPrice) {
        this.cutPrice = cutPrice;
    }
    
    
}
