/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Category;
import entity.Color;
import entity.Image;
import entity.Product;
import entity.ProductIteam;
import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngdugn
 */
public class DAO {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Product> getAllProduct(){
        List<Product> list=new ArrayList<>();
        String query="select * from ProductHE171759 where Status=1";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public ProductIteam getProductIteambyProductId(int id){
        String query = "Select * from ProductIteamHE171759 where ProductId=?";
        try {
            con = new DBContext().getConnection();//mo ket noi vs sql
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new ProductIteam(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<Product> getProductbyCategoryId(String categoryId){
        List<Product> list=new ArrayList<>();
        String query="select * from ProductHE171759 where CategoryId=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, categoryId);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public List<Product> getProductbypid(String pid){
        List<Product> list=new ArrayList<>();
        String query="select * from ProductHE171759 join CategoryHE171759 on ProductHE171759.CategoryId=CategoryHE171759.Id where pid=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public Product getProductbyId(String id){
        String query="select * from ProductHE171759 where Id=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                return (new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return null;
    }
    
    public Image getImagebyProduct(String id){
        String query = "select top 1 * from ImageHE171759 where Gallery = ?";
        try {
            con = new DBContext().getConnection();//mo ket noi vs sql
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Image(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
        } catch (Exception e) {
        }
        return null;
    }
       
    public List<Category> getCategorybyParentId(String pid){
        List<Category> list=new ArrayList<>();
        String query="select * from CategoryHE171759 where pid=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1,pid);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Category(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public List<Category> getAllCategoryOfProducts(){
        List<Category> list=new ArrayList<>();
        String query="select * from CategoryHE171759 where pid<>0";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Category(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public List<Image> getImagebyGallery(String gallery){
        List<Image> list=new ArrayList<>();
        String query="select * from ImageHE171759 where Gallery=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1,gallery);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Image(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)));
            }
        }catch(Exception e){
            
        }
        return list;        
    } 
    
    public List<Product> searchbyName(String txtSearch){
        List<Product> list=new ArrayList<>();
        String query="select * from ProductHE171759 where Name like ?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, "%"+txtSearch+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public Account login(String email,String pass){
        String query="select * from AccountHE171759 where email=? and password=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8));
            }
        }catch(Exception e){            
        }
        return null;
    }
    
    public Account checkAccountExist(String email){
        String query="select * from AccountHE171759 where email=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1),
                        rs.getString(2),
                        rs.getBoolean(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8));
            }
        }catch(Exception e){            
        }
        return null;
    }
    
    public void signUp(String email,String pass){
        String query = "insert into AccountHE171759 (Email,Password) values ('?','?')";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, email);
            ps.executeUpdate();            
        }catch(Exception e){            
        }
    }
    
    public void delete(String pid){
        String query = "update ProductHE171759 set Status=0 where Id=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();            
        }catch(Exception e){            
        }
    }
    
    public List<ProductIteam> getAllColorOfAProduct(String pid){
        List<ProductIteam> list=new ArrayList<>();
        String query="select * from ProductIteamHE171759 where ProductId=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, pid);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new ProductIteam(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getInt(7)));
            }
        }catch(Exception e){            
        }
        return list;
    }
    
    public List<Color> getAllColor(){
        List<Color> list=new ArrayList<>();
        String query="select * from ColorHE171759";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Color(rs.getInt(1),
                        rs.getString(2)));
            }
        }catch(Exception e){            
        }
        return list;
    }
    
    public List<Product> PagingProduct(int begin,int nrpp){
        List<Product> list=new ArrayList<>();
        String query="select * from ProductHE171759 where Status=1 order by Id offset ? rows fetch next ? row only";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setInt(1, begin);
            ps.setInt(2, nrpp);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getBoolean(8),
                        rs.getString(7)));
            }
        }catch(Exception e){
            
        }
        return list;
    }
    
    public void insertProduct(String id, String name, String colorId,String size,String material,int categoryId,String collection, boolean status, int stockQuantity, int gallery, double price, double salePrice, String ImageId,String img){
        String query=   "insert into ProductHE171759 (Id,Name,Size,Material,CategoryId,Collection,Status) values(?,?,?,?,?,?,1)\n" +
                        "insert into ProductIteamHE171759 (ProductId,ColorId,StockQuantity,Gallery,Price,SalePrice) values(?,?,?,?,?,?)\n" +
                        "insert into ImageHE171759 values(?,?,?)";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, size);
            ps.setString(4, material);
            ps.setInt(5, categoryId);
            ps.setString(6, collection);
            
            ps.setString(7, id);
            ps.setString(8, colorId);
            ps.setInt(9, stockQuantity);
            ps.setInt(10, gallery);
            ps.setDouble(11, price);
            ps.setDouble(12, salePrice);
            
            ps.setString(13, ImageId);
            ps.setString(14, img);
            ps.setInt(15, gallery);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void editProduct(String id, String name,String size,String material,int categoryId,String collection, boolean status){
        String query="update ProductHE171759 set Name =?,Size=?,Material=?,CategoryId=?,Collection=? where Id=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(6, id);
            ps.setString(1, name);
            ps.setString(2, size);
            ps.setString(3, material);
            ps.setInt(4, categoryId);
            ps.setString(5, collection);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void deleteProduct(String id, String name,String size,String material,int categoryId,String collection, boolean status){
        String query="insert into ProductHE171759 values (?,?,?,?,NULL,?,?,1)";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, size);
            ps.setString(4, material);
            ps.setInt(5, categoryId);
            ps.setString(6, collection);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public ProductIteam checkProductIteamExist(String productId,String colorId){
        String query="select * from ProductIteamHE171759 where ProductId=? and ColorId=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setString(1, productId);
            ps.setString(2, colorId);
            rs = ps.executeQuery();
            while(rs.next()){
                return new ProductIteam(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getInt(7));
            }
        }catch(Exception e){            
        }
        return null;
    }
    public ProductIteam checkGalleryExist(int gallery){
        String query="select * from ProductIteamHE171759 where Gallery=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setInt(1, gallery);
            rs = ps.executeQuery();
            while(rs.next()){
                return new ProductIteam(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getInt(7));
            }
        }catch(Exception e){            
        }
        return null;
    }
    public Image checkImageIdExist(int imageId){
        String query="select * from ImageHE171759 where Id=?";
        try{
            con=new DBContext().getConnection();
            ps=con.prepareStatement(query);
            ps.setInt(1, imageId);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Image(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
        }catch(Exception e){            
        }
        return null;
    }


    public static void main(String[] args) {
        DAO dao=new DAO();
        List<Product> list=dao.getProductbyCategoryId("6");
        List<Category> listC=dao.getCategorybyParentId("0");
        List<Product> list1=dao.getProductbypid("5");
        List<Product> list4=dao.PagingProduct(5, 5);
        List<Image> list2=dao.getImagebyGallery("2");
        List<ProductIteam> list3=dao.getAllColorOfAProduct("140");
//        for(Category o: listC){
//            System.out.println(o);
//        }
        
        for(Product o: list4){
            System.out.println(o);
        }
        int count=dao.getAllProduct().size();
        System.out.println(count);
        
    }
}
