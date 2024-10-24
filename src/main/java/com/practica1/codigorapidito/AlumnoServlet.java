package com.practica1.codigorapidito;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AlumnoServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Capturar los parámetros enviados desde el formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String carne = request.getParameter("carne");
        String telefono = request.getParameter("telefono");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String edad = request.getParameter("edad");

        // Lógica para procesar los datos del alumno
        // Aquí puedes agregar lógica para almacenar la información en la base de datos

        // Redirigir a una página de éxito o mostrar un mensaje
        response.sendRedirect("success.html");
    }
}

