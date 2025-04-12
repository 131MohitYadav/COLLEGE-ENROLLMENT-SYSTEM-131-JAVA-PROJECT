package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mohit.bean.FacultyBean;
import java.util.ArrayList;
import com.mohit.dao.FacultyDAO;

public final class viewfaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Student Data</title>\n");
      out.write("    <style>\n");
      out.write("        /* General styling */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: antiquewhite;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            padding-top: 20px;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Styling the table */\n");
      out.write("        table {\n");
      out.write("            width: 90%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background-color: blanchedalmond;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("            max-width: 150px; /* Adjust column width */\n");
      out.write("            white-space: nowrap;\n");
      out.write("            overflow: hidden;\n");
      out.write("            text-overflow: ellipsis;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: #ddd;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Button styling */\n");
      out.write("        button, a {\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("            display: inline-block;\n");
      out.write("            text-align: center;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Light blue Enroll button */\n");
      out.write("        .enroll-btn a {\n");
      out.write("            background-color: blue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .enroll-btn a:hover {\n");
      out.write("            background-color: #87ceeb;\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Edit button - Blue */\n");
      out.write("        .edit-btn {\n");
      out.write("            background-color: blue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .edit-btn:hover {\n");
      out.write("            background-color: darkblue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Delete button - Red */\n");
      out.write("        .delete-btn {\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .delete-btn:hover {\n");
      out.write("            background-color: darkred;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .enroll-btn {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>ALL FACULTY DATA</h1>\n");
      out.write("\n");
      out.write("    <div class=\"enroll-btn\">\n");
      out.write("<!--        <button><a href=\"registerFaculty.jsp\">Enroll New Faculty</a></button>-->\n");
      out.write("          <button><a href=\"Index.jsp\">Home Page</a></button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>SID</th>\n");
      out.write("            <th>NAME</th>\n");
      out.write("            <th>GENDER</th>\n");
      out.write("            <th>D.O.B</th>\n");
      out.write("            <th>HIRE_DATE</th>\n");
      out.write("            <th>EMAIL</th>\n");
      out.write("            <th>DEPARTMENT_N</th>\n");
      out.write("            <th>SALARY</th>\n");
      out.write("            <th>DESIGNATION</th>\n");
      out.write("            <th>EDIT</th>\n");
      out.write("            <th>DELETE</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

        // Step 1: Create an Object of StudentDAO class
        FacultyDAO sd = new FacultyDAO();
        ArrayList<FacultyBean> all = sd.findAll();
        
        for(FacultyBean sb : all) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(sb.getFid() );
      out.write("</td>\n");
      out.write("            <td title=\"");
      out.print(sb.getName());
      out.write('"');
      out.write('>');
      out.print(sb.getName().length() > 15 ? sb.getName().substring(0, 15) + "..." : sb.getName() );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(sb.getGender() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(sb.getDob() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(sb.getHiredate() );
      out.write("</td>\n");
      out.write("            <td title=\"");
      out.print(sb.getEmail());
      out.write('"');
      out.write('>');
      out.print(sb.getEmail().length() > 15 ? sb.getEmail().substring(0, 15) + "..." : sb.getEmail() );
      out.write("</td>\n");
      out.write("             <td title=\"");
      out.print(sb.getDept());
      out.write('"');
      out.write('>');
      out.print(sb.getDept().length() > 11 ? sb.getDept().substring(0, 11) + "..." : sb.getDept() );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(sb.getSalary() );
      out.write("</td>\n");
      out.write("            <td title=\"");
      out.print(sb.getDesi());
      out.write('"');
      out.write('>');
      out.print(sb.getDesi().length() > 15 ? sb.getDesi().substring(0, 15) + "..." : sb.getDesi() );
      out.write("</td>\n");
      out.write("            \n");
      out.write("            <td><a class=\"edit-btn\" href=\"editform.jsp?sid=");
      out.print(sb.getFid() );
      out.write("\">EDIT</a></td>\n");
      out.write("            <td><a class=\"delete-btn\" href=\"delete.jsp?sid=");
      out.print(sb.getFid() );
      out.write("\">DELETE</a></td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    \n");
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
