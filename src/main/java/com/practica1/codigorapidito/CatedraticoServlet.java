package com.practica1.codigorapidito;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class CatedraticoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCatedratico = request.getParameter("nombreCatedratico");
        String apellidoCatedratico = request.getParameter("apellidoCatedratico");
        String telefonoCatedratico = request.getParameter("telefonoCatedratico");
        String especialidad = request.getParameter("especialidad");

        // Lógica para procesar los datos del catedrático
        
        response.sendRedirect("success.html");
    }
}


