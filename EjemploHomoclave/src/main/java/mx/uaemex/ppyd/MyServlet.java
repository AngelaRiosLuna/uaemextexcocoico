package mx.uaemex.ppyd;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        String nombre= req.getParameter("nombre");
        String apaterno = req.getParameter("apaterno");
       String amaterno = req.getParameter("amaterno");
        String aaaa = req.getParameter("aaaa");
        String mm = req.getParameter("mm");
        String dd = req.getParameter("dd");
        
        String subnombre = nombre.substring(0,2);
        String subapaterno = apaterno.substring(0, 1);
        String subamaterno = amaterno.substring(0, 1);
        String subaaaa = aaaa.substring(2,4);
String rfc = subnombre + subapaterno + subamaterno + subaaaa + mm + dd;
       
        PrintWriter out = res.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("<title> Calculo RFC </title>");
	out.println("</head>");
	out.println("<body>");
        out.println("<h1 align = \"center\">    CALCULO RFC </h1>");
	out.println("<h1 align = \"center\"> Tu RFC es: </h1>");
        out.println("<h1 align = \"center\"> "+rfc+" </h1>");
   
	out.println("<a href=\"index.html\">Regresar</a>");
	out.println("</body>");
	out.println("</html>");
 
        out.close();
    }
}