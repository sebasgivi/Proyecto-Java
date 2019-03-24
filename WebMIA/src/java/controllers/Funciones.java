package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Funcion;
import models.Pelicula;
import models.Sala;

@WebServlet(name = "Funciones", urlPatterns = {"/Funciones"})
public class Funciones extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Funcion> funciones_ = new ArrayList<Funcion>();
        if (null != session.getAttribute("Funciones")) {
            funciones_ = (ArrayList<Funcion>) session.getAttribute("Funciones");
        }
        request.setAttribute("funciones_", funciones_);
        RequestDispatcher view = request.getRequestDispatcher("funciones.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Funcion> funciones_ = new ArrayList<Funcion>();
        if (null != session.getAttribute("Funciones")) {
            funciones_ = (ArrayList<Funcion>) session.getAttribute("Funciones");
        }

        Pelicula pelicula = Pelicula.buscarPelicula(request.getParameter("pelicula"));
        Sala sala = Sala.buscarSala(Integer.parseInt(request.getParameter("numSala")));
        String horaDeFuncion = request.getParameter("horaDeFuncion");
        String formato = request.getParameter("formato");
        Funcion p = new Funcion(pelicula, sala, horaDeFuncion, formato);
        funciones_.add(p);
        session.setAttribute("Funciones", funciones_);
        request.setAttribute("funciones_", funciones_);
        RequestDispatcher view = request.getRequestDispatcher("funciones.jsp");

        view.forward(request, response);
    }
}
