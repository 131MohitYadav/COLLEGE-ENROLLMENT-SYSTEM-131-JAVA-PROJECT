package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mohit.dao.Users2DAO;
import com.mohit.bean.Users2Bean;

public final class finduser2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Faculty Login Help - College Enrollment System</title>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("         \n");
      out.write("     <!-- FontAwesome Icons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        /* Gradient Background */\n");
      out.write("             \n");
      out.write("               * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            color: black;\n");
      out.write("                   background: linear-gradient(to right, #ff7e5f, #feb47b);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        .navbar {\n");
      out.write("            margin:0px;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 75px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-center;\n");
      out.write("            padding: 0 50px;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("            gap:40px;\n");
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
      out.write("/*        \n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("              background: linear-gradient(to right, #4facfe, #00f2fe);\n");
      out.write("\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }*/\n");
      out.write("\n");
      out.write("        /* Centered Box with Lined Gradient */\n");
      out.write("        .container {\n");
      out.write("            width: 50%;\n");
      out.write("            background: linear-gradient(to left, #ff7e5f, #feb47b);\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 15px;\n");
      out.write("            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);\n");
      out.write("            text-align: center;\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            margin: 80px auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Title Styling */\n");
      out.write("        h2 {\n");
      out.write("            color: #ffffff;\n");
      out.write("            text-shadow: 2px 2px 8px #ff5733;\n");
      out.write("            font-size: 26px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Form Styling */\n");
      out.write("        form {\n");
      out.write("            margin:20px auto ;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #ffffff;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            padding: 8px;\n");
      out.write("            width: 220px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            padding: 10px 18px;\n");
      out.write("            border: none;\n");
      out.write("            background-color: #ff9800;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #e65100;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Table Styling */\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            box-shadow: 0 0 15px rgba(0, 0, 0, 0.3);\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #ff9800;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Back Button */\n");
      out.write("        .back-btn {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn button {\n");
      out.write("            padding: 12px 25px;\n");
      out.write("            color: white;\n");
      out.write("            background-color: #3498db;\n");
      out.write("            font-weight: bold;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-size: 16px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .back-btn button:hover {\n");
      out.write("            background-color: #1e88e5;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        h3{\n");
      out.write("            margin: 10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>🔍 Faculty Login Help</h2>\n");
      out.write("\n");
      out.write("        <!-- Search Form -->\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <label for=\"sid\">Enter Login ID:</label>\n");
      out.write("            <input type=\"text\" id=\"lid\" name=\"lid\" required>\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        ");

            // Retrieve the Login ID from the request
            String lidStr = request.getParameter("lid");

            if (lidStr != null && !lidStr.isEmpty()) {
                try {
                    int lid = Integer.parseInt(lidStr);

                    // Call findById() method
                    Users2DAO studentDAO = new Users2DAO();
                    Users2Bean student = studentDAO.findById(lid);

                    // If student exists
                    if (student.getLid() != 0) {
        
      out.write("\n");
      out.write("                    <h3>Faculty Account Details</h3>\n");
      out.write("                    <table>\n");
      out.write("                       <tr><th>Name</th><td>");
      out.print( student.getName() );
      out.write("</td></tr>\n");
      out.write("                       <tr><th>Username</th><td>");
      out.print( student.getUsername() );
      out.write("</td></tr>\n");
      out.write("                       <tr><th>Password</th><td>");
      out.print( student.getPassword() );
      out.write("</td></tr>\n");
      out.write("                    </table>\n");
      out.write("        ");

                    } else {
                        out.println("<p>❌ Faculty Not Found! Please check your ID.</p>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<p>⚠️ Invalid Login ID! Please enter a valid number.</p>");
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Home Page Button -->\n");
      out.write("        <div class=\"back-btn\">\n");
      out.write("            <button><a href=\"Index.jsp\">🏠 Back to Home</a></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        <!-- Footer Section -->\n");
      out.write("<footer style=\"background-color: rgba(0, 0, 0, 0.9); color: white; text-align: center; padding: 20px 0; margin-top: 260px;\">\n");
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
      out.write("        \n");
      out.write("<!--          background: linear-gradient(to right, #ff7e5f, #feb47b);-->\n");
      out.write("        \n");
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
