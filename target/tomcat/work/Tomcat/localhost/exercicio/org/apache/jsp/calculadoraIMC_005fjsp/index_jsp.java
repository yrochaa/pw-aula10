/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-10 00:26:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.calculadoraIMC_005fjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Calculando IMC</title>\r\n");
      out.write("    <h1 class=\"heading\">Calculando IMC</h1>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<form name=\"imcForm\" id=\"imcForm\" action=\"#\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-offset-2 col-md-8 col-sm-12 text-center\">\r\n");
      out.write("<title>Calculadora IMC</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <form name=\"imcForm\" id=\"imcForm\" action=\"#\">\r\n");
      out.write("     <p>\r\n");
      out.write("    <p><br/><br/>\r\n");
      out.write("    Altura (cm)<br/>\r\n");
      out.write("        <input type=\"text\" id=\"altura\" name=\"altura\" />\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>Peso (kg) <br />\r\n");
      out.write("        <input type=\"text\" id=\"peso\" name=\"peso\" />\r\n");
      out.write("    </p>\r\n");
      out.write("    <p>\r\n");
      out.write("    <label> \r\n");
      out.write("        <input type=\"radio\" name=\"sexo\" value=\"op??o\" id=\"sexo_0\" />\r\n");
      out.write("    Masculino</label>\r\n");
      out.write("    <br />\r\n");
      out.write("    <label>\r\n");
      out.write("        <input type=\"radio\" name=\"sexo\" value=\"op??o\" id=\"sexo_1\" />\r\n");
      out.write("    Feminino</label>\r\n");
      out.write("    </div>\r\n");
      out.write("<p><input class=css_btn_class name=\"Enviar\" type=\"submit\" value=\"Calcular\" onclick=\"calculadoraIMC_jsp\" />\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");

String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");

alturaStr = alturaStr == null ? "1" : alturaStr;                    
pesoStr = pesoStr == null ? "0" : pesoStr;

double altura = Double.parseDouble(alturaStr);
double peso = Double.parseDouble(pesoStr);
double quadrado = (altura*altura);

double calculo = (10000*peso/quadrado);

String resultado = "";

if(calculo<17){
            resultado = "VocÃª estÃ¡ MUITO ABAIXO DO PESO ! IMC " + calculo;
        }
	else if(calculo<=17 && calculo<=18.5){
             resultado = "VocÃª estÃ¡ ABAIXO DO PESO ! IMC " + calculo;
        }
       else if(calculo>=18.5 && calculo<24.9){
            resultado = "VocÃª estÃ¡ com o PESO NORMAL ! IMC: " + calculo;
        }
        else if(calculo>=25 && calculo<29.9) {
            resultado = "VocÃª estÃ¡ ACIMA DO PESO ! IMC: " + calculo;
        }
        else if(calculo>=30 && calculo<34.9) {
            resultado = "VocÃª estÃ¡ com OBESIDADE 1 ! IMC: " + calculo;
        }
		    else if(calculo>=35 && calculo<39.9) {
            resultado = "VocÃª estÃ¡ com OBESIDADE 2 (severa)! IMC: " + calculo;
        }
        else if (calculo>=40){
       resultado = "VocÃª estÃ¡ com OBESIDADE 3 (mÃ³rbida)! IMC: " + calculo;
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"alert\"> ");
      out.print(resultado);
      out.write(" </div>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("  \r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
