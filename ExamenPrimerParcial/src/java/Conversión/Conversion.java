/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversión;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "Conversion", urlPatterns = {"/Conversion"})
public class Conversion extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        double   num1,   result;
        int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num"));
    operacion = Integer.parseInt(req.getParameter("op"));

    result   =   convertir(num1,operacion);

    out.println("<html>");
    out.println("<head><title>Calculadora Ana</title>"
            + "<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>"
            + "</head>");
    out.println("<body>");
    out.println("<p class=\"Titulo\">El resultado es:</p>");
    out.println("<p class=\"Titulo\">"+  result   +"</p>");
    out.println("<a href=\"index.html\">Regresar</a>");
    out.println("</body>");
    out.println("</html>");
    out.close();
    }

    public   double   convertir(double   num1,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1/20;
        case   2:
            return   num1*20;
        }

    return   result;
        }
    }


