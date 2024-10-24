package com.practica1.codigorapidito;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class GradoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreGrado = request.getParameter("nombreGrado");
        String seccion = request.getParameter("seccion");
        String anioEscolar = request.getParameter("anioEscolar");

        // Lógica para procesar los datos del grado
        
        response.sendRedirect("success.html");
    }
}

