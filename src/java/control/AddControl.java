/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package control;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ngdugn
 */
@WebServlet(name="AddControl", urlPatterns={"/add"})
public class AddControl extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String color=request.getParameter("color");
        String size=request.getParameter("size");
        String material=request.getParameter("material");
        String category=request.getParameter("category");
        int categoryId=Integer.parseInt(category);
        String collection=request.getParameter("collection");
        String StrstockQuantity=request.getParameter("stockQuantity");
        String Strgallery=request.getParameter("gallery");
        int stockQuantity=Integer.parseInt(StrstockQuantity);
        int gallery=Integer.parseInt(Strgallery);
        String Strprice=request.getParameter("price");
        double price=Integer.parseInt(Strprice);
        String StrsalePrice=request.getParameter("salePrice");
        double salePrice=Integer.parseInt(StrsalePrice);
        String imageId=request.getParameter("imageId");
        String img=request.getParameter("img");   
        
        DAO dao=new DAO();
        dao.insertProduct(id, name, color, size, material, categoryId, collection, true, stockQuantity, gallery, price, salePrice, imageId, img);
        response.sendRedirect("managerP");
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
