/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Funcion;
import models.Pelicula;
import models.Tiquete;

/**
 *
 * @author juan pablo cano
 */
@WebServlet(name = "Comprar", urlPatterns = {"/Comprar"})
public class Comprar extends HttpServlet {

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
    
        String peliculaHora =  request.getParameter("funcion");
        String[] parts = peliculaHora.split("-");
        String nombrePelicula = parts[0];
        String hora = parts[1];
        Funcion funcion = Pelicula.buscarFuncion(Pelicula.buscarPelicula(nombrePelicula), hora);
        
        ArrayList<ArrayList<Tiquete>> multiArreglo = new ArrayList<>(); 
        int size = funcion.getListaTiquetes().size()/10;
        for (int i=0;i<size;i++){
            multiArreglo.add(new ArrayList<Tiquete>());
        }
        for (int i=0;i<size;i++){
            for (int j = 0; j < 10; j++) {
                Tiquete tiquete = (Tiquete) funcion.getListaTiquetes().get(j + i*10);
                multiArreglo.get(i).add(tiquete);
            }
        }
        request.setAttribute("multiArreglo",multiArreglo);
        request.setAttribute("peliculaHora",peliculaHora);
        funcion.getSillasDisponibles().remove(5);
        request.setAttribute("sillasDisponibles",funcion.getSillasDisponibles());
        RequestDispatcher view = request.getRequestDispatcher("comprar.jsp");
        view.forward(request, response);
    }    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String peliculaHora =  request.getParameter("funcion");
        String[] parts = peliculaHora.split("-");
        String nombrePelicula = parts[0];
        String hora = parts[1];
        Funcion funcion = Pelicula.buscarFuncion(Pelicula.buscarPelicula(nombrePelicula), hora);
        ArrayList<ArrayList<Tiquete>> multiArreglo = new ArrayList<>(); 
        for (int i = 0; i < funcion.getSala().getCantidadSillas(); i++) {
            if(request.getParameter( "sillas" ) != null){
                
            }
        }
        RequestDispatcher view = request.getRequestDispatcher("comprar.jsp");
        view.forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
