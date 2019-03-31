/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Pelicula;
import models.Persona;

/**
 *
 * @author juan pablo cano
 */
@WebServlet(name = "VerPelicula", urlPatterns = {"/VerPelicula"})
public class VerPelicula extends HttpServlet {

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

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<Pelicula> Pelis = new ArrayList<>();
        if (null != session.getAttribute("Pelis")) {
            Pelis = (ArrayList<Pelicula>) session.getAttribute("Pelis");
        }
        if(request.getParameter("pelicula") != null){
            Pelicula pelicula = Pelicula.buscarPelicula(request.getParameter("pelicula"));
            request.setAttribute("pelicula", pelicula);
            session.setAttribute("pelicula", pelicula);
        }
        request.setAttribute("Pelis", Pelis);
        session.setAttribute("Pelis", Pelis);
        RequestDispatcher view = request.getRequestDispatcher("verPelicula.jsp");
        view.forward(request, response);
    }

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
