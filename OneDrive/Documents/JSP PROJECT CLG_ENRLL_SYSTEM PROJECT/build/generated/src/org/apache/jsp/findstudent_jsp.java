package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mohit.dao.StudentDAO;
import com.mohit.bean.StudentBean;
import com.mohit.dao.FacultyDAO;
import com.mohit.bean.FacultyBean;

public final class findstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Search Student</title>\n");
      out.write("    \n");
      out.write("     <!-- FontAwesome Icons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Ionicons for Social Media Icons -->\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/@ionic/core/dist/ionic/ionic.esm.js\"></script>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        /* General Page Styling */\n");
      out.write("        \n");
      out.write("          * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            color: black;\n");
      out.write("               background: linear-gradient(to right, #00c6ff, #0072ff);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            margin:0px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 75px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            padding: 0 50px;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            color: darkorange;\n");
      out.write("            font-size: 35px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul {\n");
      out.write("            display: flex;\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li {\n");
      out.write("            margin: 0 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            font-weight: bold;\n");
      out.write("            transition: 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .menu ul li a:hover {\n");
      out.write("            color: orange;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Search Box */\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            background: orange;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        .btn30{\n");
      out.write("            background-color: white;\n");
      out.write("            color: blue;\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            margin-left: 280px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background: white;\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        .btn30:hover{\n");
      out.write("            background-color: blue;\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        /* Form Styling */\n");
      out.write("        form {\n");
      out.write("            background: lightskyblue;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            display: inline-block;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-right: 10px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            padding: 8px;\n");
      out.write("            width: 200px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border: none;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Table Styling */\n");
      out.write("        table {\n");
      out.write("            width: 60%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: orange;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Message Styling */\n");
      out.write("        p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .btn20 button{\n");
      out.write("            \n");
      out.write("            padding: 10px 25px;\n");
      out.write("            color: white;\n");
      out.write("            background-color: lightskyblue;\n");
      out.write("            font-weight:bold;\n");
      out.write("            border: 3px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            border: none;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .btn20 a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 15px;\n");
      out.write("            color:white;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .btn20 button:hover{\n");
      out.write("            background-color: blue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        h3{\n");
      out.write("            color:black;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-align: center;\n");
      out.write("            margin:10px;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            text-shadow:2px 2px 10px red;\n");
      out.write("            color:white;\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 100px;\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .fp{\n");
      out.write("            margin: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .pr {\n");
      out.write("    margin: 20px auto;  /* Centering the div horizontally */\n");
      out.write("    padding: 15px;      /* Slightly more padding for better spacing */\n");
      out.write("    width: 700px;       /* Keeping the width same */\n");
      out.write("        background: linear-gradient(to left, #00c6ff, #0072ff);\n");
      out.write("    border-radius: 15px;\n");
      out.write("    border: none;\n");
      out.write("    text-align: center; \n");
      out.write("    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2); \n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <!-- Navbar -->\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <div class=\"logo\">H . V . U </div>\n");
      out.write("        \n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Index.jsp\"><i class=\"fa-solid fa-home\"></i> HOME</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa-solid fa-align-left\"></i> ABOUT</a></li>\n");
      out.write("                <li><a href=\"findstudent.jsp\"><i class=\"fa-brands fa-usps\"></i> PROFILE</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa-solid fa-paintbrush\"></i> ADMISSION</a></li>\n");
      out.write("                <li><a href=\"help.jsp\"><i class=\"fa-solid fa-address-book\"></i> HELP</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!--            <input class=\"srch\" type=\"search\" placeholder=\"Type To Search\">-->\n");
      out.write("<a href=\"Facultylogin.jsp\" class=\"btn30\">FACULTY LOGIN</a>\n");
      out.write("<a href=\"Admin.jsp\" class=\"btn\">ADMIN LOGIN</a>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class='pr'>\n");
      out.write("    <h2>CHECK STUDENT PROFILE</h2>\n");
      out.write("\n");
      out.write("    <!-- Search Form -->\n");
      out.write("    <div class=\"fp\">\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <label for=\"sid\">Enter Student ID:</label>\n");
      out.write("        <input type=\"text\" id=\"sid\" name=\"sid\" required>\n");
      out.write("        <input type=\"submit\" value=\"Search\">\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    ");

        // Retrieve the Student ID from the request
        String sidStr = request.getParameter("sid");

        if (sidStr != null && !sidStr.isEmpty()) {
            try {
                int sid = Integer.parseInt(sidStr);

                // Call findById() method
                StudentDAO studentDAO = new StudentDAO();
                StudentBean student = studentDAO.findById(sid);

                // If student exists (check if sid is not 0)
                if (student.getSid() != 0) {
    
      out.write("\n");
      out.write("                <h3>Student Details</h3>\n");
      out.write("                <table>\n");
      out.write("<!--                   <tr><th>Student ID</th><td>");
      out.print( student.getSid() );
      out.write("</td></tr>-->\n");
      out.write("                   <tr><th>Name</th><td>");
      out.print( student.getName() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Enrollment</th><td>");
      out.print( student.getEnroll() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Enrollment Date</th><td>");
      out.print( student.getEnrolld() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Date of Birth</th><td>");
      out.print( student.getDob() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Email</th><td>");
      out.print( student.getEmail() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Course</th><td>");
      out.print( student.getCourse() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>College</th><td>");
      out.print( student.getClg() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>City</th><td>");
      out.print( student.getCity() );
      out.write("</td></tr>\n");
      out.write("                </table>\n");
      out.write("    ");

                } else {
                    out.println("<p>Student Not Found!</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p>Invalid Student ID! Please enter a number.</p>");
            }
        }
    
      out.write("\n");
      out.write("<!--    <div class=\"btn20\">\n");
      out.write("    <button><a href=\"Index.jsp\"/>Home Page</button>\n");
      out.write("    </div>\n");
      out.write("    -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h2>CHECK FACULTY PROFILE</h2>\n");
      out.write("\n");
      out.write("    <!-- Search Form -->\n");
      out.write("    <div class=\"fp\">\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <label for=\"fid\">Enter Student ID:</label>\n");
      out.write("        <input type=\"text\" id=\"fid\" name=\"fid\" required>\n");
      out.write("        <input type=\"submit\" value=\"Search\">\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    ");

        // Retrieve the Student ID from the request
        String fidStr = request.getParameter("fid");

        if (fidStr != null && !fidStr.isEmpty()) {
            try {
                int fid = Integer.parseInt(fidStr);

                // Call findById() method
                FacultyDAO fDAO = new FacultyDAO();
                FacultyBean faculty = fDAO.findById(fid);

                // If student exists (check if sid is not 0)
                if (faculty.getFid() != 0) {
    
      out.write("\n");
      out.write("                <h3>Faculty Details</h3>\n");
      out.write("                <table>\n");
      out.write("<!--                   <tr><th>Student ID</th><td>");
      out.print( faculty.getFid() );
      out.write("</td></tr>-->\n");
      out.write("                   <tr><th>Name</th><td>");
      out.print( faculty.getName() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Gender</th><td>");
      out.print( faculty.getGender() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Dob</th><td>");
      out.print( faculty.getDob() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Hiredate</th><td>");
      out.print( faculty.getHiredate() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Email</th><td>");
      out.print( faculty.getEmail() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Department Name</th><td>");
      out.print( faculty.getDept() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Salary</th><td>");
      out.print( faculty.getSalary() );
      out.write("</td></tr>\n");
      out.write("                   <tr><th>Designation</th><td>");
      out.print( faculty.getDesi() );
      out.write("</td></tr>\n");
      out.write("                </table>\n");
      out.write("    ");

                } else {
                    out.println("<p>Faculty Not Found!</p>");
                }
            } catch (NumberFormatException e) {
                out.println("<p>Invalid Faculty ID! Please enter a number.</p>");
            }
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  <!-- Footer Section -->\n");
      out.write("<footer style=\"background-color: rgba(0, 0, 0, 0.9); color: white; text-align: center; padding: 20px 0; margin-top: 65px;\">\n");
      out.write("    <div style=\"max-width: 1200px; margin: auto; display: flex; flex-direction: column; align-items: center;\">\n");
      out.write("        \n");
      out.write("        <p style=\"margin: 10px 0; color:white;\">&copy; 2025 H.V.U College. All Rights Reserved.</p>\n");
      out.write("        \n");
      out.write("        <div style=\"display: flex; gap: 15px;\">\n");
      out.write("            <a href=\"#\" style=\"color: white; text-decoration: none;\">Privacy Policy</a> |\n");
      out.write("            <a href=\"#\" style=\"color: white; text-decoration: none;\">Terms of Service</a> |\n");
      out.write("            <a href=\"contact.jsp\" style=\"color: white; text-decoration: none;\">Contact Us</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"social-icons\" style=\"margin-top: 10px;\">\n");
      out.write("            <a href=\"https://www.facebook.com\" style=\"color: white; margin: 0 10px;\"><i class=\"fa-brands fa-facebook\"></i></a>\n");
      out.write("            <a href=\"https://www.instagram.com\" style=\"color: white; margin: 0 10px;\"><i class=\"fa-brands fa-instagram\"></i></a>\n");
      out.write("            <a href=\"https://www.twitter.com\" style=\"color: white; margin: 0 10px;\"><i class=\"fa-brands fa-twitter\"></i></a>\n");
      out.write("            <a href=\"https://www.linkedin.com\" style=\"color: white; margin: 0 10px;\"><i class=\"fa-brands fa-linkedin\"></i></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
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
