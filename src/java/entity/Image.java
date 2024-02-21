/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class Image {
    private int id;
    private String img;
    private int gallery;

    public Image() {
    }

    public Image(int id, String img, int gallery) {
        this.id = id;
        this.img = img;
        this.gallery = gallery;
    }

    public int getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public int getGallery() {
        return gallery;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setGallery(int gallery) {
        this.gallery = gallery;
    }
    
    
}
