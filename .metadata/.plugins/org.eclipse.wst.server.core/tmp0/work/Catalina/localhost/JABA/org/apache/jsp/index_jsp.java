/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-11-16 06:56:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>JABA</title>\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,maximum-scale=1,minimal-ui\" />\n");
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"mainStyle.css\" /> -->\n");
      out.write("<script src='https://code.jquery.com/jquery-3.4.0.js'></script>\n");
      out.write("<!-- MODAL -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Inter&display=swap\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- RESET -->\n");
      out.write("<link href=\"./css/html5_reset.css\" rel=\"stylesheet\">\n");
      out.write("<!-- HEADER CSS -->\n");
      out.write("<link href=\"./css/header.css\" rel=\"stylesheet\">\n");
      out.write("<!-- SECTION CSS -->\n");
      out.write("<link href=\"./css/section.css\" rel=\"stylesheet\">\n");
      out.write("<!-- FOOTER CSS -->\n");
      out.write("<link href=\"./css/footer.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\"></style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("   $(window).scroll(function(){\n");
      out.write("   var navbar = $(this).scrollTop();\n");
      out.write("   console.log(navbar);\n");
      out.write("   var $header = $('header');\n");
      out.write("   if(navbar > 0){\n");
      out.write("       $header.addClass('activated');\n");
      out.write("   }else{\n");
      out.write("       $header.removeClass('activated');\n");
      out.write("   }\n");
      out.write(" })\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tmargin: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("\tline-height: 1.43;\n");
      out.write("}\n");
      out.write("div {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("input {\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- HEADER -->\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<!-- MAIN -->\n");
      out.write("<style>\n");
      out.write("main {\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmax-width: 100vw;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!--NAVIGATOR -->\n");
      out.write("<style>\n");
      out.write("</style>\n");
      out.write("<!-- SECTION -->\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- ASIDE -->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- ASIDE -->\n");
      out.write("<style>\n");
      out.write("</style>\n");
      out.write("<!--Modal-->\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<!-- FOOTER -->\n");
      out.write("<!-- FOOTER -->\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<!-- MODAL -->\n");
      out.write("<style>\n");
      out.write("/* 모달 전체 세팅 */\n");
      out.write(".modal-dialog.modal-size {\n");
      out.write("\twidth: 444px;\n");
      out.write("\theight: auto;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-content.modal-size {\n");
      out.write("\theight: auto;\n");
      out.write("\tmin-height: 100%;\n");
      out.write("\tborder-radius: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (min-width: 768px) {\n");
      out.write("\t.modal:before {\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\tvertical-align: middle;\n");
      out.write("\t\tcontent: \" \";\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".modal-dialog.modal-size {\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\ttext-align: left;\n");
      out.write("\tvertical-align: middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* 모달 header 세팅 */\n");
      out.write(".modal-header {\n");
      out.write("\tpadding: 32px;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("\tborder-bottom: 1px solid rgba(20, 23, 26, .08);\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-icon {\n");
      out.write("\tdisplay: inline-flex;\n");
      out.write("\tpadding: 16px;\n");
      out.write("\tborder-radius: 16px;\n");
      out.write("\tmargin-bottom: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close {\n");
      out.write("\tcolor: rgba(0, 0, 0, 0.54);\n");
      out.write("\tposition: absolute !important;\n");
      out.write("\ttop: 25px;\n");
      out.write("\tright: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* 모달 body 세팅 */\n");
      out.write(".modal-body {\n");
      out.write("\tflex: 1 1 auto;\n");
      out.write("\tpadding: 32px 32px 16px 32px;\n");
      out.write("\toverflow-y: auto;\n");
      out.write("\t-webkit-overflow-scrolling: touch;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* 모달 footer 세팅 */\n");
      out.write(".modal-footer {\n");
      out.write("\tflex: 0 0 auto;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tpadding: 16px 32px 32px 32px;\n");
      out.write("\talign-items: center;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\tborder-top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btnChk {\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 50px;\n");
      out.write("\tbackground-color: #36727C;\n");
      out.write("\tcolor: white;\n");
      out.write("\tborder-radius: 12px;\n");
      out.write("\tborder: 0;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 1.5rem;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- HEADER -->\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"header_container\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<img src=\"./images/jaba_english_white.png\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t<button class=\"menu_btn\" value=\"LOG IN\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\"\n");
      out.write("\t\tdata-target=\"#LoginModal\">\n");
      out.write("\t\t\t\t<span>LOG IN</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<button class=\"menu_btn\" value=\"SIGN UP\" class=\"btn btn-primary\" data-toggle=\"modal\"\n");
      out.write("\t\tdata-target=\"#registerModal\">\n");
      out.write("\t\t\t\t<span>SIGN UP</span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<button id=\"logoutBtn\">로그아웃</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</header>\n");
      out.write("\t<!-- MODAL -->\n");
      out.write("\t<!-- LOG IN -->\n");
      out.write("\t\t<!-- Modal Basic -->\n");
      out.write("\t<div class=\"modal fade\" id=\"LoginModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-size\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content modal-size\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- modal-header -->\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<div class=\"header-icon\"\n");
      out.write("\t\t\t\t\t\tstyle=\"stroke: rgb(54, 114, 124); background-color: rgba(54, 114, 124, 0.12);\">\n");
      out.write("\t\t\t\t\t\t<svg height=\"32\" viewBox=\"0 0 32 32\" width=\"32\">\n");
      out.write("                     <path\n");
      out.write("\t\t\t\t\t\t\t\td=\"m28 2.66666667-2.6666667 2.66666666m-10.1466666 10.14666667c1.8732867 1.8483505 2.6125307 4.5587607 1.9370876 7.1022582-.6754432 2.5434974-2.6619987 4.5300529-5.2054961 5.2054961-2.54349751.6754431-5.25390769-.0638009-7.1022582-1.9370876-2.77912954-2.8774452-2.73938408-7.4512884.08933045-10.2800029 2.82871452-2.8287145 7.40255775-2.86846 10.28000285-.0893305zm0 0 5.48-5.48m0 0 4 4 4.6666666-4.66666667-4-4m-4.6666666 4.66666667 4.6666666-4.66666667\"\n");
      out.write("\t\t\t\t\t\t\t\tfill=\"none\" stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
      out.write("\t\t\t\t\t\t\t\tstroke-width=\"2.666667\"></path></svg>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"header-title\"\n");
      out.write("\t\t\t\t\t\tstyle=\"font-weight: bold; font-size: 24px;\">\n");
      out.write("\t\t\t\t\t\t<p>Sign in to JABA</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"header-subtitle\">\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tDon't have an account?&nbsp;<a href=\"#\" class=\"register\">Sign\n");
      out.write("\t\t\t\t\t\t\t\tup now</a>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- modal-body -->\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div class=\"text-box\" style=\"font-weight: bold;\">\n");
      out.write("\t\t\t\t\t\t<p>Email address</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"signin-input\" id=\"email\" name=\"email\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-box\">\n");
      out.write("\t\t\t\t\t\t<br> <span style=\"font-weight: bold;\">\n");
      out.write("\t\t\t\t\t\t\tPassword\n");
      out.write("\t\t\t\t\t\t</span> <span style=\"float: right\"> <a href=\"#\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"font-weight: normal;\">Forgot&nbsp;password?</a>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</span> <input type=\"text\" class=\"signin-input\" id=\"pwd\" name=\"pwd\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- modal-footer -->\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btnChk\" id=\"signin\" name=\"signin\">Sign\n");
      out.write("\t\t\t\t\t\tin</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- MODAL -->\n");
      out.write("\t<!-- SIGN UP -->\n");
      out.write("\t<!-- Modal Basic -->\n");
      out.write("\t<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-size\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content modal-size\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- modal-header -->\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<div class=\"header-icon\"\n");
      out.write("\t\t\t\t\t\tstyle=\"stroke: rgb(54, 114, 124); background-color: rgba(54, 114, 124, 0.12);\">\n");
      out.write("\t\t\t\t\t\t<svg height=\"32\" viewBox=\"0 0 32 32\" width=\"32\">\n");
      out.write("                     <g\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"fill: none; fill-rule: evenodd; stroke-linecap: round; stroke-linejoin: round; stroke: rgb(54, 114, 124); stroke-width: 2.66667;\">\n");
      out.write("                     <path\n");
      out.write("\t\t\t\t\t\t\t\td=\"m21.3333333 28v-2.6666667c0-2.9455186-2.3878146-5.3333333-5.3333333-5.3333333h-9.33333333c-2.94551867 0-5.33333334 2.3878147-5.33333334 5.3333333v2.6666667\"></path>\n");
      out.write("                     <circle cx=\"11.333333\" cy=\"9.333333\" r=\"5.333333\"></circle>\n");
      out.write("                     <path d=\"m26.666667 10.666667v8\"></path>\n");
      out.write("                     <path d=\"m30.666667 14.666667h-8\"></path></g></svg>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"header-title\"\n");
      out.write("\t\t\t\t\t\tstyle=\"font-weight: bold; font-size: 20px;\">\n");
      out.write("\t\t\t\t\t\t<p>Sign up to JABA</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"header-subtitle\">\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\tAlready have an account?&nbsp;<a href=\"#\" class=\"register\">Sign\n");
      out.write("\t\t\t\t\t\t\t\tin here</a>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- modal-body -->\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div class=\"text-box\" style=\"font-weight: bold; font-size: 13px;\">\n");
      out.write("\t\t\t\t\t\t<p>Name</p>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"signin-input\" id=\"name\" name=\"name\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"text-box\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<div class=\"text-box\" style=\"font-weight: bold; font-size: 13px;\">\n");
      out.write("\t\t\t\t\t\t\t<p>Mobile number</p>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"signin-input\" id=\"mobile\" name=\"mobile\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"text-box\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-box\" style=\"font-weight: bold; font-size: 13px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Email address</p>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"signin-input\" id=\"emailRegister\" name=\"emailRegister\">\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"emailCheckResult\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text-box\">\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-box\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-weight: bold; font-size: 13px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Password</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"signin-input\" id=\"passwordRegister\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"password\"> <span id=\"passwordRegisterResult\"></span><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"font-size: 11px; font-weight: normal; padding-top: 3px\">Password\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmust be at least 8 characters</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- modal-footer -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btnChk\" id=\"signup\"\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"signup\">Sign up</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- NAVIGATOR -->\n");
      out.write("\t<nav></nav>\n");
      out.write("\t<!-- SECTION -->\n");
      out.write("\n");
      out.write("\t<section id=\"home\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1>\n");
      out.write("\t\t\t\tGRAB whatever<br> you want<br>\n");
      out.write("\t\t\t</h1>\n");
      out.write("\t\t\t<p>order from amazing cafes.</p>\n");
      out.write("\t\t\t<div class=\"search-bar\">\n");
      out.write("\t\t\t\t<div class=\"jss38\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"search_text\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"search-button\">\n");
      out.write("\t\t\t\t\t<button name=\"searchBtn\" value=\"search\">SEARCH</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- SECTION -->\n");
      out.write("\t<section id=\"brands\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<h2>Browse By Brand</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"0\" class=\"brands\"\n");
      out.write("\t\t\t\ttabindex=\"-1\" aria-hidden=\"false\"\n");
      out.write("\t\t\t\tstyle=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img src=\"https://cdn.bopple.app/assets/helloharry/tile-hover.svg\" class=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"1\" class=\"brands\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://cdn.bopple.app/assets/sonoma/tile-hover.svg\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"2\" class=\"brands\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://cdn.bopple.app/assets/suki/tile-hover.svg\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"3\" class=\"brands\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://cdn.bopple.app/assets/mrburger/tile-hover.svg\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"4\" class=\"brands\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://cdn.bopple.app/assets/madamwoo/tile-hover.svg\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"5\" class=\"brands\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"brand-badge \">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://cdn.bopple.app/assets/belleshotchicken/tile-hover.svg\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"cities\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<h2>Browse By City</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div data-index=\"0\" class=\"cities\"\n");
      out.write("\t\t\t\ttabindex=\"-1\" aria-hidden=\"false\"\n");
      out.write("\t\t\t\tstyle=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">JongRo</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"1\" class=\"cities\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">YeonNam</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"2\" class=\"cities\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">HongDae</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"3\" class=\"cities\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Paris</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"4\" class=\"cities\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">GangSeo</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div data-index=\"5\" class=\"cities\" tabindex=\"-1\"\n");
      out.write("\t\t\t\taria-hidden=\"false\" style=\"outline: none; width: 146px;\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div class=\"city-badge\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Incheon</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<!-- ASIDE -->\n");
      out.write("\t<aside></aside>\n");
      out.write("\n");
      out.write("\t<!-- FOOTER -->\n");
      out.write("\t<footer> \n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t        <div class=\"footer_logo\">\n");
      out.write("\t            <img src=\"images/jaba_english_white.png\">\n");
      out.write("\t        </div>\n");
      out.write("\t        <div class=\"footer_links\">\n");
      out.write("\t\t        <ul>\n");
      out.write("\t\t            <li class=\"links_head\">JABA for YOUNG&RICH</li>\n");
      out.write("\t\t            <li>WHY JABA?</li>\n");
      out.write("\t\t            <li>PRICING</li>\n");
      out.write("\t\t            <li><a href='#'>PARTNER LOGIN</a></li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t\t        <ul>\n");
      out.write("\t\t            <li class=\"links_head\">TOP CITIES</li>\n");
      out.write("\t\t            <li>JONGRO</li>\n");
      out.write("\t\t            <li>SEOCHON</li>\n");
      out.write("\t\t            <li>PARIS</li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t\t        <ul>\n");
      out.write("\t\t            <li class=\"links_head\">SUPPORT</li>\n");
      out.write("\t\t            <li>CUSTOMER HELP</li>\n");
      out.write("\t\t            <li>PARTNER HELP</li>\n");
      out.write("\t\t            <li>SUGGEST STH</li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t\t        <ul>\n");
      out.write("\t\t            <li class=\"links_head\">COMPANY</li>\n");
      out.write("\t\t            <li>CUSTOMER HELP</li>\n");
      out.write("\t\t            <li>PARTNER HELP</li>\n");
      out.write("\t\t            <li>SUGGEST STH</li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t     </div>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"footer__disclaimer\">\n");
      out.write("        <strong>JABA connects customers with popular cafe brands.</strong>\n");
      out.write("        <p>\n");
      out.write("        We believe that time is precious. We strive to create beautiful technology that helps you save time and make ordering easy, both sides of the counter. Order from JABA with the best selection of local cafes.\n");
      out.write("        </p>\n");
      out.write("        <div class=\"legal\">\n");
      out.write("        \t<div>\n");
      out.write("        \t\t<div class=\"legal__copyright\">© 2020 JABA Technologies Pty Ltd</div>\n");
      out.write("        \t\t<ul class=\"legal__links\">\n");
      out.write("\t        \t\t<li><a class=\"MuiTypography-root MuiLink-root MuiLink-underlineNone MuiTypography-colorPrimary\" href=\"/legal/privacy-policy\">Privacy Policy</a></li>\n");
      out.write("\t        \t\t<li><a class=\"MuiTypography-root MuiLink-root MuiLink-underlineNone MuiTypography-colorPrimary\" href=\"/legal/terms-and-conditions\">Terms of Use</a></li>\n");
      out.write("\t        \t\t<li><a class=\"MuiTypography-root MuiLink-root MuiLink-underlineNone MuiTypography-colorPrimary\" href=\"https://help.bopple.com/\" target=\"_blank\" rel=\"noopener noreferrer\">Help Centre</a></li>\n");
      out.write("\t        \t\t<li><a class=\"MuiTypography-root MuiLink-root MuiLink-underlineNone MuiTypography-colorPrimary\" href=\"https://customer-contact-help.bopple.com\" target=\"_blank\" rel=\"noopener noreferrer\">Leave Feedback</a></li>\n");
      out.write("        \t\t</ul>\n");
      out.write("        \t\t</div>\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("        \t\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t</footer>\n");
      out.write("\t\n");
      out.write("\t<!--  로그인 스크립트 ajax 통신  -->\n");
      out.write("\t<script>\n");
      out.write("\t$(\"#signin\").on(\"click\",function(){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"client/clientLogin.do\",\n");
      out.write("\t\t\tdata: { email: $(\"#email\").val(),\n");
      out.write("\t\t\t\t\tpwd: $(\"#pwd\").val()},\n");
      out.write("\t\t\tsuccess: function(res1){\n");
      out.write("\t\t\t\tconsole.log(res1);\n");
      out.write("\t\t\t\tvar biz = \"BizPartner\";\n");
      out.write("\t\t\t\tvar admin = \"Admin\";\n");
      out.write("\t\t\t\t// res1 이 BizPartner 이면 BizPartner 페이지로 이동.\n");
      out.write("\t\t\t\tif(res1 == biz){\n");
      out.write("\t\t\t\t\tlocation.href=\"./BizMain.jsp\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(res1 == admin){\n");
      out.write("\t\t\t\t\tlocation.href=\"./adminMain_ex.jsp\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#logoutBtn\").on(\"click\",function(){\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"client/clientLogout.do\",\n");
      out.write("\t\t\tdata:\t{},\n");
      out.write("\t\t\tsuccess: function(){}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\"#signup\").on(\"click\",function(){\n");
      out.write("\t\t// email 중복체크\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:\"client/clientCheckId.do\",\n");
      out.write("\t\t\tdata:{ emailRegister: $(\"#emailRegister\").val()},\n");
      out.write("\t\t\tsuccess: function(res1){\n");
      out.write("\t\t\t\tconsole.log(res1);\n");
      out.write("\t\t\t\talert(res1);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t$(\"#passwordRegister\").change(function(){\n");
      out.write("\t\tvar pw = $(\"#passwordRegister\").val();\n");
      out.write("\t\t var num = pw.search(/[0-9]/g);\n");
      out.write("\t\t var eng = pw.search(/[a-z]/ig);\n");
      out.write("\t\t var spe = pw.search(/[`~!@@#$%^&*]/gi);\n");
      out.write("\n");
      out.write("\t\t if(pw.length < 8 || pw.length > 20){\n");
      out.write("\t\t  alert(\"8자리 ~ 20자리 이내로 입력해주세요.\");\n");
      out.write("\t\t  $(\"#passwordRegister\").val(\"\");\n");
      out.write("\t\t  return false;\n");
      out.write("\t\t }else if(pw.search(/\\s/) != -1){\n");
      out.write("\t\t  alert(\"비밀번호는 공백 없이 입력해주세요.\");\n");
      out.write("\t\t  $(\"#passwordRegister\").val(\"\");\n");
      out.write("\t\t  return false;\n");
      out.write("\t\t }else if(num < 0 || eng < 0 || spe < 0 ){\n");
      out.write("\t\t  alert(\"영문,숫자, 특수문자를 혼합하여 입력해주세요.\");\n");
      out.write("\t\t  $(\"#passwordRegister\").val(\"\");\n");
      out.write("\t\t  return false;\n");
      out.write("\t\t }else {\n");
      out.write("\t\t\tconsole.log(\"통과\"); \n");
      out.write("\t\t    return true;\n");
      out.write("\t\t }\n");
      out.write("\t})\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
