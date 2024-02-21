/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ngdugn
 */
public class Category {
    private int id;
    private String name;
    private int pid;

    public Category() {
    }

    public Category(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPid() {
        return pid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", pid=" + pid + '}';
    }
    
    
}
