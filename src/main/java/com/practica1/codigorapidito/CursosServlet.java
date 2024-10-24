package com.practica1.codigorapidito;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class CursosServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCurso = request.getParameter("nombreCurso");
        String descripcionCurso = request.getParameter("descripcionCurso");
        String creditosCurso = request.getParameter("creditosCurso");

        // Lógica para procesar los datos del curso
        
        response.sendRedirect("success.html");
    }
}
