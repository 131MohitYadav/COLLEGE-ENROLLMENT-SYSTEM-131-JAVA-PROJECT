package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mohit.bean.StudentBean;
import com.mohit.dao.StudentDAO;

public final class editform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Student Update Form</title>\n");
      out.write("    <style>\n");
      out.write("        .frm {\n");
      out.write("            margin: auto;\n");
      out.write("            width: 60%;\n");
      out.write("            border-radius: 15px;\n");
      out.write("        }\n");
      out.write("        .frm h1 { text-align: center; }\n");
      out.write("        table {\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 80%;\n");
      out.write("            background-color: lightblue;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        td { padding: 12px; text-align: center; font-weight: bold; }\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            width: 95%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: inset 2px 2px 5px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            font-weight: bold;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            padding: 12px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("            box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.3);\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.4);\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-shadow: 2px 2px 8px blue;\n");
      out.write("            color: lightblue;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1 class=\"head1\">STUDENT UPDATE FORM</h1>\n");
      out.write("\n");

    int sid = Integer.parseInt(request.getParameter("sid"));
    StudentDAO sd = new StudentDAO();
    StudentBean sb = sd.findById(sid);

    if (sb == null) {
        out.println("<h2 style='color:red;'>Student details not found!</h2>");
        return;
    }

      out.write("\n");
      out.write("\n");
      out.write("<form action=\"update.jsp\" method=\"post\">\n");
      out.write("    <table width=\"60%\">\n");
      out.write("        <tr>\n");
      out.write("            <td>SID: </td>\n");
      out.write("            <td><input type=\"text\" name=\"sid\" value=\"");
      out.print( sb.getSid() );
      out.write("\" readonly></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>NAME: </td>\n");
      out.write("            <td><input type=\"text\" name=\"name\" value=\"");
      out.print( sb.getName() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>ENROLLMENT: </td>\n");
      out.write("            <td><input type=\"text\" name=\"enroll\" value=\"");
      out.print( sb.getEnroll() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>ENROLLMENT DATE: </td>\n");
      out.write("            <td><input type=\"text\" name=\"enrolld\" value=\"");
      out.print( sb.getEnrolld() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>D.O.B: </td>\n");
      out.write("            <td><input type=\"text\" name=\"dob\" value=\"");
      out.print( sb.getDob() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>EMAIL: </td>\n");
      out.write("            <td><input type=\"text\" name=\"email\" value=\"");
      out.print( sb.getEmail() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>COURSE: </td>\n");
      out.write("            <td><input type=\"text\" name=\"course\" value=\"");
      out.print( sb.getCourse() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>COLLEGE NAME: </td>\n");
      out.write("            <td><input type=\"text\" name=\"clg\" value=\"");
      out.print( sb.getClg() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>CITY NAME: </td>\n");
      out.write("            <td><input type=\"text\" name=\"city\" value=\"");
      out.print( sb.getCity() );
      out.write("\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>&nbsp;</td>\n");
      out.write("            <td><input type=\"submit\" value=\"Update Student\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
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
