package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>STUDENT SIGN UP HERE</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("\n");
      out.write("                    * {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Navigation Bar */\n");
      out.write("            .navbar {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 75px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.7);\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                padding: 0 50px;\n");
      out.write("                z-index: 1000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo {\n");
      out.write("                color: darkorange;\n");
      out.write("                font-size: 35px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu ul {\n");
      out.write("                display: flex;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu ul li {\n");
      out.write("                margin: 0 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu ul li a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                transition: 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .menu ul li a:hover {\n");
      out.write("                color: orange;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                background: orange;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 8px 15px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                background: white;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Body & Form Centering */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background: linear-gradient(to right, #ff9966, #ff5e62);\n");
      out.write("\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column; /* Navbar ke baad content aaye */\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0;\n");
      out.write("                padding-top: 80px; /* Navbar ke neeche space dene ke liye */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            .form {\n");
      out.write("                width: 360px;\n");
      out.write("                background: rgba(0, 0, 0, 0.8);\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: white;\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            .form h2 {\n");
      out.write("                background: white;\n");
      out.write("                color: black;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("            .form h2:hover {\n");
      out.write("                background: orange;\n");
      out.write("            }\n");
      out.write("            .form input {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 8px;\n");
      out.write("                margin-top: 15px;\n");
      out.write("                border: none;\n");
      out.write("                border-bottom: 1px solid orange;\n");
      out.write("                background: transparent;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .form input::placeholder {\n");
      out.write("                color: rgba(255, 255, 255, 0.7);\n");
      out.write("            }\n");
      out.write("            .btnn {\n");
      out.write("                width: 100%;\n");
      out.write("                background: orange;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            .btnn:hover {\n");
      out.write("                background: white;\n");
      out.write("                color: orange;\n");
      out.write("            }\n");
      out.write("            .form a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("            }            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("            </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("             <!-- Navbar -->\n");
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
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"form\">\n");
      out.write("            <h2> Student Signup Here</h2>\n");
      out.write("            <form action=\"saveuser.jsp\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"uid\" placeholder=\"Enter Login Id\" required>\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Enter Name\" required>\n");
      out.write("                <input type=\"text\" name=\"un\" placeholder=\"Enter Username\" required>\n");
      out.write("                <input type=\"password\" name=\"ps\" placeholder=\"Enter Password\" required>\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Enter email\">\n");
      out.write("                <input type=\"number\" name=\"mobile\" placeholder=\"Enter Mobile No\">\n");
      out.write("                <button type=\"submit\" class=\"btnn\">Sign Up</button>\n");
      out.write("            </form>\n");
      out.write("            <p style=\"margin:10px;\"> Already have an account?</p>\n");
      out.write("            <button class=\"btnn\" onclick=\"window.location.href='Index.jsp'\">Sign In</button>\n");
      out.write("            <p style=\"color: red ; margin:10px;\">NOTE : Remember Your Login Id</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("                           \n");
      out.write(" <!-- Footer Section -->\n");
      out.write("<footer style=\"background-color: rgba(0, 0, 0, 0.9); color: white; text-align: center; padding: 20px 0; margin-top: 70px; width: 100%;\">\n");
      out.write("    <div style=\"max-width: 100%; margin: auto; display: flex; flex-direction: column; align-items: center;\">\n");
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
