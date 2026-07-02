package Modelo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/VentaServlet")
public class VentaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("nuevaVenta.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cliente = request.getParameter("idCliente");
        String total = request.getParameter("total");

        System.out.println("Cliente: " + cliente);
        System.out.println("Total: " + total);

        response.sendRedirect("VentaServlet");
    }
}