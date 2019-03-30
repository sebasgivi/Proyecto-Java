/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Persona;

/**
 *
 * @author juan pablo cano
 */
@WebServlet(name = "LogIn", urlPatterns = {"/LogIn"})
public class LogIn extends HttpServlet {

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

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (null != session.getAttribute("aPersona")) {
            Persona aPersona = new Persona();
            aPersona = (Persona) session.getAttribute("aPersona");
            String clave = aPersona.getCorreo();
            String correo = aPersona.getClave();
            //LEER EL TXT PARA VER SI CONCUERDA CLAVE CON CORREO
            if (Persona.buscarPersona(correo, Persona.getListaPersonas()) != null) {
                if (aPersona.getClave() == clave) {
                    if (aPersona.getTipo().equals("2")) {
                        request.setAttribute("aPersona", aPersona);
                        session.setAttribute("aPersona", aPersona);
                        RequestDispatcher view = request.getRequestDispatcher("homeAdmin.jsp");
                        view.forward(request, response);
                    } else {
                        request.setAttribute("aPersona", aPersona);
                        session.setAttribute("aPersona", aPersona);
                        RequestDispatcher view = request.getRequestDispatcher("home.jsp");
                        view.forward(request, response);
                    }

                }
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
