/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class Product {
    private int id;
    private String name;
    private String size;
    private String material;
    private String description;
    private int categoryId;
    private boolean status;
    private String collection;

    public Product() {
    }

    public Product(int id, String name, String size, String material, String description, int categoryId, boolean status, String collection) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.material = material;
        this.description = description;
        this.categoryId = categoryId;
        this.status = status;
        this.collection = collection;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getDescription() {
        return description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public boolean isStatus() {
        return status;
    }

    public String getCollection() {
        return collection;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", size=" + size + ", material=" + material + ", description=" + description + ", categoryId=" + categoryId + ", status=" + status + ", collection=" + collection + '}';
    }

    
    
}
