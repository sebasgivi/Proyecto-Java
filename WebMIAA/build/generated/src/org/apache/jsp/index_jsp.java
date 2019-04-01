package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>MeliPelis</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("                <table width=\"100%\" style=\" background-color: darkorange\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td width=\"80%\">\n");
      out.write("                            <h1>MeliPelis</h1>\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\" text-align: center\">\n");
      out.write("                            <form action=\"Formulario.jsp\" >\n");
      out.write("                                <input type=\"submit\" align=\"right\" name=\"Log in\" id=\"Log in\" value=\"Log in\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <div id=\"body\"> \n");
      out.write("                </table>    ");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("      body {\n");
      out.write("          background-color:#504C4B\n");
      out.write("      }\n");
      out.write("      table {\n");
      out.write("          background-color: #D0D0D0;\n");
      out.write("          color: #000 ;\n");
      out.write("          width: content-box}\n");
      out.write("      </style>\n");
      out.write("      <body >\n");
      out.write("      <div>\n");
      out.write("        <table >\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"70%\">\n");
      out.write("                    <h2>Peliculas actuales:</h2>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"10%\">\n");
      out.write("                <td><label for=\"buscador\"> buscador: </label></td>\n");
      out.write("                <td width=\"20%\"><input style=\" text-align: right \" type=\"text\" placeholder=\"Q\" name=\"buscador\" id=\"buscador\"></td>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table >\n");
      out.write("        <table width=\"100%\" style=\" align-content: center\">\n");
      out.write("            <tr>\n");
      out.write("                <td width =\" 25%\" >\n");
      out.write("                    <form method=\"POST\" action=\"./Index\">\n");
      out.write("                        <input type=\"button\" value=\"Peli1\" >\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td width =\" 25%\">\n");
      out.write("                    <form method=\"POST\" action=\"./Index\">\n");
      out.write("                        <input type=\"button\" value=\"Peli2\" >\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td width =\" 25%\">\n");
      out.write("                    <form method=\"POST\" action=\"./Index\">\n");
      out.write("                        <input type=\"button\" value=\"Peli3\" >\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td width=\"25%\" >\n");
      out.write("                    <form method=\"POST\" action=\"./Index\">\n");
      out.write("                        <input type=\"button\" value=\"Peli4\" >\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("</div>\n");
      out.write("<p class=\"footer\" style=\"color: whitesmoke\">Developed by: {Kno,Mello&ElPuto} </p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
