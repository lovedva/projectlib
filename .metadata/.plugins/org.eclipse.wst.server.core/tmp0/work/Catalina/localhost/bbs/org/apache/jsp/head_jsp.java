/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2016-04-07 16:09:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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

      out.write("\r\n");
      out.write("<!--<link href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">-->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/dropdowns-enhancement.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/button.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/head.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top \">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\">Project:BBS</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- æå åå®¹-->\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <!-- æå åå®¹-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				//å¤æ­æ¯å¦ç»å½
				User user = (User) request.getSession().getAttribute("user");
				if (user != null) {
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t   <div class=\" navbar-right \">\r\n");
      out.write("                <!--if admin or master\r\n");
      out.write("                <div class=\"navbar-text \" style=\"margin-right: 0px; \">\r\n");
      out.write("                    <a href=\"#\" class=\"navbar-link\">Dashboard</span></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                -->\r\n");
      out.write("                 <div class=\"navbar-text \" style=\"margin-right: 0px; \">\r\n");
      out.write("                    <a href=\"#\" class=\"navbar-link\">");
      out.print(user.getName());
      out.write("<span class=\"badge\"></span></a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"navbar-text \" style=\"margin-right: 40px; \">\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"actions/dologout.jsp\" class=\"navbar-link\">Log out</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t");

					} else { //æªç»å½æ¾ç¤ºç»å½/æ³¨åæç¤º
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"navbar-form navbar-right \">\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/actions/dologin.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\tmethod=\"post\" name=\"LoginForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<button data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-success dropdown-toggle\" data-placeholder=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\tLogin <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu noclose\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><div class=\"col-md-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 20px; margin-left: -5px; margin-top: 4px;\">Login</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group navdropdownform \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon-user\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"InputUsername1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Username\" name=\"username\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group navdropdownform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"icon-key\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"InputPassword1\" placeholder=\"Password\" name=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"btn btn-success navdropdownbtn\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"redirecturl\" value=");
      out.print(request.getRequestURL() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--  Login</button>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" style=\"margin-left: 1px; vertical-align: bottom\">Forget\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpassword?</a>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group\" style=\"margin-right: 10px; margin-left: 5px\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/actions/dosignup.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\tmethod=\"post\" name=\"LoginForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<button data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-info dropdown-toggle\" data-placeholder=\"false\">\r\n");
      out.write("\t\t\t\t\t\t\t\tSign up <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu noclose\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 20px; margin-left: 10px; margin-top: 4px;\">Create\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tan account</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group navdropdownform2\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"exampleInputEmail1\">Email address</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"form-control \" id=\"exampleInputEmail1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Email\" name=\"email\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><div class=\"form-group  navdropdownform2 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"Username\">Username</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Username\" id=\"Username\" class=\"form-control\" name=\"username\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group  navdropdownform2 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"signuppsw\">Password</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control \" id=\"signuppsw\" placeholder=\"Password\" name=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><div class=\"form-group  navdropdownform2 \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<fieldset disabled>\r\n");
      out.write("                                          <label for=\"signuppswrp\">Input password again</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"password\" class=\"form-control  \" id=\"signuppswrp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Password\">\r\n");
      out.write("                                   </fieldset>\r\n");
      out.write("                                          </div>\r\n");
      out.write("                                          </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-info navdropdownbtn2\">Sign up</button>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--collapse here-->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}