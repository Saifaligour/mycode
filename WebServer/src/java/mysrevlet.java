

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/mysrevlet"})
public class mysrevlet extends HttpServlet {
 
 public int sub(int v3,int v4)
 {
     int a;
    a=v3-v4;
    return a;
 }
     public int sum(int v1 ,int v2)
{
   int a;
    a=v1+v2;
    return a;
}
    public int mul(int v5 ,int v6)
{
   int a;
    a=v5*v6;
    return a;
}
      public int div(int v7 ,int v8)
{
   int a;
    a=v7/v8;
    return a;
}
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
        try (PrintWriter out = response.getWriter()) {
             int v1= Integer.parseInt(request.getParameter("n1"));
             int v2= Integer.parseInt(request.getParameter("n2"));
              int v3= Integer.parseInt(request.getParameter("n1"));
             int v4= Integer.parseInt(request.getParameter("n2"));
               int v5= Integer.parseInt(request.getParameter("n1"));
             int v6= Integer.parseInt(request.getParameter("n2"));
               int v7= Integer.parseInt(request.getParameter("n1"));
             int v8= Integer.parseInt(request.getParameter("n2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculater</title>");            
            out.println("</head>");
            out.println("<body bgcolor='green'>");
            out.println("<h4> Addition is :" +sum(v1,v2)+ "<br/>subtration is :"+sub(v3,v4)+"</br> multiplication is :"+mul(v5,v6)+
            "<br/>divison is :"+ div(v7,v8) + "</h4>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </edito
            }


