package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mohit.dao.StudentDAO;
import com.mohit.bean.StudentBean;

public final class save1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
        
        int sid = Integer.parseInt(request.getParameter("sid"));
        String name = request.getParameter("name");
        String enroll = request.getParameter("enroll");
         String enrolld = request.getParameter("enrolld");
             String dob = request.getParameter("dob");
              String email = request.getParameter("email");
            int mobile = Integer.parseInt(request.getParameter("mobile"));
             String clg = request.getParameter("clg");
              String city = request.getParameter("City");
            // Create StudentBean object
    StudentBean sb = new StudentBean();
    sb.setSid(sid);
    sb.setName(name);
    sb.setEnroll(enroll);
    sb.setEnrolld(enrolld);
    sb.setDob(dob);
    sb.setEmail(email);
    sb.setMobile(mobile);
    sb.setClg(clg);
    sb.setCity(city);
    
    
    // Call DAO to insert data
    StudentDAO sd = new StudentDAO();
    int result = sd.addStudent(sb);
    
    // Redirect to addstudent.jsp with success message
    if (result > 0) {
        response.sendRedirect("addStudent.jsp?message=success");
    } else {
        out.println("<h3 style='color:red;'>Error adding student. Try again!</h3>");
    }   



      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
