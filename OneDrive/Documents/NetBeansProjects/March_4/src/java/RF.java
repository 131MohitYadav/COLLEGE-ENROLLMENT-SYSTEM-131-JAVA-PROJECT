/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yadav
 */
public class RF extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RF</title>");            
            out.println("</head>");
            out.println("<body>");
          String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String pass = request.getParameter("ps");
        String repass = request.getParameter("reps");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
       String cat = request.getParameter("ct");
            String country = request.getParameter("ctr");
             // String pass = request.getParameter("ps");
            String add = request.getParameter("ad");


            String a[] = request.getParameterValues("ch");
            String sk[] = request.getParameterValues("skills");

        out.println("<h1>Form Data:</h1>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>Last Name: " + lastname + "</h2>");
        out.println("<h2>Password: " + pass + "</h2>");
        out.println("<h2>Re-enter Password: " + repass + "</h2>");
        out.println("<h2>Email: " + email + "</h2>");
        out.println("<h2>Mobile: " + mobile + "</h2>");
        out.println("<h2>Address: " + add + "</h2>");
        out.println("<h2>Category: " + cat + "</h2>");
        out.println("<h2>Country: " + country + "</h2>");
        out.println("<h2>Hobbies:</h2>");
        
        
        
//         out.println("<h1>Your Selected Category is : " + cat+ "</h1>");
//            for( String s : a){
//                out.println("<h1> "+ s +  " </h1>");
//                        
//            }
//            
//             for( String skill : sk){
//                out.println("<h1> Your selected Skills is:  "+ skill +  " </h1>");
//                        
//            }
//
//              out.println("<h1>Your Selected City is : " + country+ "</h1>");
//                out.println("<h1> Your Address is: " + add + "</h1>");
//
       
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
