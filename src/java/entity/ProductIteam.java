/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class ProductIteam {
    private int productId;
    private int colorId;
    private int stockQuantity;
    private int gallery;
    private double price;
    private double salePrice;
    private int discount;

    public ProductIteam() {
    }

    public ProductIteam(int productId, int colorId, int stockQuantity, int gallery, double price, double salePrice, int discount) {
        this.productId = productId;
        this.colorId = colorId;
        this.stockQuantity = stockQuantity;
        this.gallery = gallery;
        this.price = price;
        this.salePrice = salePrice;
        this.discount = discount;
    }

    public int getProductId() {
        return productId;
    }

    public int getColorId() {
        return colorId;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public int getGallery() {
        return gallery;
    }

    public double getPrice() {
        return price;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setGallery(int gallery) {
        this.gallery = gallery;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    

}