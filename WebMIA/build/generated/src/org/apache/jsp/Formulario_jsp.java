package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:#504C4B;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table{\n");
      out.write("                background:#f75e25;\n");
      out.write("                padding:10px;\n");
      out.write("                border:solid 2px #000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td{\n");
      out.write("                padding:5px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <h1>  </h1>\n");
      out.write("        <table cellspacing=\"20px\" align=\"center\" width=\"66%\"border=\"0\" style=\" background-color: darkgray; margin: 2 auto;\" >\n");
      out.write("            <td colspan=\"3\" height=\"20px\" align=\"center\" style=\" background-color:wheat\">\n");
      out.write("                <p>Para acceder a la aplicacion por favor ingrese los datos segun corresponan:</p>\n");
      out.write("            </td>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("\n");
      out.write("                    <form method=\"POST\" action=\"Registro.jsp\">\n");
      out.write("                        <!– acceso al JSP— >\n");
      out.write("                        <table height=\"200px\" width=\"25%\" align=\"center\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"13%\"><label for=\"nombre\">Nombre: </label></td>\n");
      out.write("                                    <td width=\"87%\"><input type=\"text\" placeholder=\"Daniel\" name=\"nombre\" id=\"nombre\" required></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><label for=\"apellido\">Apellido:  </label></td>\n");
      out.write("                                    <td><input type=\"text\" name=\"apellido\" id=\"apellido\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> <label for=\"edad\">Edad:</label></td>\n");
      out.write("                                    <td><select name=\"edad\" id=\"edad\">\n");
      out.write("                                            <option>Menos de 12 </option>\n");
      out.write("                                            <option>Entre 12 y 14 </option>\n");
      out.write("                                            <option>Entre 14 y 18 </option>\n");
      out.write("                                            <option>Mayor de 18 </option>\n");
      out.write("                                        </select>(años)\n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Tecnologías: </td>\n");
      out.write("                                    <td><label>\n");
      out.write("                                            <input type=\"radio\" name=\"tecnologias\" value=\"Java\" id=\"tecnologias_0\">\n");
      out.write("                                            Java</label>\n");
      out.write("                                        <br>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"tecnologias\" value=\"PHP\" id=\"tecnologias_1\">\n");
      out.write("                                            Php</label>\n");
      out.write("                                        <br>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"tecnologias\" value=\"JavaScript\" id=\"tecnologias_2\">\n");
      out.write("                                            JavaScript</label>\n");
      out.write("                                    </td>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"button\" id=\"button\" value=\"Invitado\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                            <p><br>\n");
      out.write("                            </p>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <form action=\"aprender.jsp\">\n");
      out.write("                        <table height=\"120px\" width=\"25%\" style= \" bordercolor:#1AA8EA\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"13%\"><label for=\"usuario\">Usuario: </label></td>\n");
      out.write("                                <td width=\"87%\"><input type=\"text\" name=\"usuario\" id=\"usuario\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><label for=\"contra\">Contraseña: </label></td>\n");
      out.write("                                <td><input type=\"text\" name=\"contra\" id=\"contra\"></td>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"2\" align=\"center\"><input type=\"submit\" name=\"button\" id=\"button\" value=\"Administrador\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        ");
      out.write("</div>\n");
      out.write("<p class=\"footer\" style=\"color: whitesmoke\">Developed by: {Kno,Mello&ElPuto} </p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
