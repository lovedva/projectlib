/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.65
 * Generated at: 2016-04-07 16:24:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.startup.UserConfig;
import dto.*;
import model.*;
import java.util.ArrayList;
import control.*;

public final class boardpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>BoardPage -BBS</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
int pagenum=Integer.parseInt(request.getParameter("pn"));
        //当前页数，默认第一页
     ArrayList<Integer> topicuidlist = new ArrayList<Integer>();
     ArrayList<String> topictitlelist = new ArrayList<String>();
     ArrayList<String> usernamelist = new ArrayList<String>();
     ArrayList<Integer> topicreadcountlist = new ArrayList<Integer>();
     
      TopicCheck tc =new TopicCheck(); UserCheck uc=new UserCheck();
      tc.check();   uc.check();
      topictitlelist=tc.getTopictitlelist(); 
      topicuidlist=tc.getTopicuidlist();
      topicreadcountlist=tc.getTopicreadcountlist();
      
      ArrayList<Long> useridlist=uc.getUseridlist();
      ArrayList<Integer> topicidlist=tc.getTopicidlist();
      usernamelist=uc.getUsernamelist();
      
      PageVO pv =new PageVO();
      pv.setCurrentPage(pagenum);
      pv.setTotalRownum(topicidlist.size());   System.out.println("设定总条数："+topicidlist.size());
      pv.getStartPage();  pv.getEndPage();     System.out.println("开始页码："+pv.getStartPage()+"  结束页码："+pv.getEndPage());
      pv.getFirstResult(); pv.getRownumperpage();  System.out.println("开始行位置："+pv.getFirstResult()+"  每页行数："+pv.getRownumperpage());
      
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container pagebody-top\" >\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-12 \">\r\n");
      out.write("    <ul class=\"breadcrumb\" contenteditable=\"false\">\r\n");
      out.write("                <li><a href=\"index.jsp\">Homepage</a> <span class=\"divider\"></span></li>\r\n");
      out.write("        <li class=\"active\">BoardName</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("            <div class=\"media well\">\r\n");
      out.write("                <div class=\"media-body\">\r\n");
      out.write("                   <h4><p><a href=\"#\"  style=\"font-weight: bold;color: #2ecc71\">Notice:</a></p></h4>\r\n");
      out.write("                       <p>Notice here...</p>\r\n");
      out.write("                       <p>Notice here...</p>\r\n");
      out.write("                       <p>Notice here...</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>   <!-- media well -->\r\n");
      out.write("\r\n");
      out.write("            <!--topics-->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\" style=\"padding-top: 10px;\">\r\n");
      out.write("        <div class=\"col-md-12 \" style=\"\">\r\n");
      out.write("                <table class=\"table table-bordered  \">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <th class=\"info\">\r\n");
      out.write("                    <a class=\"btn btn-warning\" href=\"newtopic.jsp?pn=");
      out.print(pagenum );
      out.write("\">New topic</a>\r\n");
      out.write("                        <div class=\"btn-group\">\r\n");
      out.write("                            \r\n");
      out.write("                            <button data-toggle=\"dropdown\" class=\"btn btn-default dropdown-toggle\">Categories <span class=\"caret\"></span></button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><input type=\"radio\" id=\"ID\" name=\"NAME\" value=\"VALUE\"><label for=\"ID\">Category1</label></li>\r\n");
      out.write("                                <li><input type=\"radio\" id=\"ID2\" name=\"NAME\" value=\"VALUE\"><label for=\"ID2\">Category2</label></li>\r\n");
      out.write("                                <li><input type=\"radio\" id=\"ID3\" name=\"NAME\" value=\"VALUE\"><label for=\"ID3\">Category3</label></li>\r\n");
      out.write("                                <!-- Other items -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    ");
String topicbyuser="";  int topicid=0;
                      for (int i=pv.getFirstResult()+1;i<pv.getFirstResult()+pv.getRownumperpage();i++){
                          if (i<topicidlist.size()){
                        	  long a=useridlist.indexOf((long)topicuidlist.get(i)); 
                              topicid=topicidlist.get(i);
                              //       System.out.println("topicuidlist.get(i)= "+topicuidlist.get(i)+" useridlist.indexOf( topicuidlist.get(i))="+useridlist.indexOf((long)topicuidlist.get(i)));
                                     topicbyuser =usernamelist.get((int)a);
                          
                    
                              
      out.write("\r\n");
      out.write("                    \t<tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        <div class=\"col-md-7\">\r\n");
      out.write("                        <a href=\"topicpage.jsp?tid=");
      out.print(topicid);
      out.write("&pn=");
      out.print(pagenum );
      out.write("\">[Category] ");
      out.print(topictitlelist.get(i) );
      out.write(" <span class=\"badge\"> ");
      out.print(tc.getTopicreplyCountlist().get(i));
      out.write("</span></a>\r\n");
      out.write("                             <button class=\" btn btn-default btn-xs\">by ");
      out.print(topicbyuser  );
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>  <div class=\"col-md-3 text-left\">\r\n");
      out.write("                            <button class=\" btn btn-inverse  btn-xs\"> Read:");
      out.print(topicreadcountlist.get(tc.getTopicidlist().indexOf(topicid)) );
      out.write("</button>\r\n");
      out.write("                                <button class=\" btn btn-inverse  btn-xs\">Reply:");
      out.print(tc.getTopicreplyCountlist().get(i) );
      out.write("</button>\r\n");
      out.write("                           </div>\r\n");
      out.write("                           <div class=\"col-md-2\">\r\n");
      out.write("                                <button class=\" btn btn-default  btn-xs\">at 2016-23-34 23:23:34</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                     ");
 } }
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <div class=\" \">\r\n");
      out.write("                <nav class=\"text-center\">\r\n");
      out.write("                \r\n");
      out.write("                ");

              
                
      out.write("\r\n");
      out.write("                    <ul class=\"pagination  pagination-sm\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"boardpage.jsp?pn=");
      out.print(pagenum-1 );
      out.write("\" aria-label=\"Previous\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                            </a>    \r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                        for (int i=pv.getStartPage();i<=pv.getEndPage();i++){   
      out.write("\r\n");
      out.write("                        \t<li ");
if (i==pagenum){
      out.write(" class=\"active\"     ");
} 
      out.write(">\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t<a href=\"boardpage.jsp?pn=");
      out.print(i );
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a>\r\n");
      out.write("                        \t</li>\r\n");
      out.write("                       ");
 }
      out.write("\r\n");
      out.write("                          <li>\r\n");
      out.write("                            <a href=\"boardpage.jsp?pn=");
      out.print(pagenum+1 );
      out.write("\"aria-label=\"Next\">\r\n");
      out.write("                                <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                             ");
if(pv.getPageNums()>5){ 
      out.write(" <li><a href=\"boardpage.jsp?pn=");
      out.print(pv.getPageNums() );
      out.write("\">总页数：\r\n");
      out.write("                          ");
      out.print(pv.getPageNums() );
      out.write("\r\n");
      out.write("                           </a></li> ");
} 
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("               </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "foot.jsp", out, false);
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