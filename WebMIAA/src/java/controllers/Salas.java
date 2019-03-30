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
import models.Sala;

@WebServlet(urlPatterns = {"/Salas"})
public class Salas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Sala> listaSala = new ArrayList<Sala>();
        if (null != session.getAttribute("Salas")) {
            listaSala = (ArrayList<Sala>) session.getAttribute("Salas");
        }
        request.setAttribute("listaSala", listaSala);
        RequestDispatcher view = request.getRequestDispatcher("salas.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        List<Sala> listaSala = new ArrayList<Sala>();
        if (null != session.getAttribute("Salas")) {
            listaSala = (ArrayList<Sala>) session.getAttribute("Salas");
        }
        int numSillas = Integer.parseInt(request.getParameter("numSillas"));
        int numSala = Integer.parseInt(request.getParameter("numSala"));
        if (numSala == 0) {
        } else {
            Sala p = new Sala(numSillas, numSala);
            listaSala.add(p);
            session.setAttribute("Salas", listaSala);
            request.setAttribute("listaSala", listaSala);
            RequestDispatcher view = request.getRequestDispatcher("salas.jsp");
            view.forward(request, response);
        }
    }
}
