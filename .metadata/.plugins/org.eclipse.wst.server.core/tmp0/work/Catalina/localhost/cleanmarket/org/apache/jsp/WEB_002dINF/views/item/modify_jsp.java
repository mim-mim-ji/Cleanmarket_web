/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2021-03-29 09:28:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/minji/Desktop/CleanMarket/webProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CleanMarket/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/minji/Desktop/CleanMarket/webProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CleanMarket/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1608119411188L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("header.masthead {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("    display: block;\r\n");
      out.write("    list-style-type: disc;\r\n");
      out.write("    margin-block-start: 1em;\r\n");
      out.write("    margin-block-end: 1em;\r\n");
      out.write("    margin-inline-start: 0px;\r\n");
      out.write("    margin-inline-end: 0px;\r\n");
      out.write("    padding-inline-start: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bphXry {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tpadding: 2rem 0px;\r\n");
      out.write("\tborder-bottom: 1px solid rgb(220, 219, 228);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bBKMEo {\r\n");
      out.write("    width: 10.5rem;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t<div class=\"card-header text-white\"\r\n");
      out.write("\t\t\t\t\tstyle=\"background-color: #643691;\">게시글 수정</div>\r\n");
      out.write("\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form name=\"writeForm\" role=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"memNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.memNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sc-kqEXUp jMkGB\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-bXopBW bBKMEo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t상품이미지<span>*</span><small>(0/12)</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h6>이미지 등록</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"profile_pt\" id=\"profile_pt\" accept=\"image/jpg, image/jpeg, image/png\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonchange=\"previewImage(this,'View_area')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id='View_area'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle='position: relative; width: 200px; height: 200px; color: black; border: 0px solid black; dispaly: inline;'></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-fjdPjP iozzGC\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b>* 상품 이미지는 640x640에 최적화 되어 있습니다.</b><br>- 이미지는 상품등록 시\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t정사각형으로 짤려서 등록됩니다.<br>- 이미지를 클릭 할 경우 원본이미지를 확인할 수 있습니다.<br>-\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t이미지를 클릭 후 이동하여 등록순서를 변경할 수 있습니다.<br>- 큰 이미지일경우 이미지가 깨지는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t경우가 발생할 수 있습니다.<br>최대 지원 사이즈인 640 X 640 으로 리사이즈 해서\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t올려주세요.(개당 이미지 최대 10M)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-bXopBW gxnpCB\">제목<span>*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\" style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-hokXgN hcrSpf\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"sc-gneEKw dBgbVT\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"itemTitle\" class=\"form-control tooltipstered\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trequired value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemTitle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"sc-boCWhm hBajsm\">0/40</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\"><div class=\"sc-bXopBW DTAYM\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t카테고리<span>*</span><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\" style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-hXhGGG XXBMH\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"itemCategory\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<strong>기존 선택 카테고리 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemCategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"itemCategory\" value=\"여성의류\" checked>여성의류<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"itemCategory\" value=\"남성의류\">남성의류<br> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"itemCategory\" value=\"신발\">신발<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"itemCategory\" value=\"모자/인형/가방\">모자/인형/가방<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\"><div class=\"sc-bXopBW gxnpCB\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t거래지역<span>*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\" style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-cIsjWt etcNyM\" >\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label> <input name=\"itemFiradd\" readonly\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemFiradd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" checked> 주소1 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemFiradd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p style=\"font-size: small;\">(중복 선택 가능, 하나 이상 지정하세요)</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\"><div class=\"sc-bXopBW edUXQu\">설명</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\" style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"itemContent\" rows=\"6\" cols=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"form-control tooltipstered\" required>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemContent }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-eqGige gTqRab\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"sc-kUQWMX giYAKW\">0/2000</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\"><div class=\"sc-bXopBW gxnpCB\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t가격<span>*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\" style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-fxMfqs hGKuJO\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"itemPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control tooltipstered\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"sc-eIvgmF fxEngV\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"sc-jklikK htQzEY\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"contactHope\" class=\"sc-bkypNX gHNpNK\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>기존 가격 협의가능 여부 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemPriceOption }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"itemPriceOption\" type=\"checkbox\">&nbsp;가격협의 가능</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"sc-gxbSSY bphXry\"><div class=\"sc-bXopBW edUXQu\">상품 상태변경</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"sc-hhaNoI buTCOV\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"padding-left: 10px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>현재 상품상태 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemState}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select id=\"itemState\" class=\"form-control\" name=\"itemState\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"판매중\" selected>판매중</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"예약중\">예약중</option>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"거래완료\">거래완료</option>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"수정\" class=\"btn form-control\" id=\"itemWrite-btn\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp; \r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn form-control\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer; margin-top: 0; height: 40px; color: white; background-color: orange; border: 0px solid #388E3C; opacity: 0.8\">취소</a>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t//이미지\r\n");
      out.write("\tfunction previewImage(targetObj, View_area) {\r\n");
      out.write("\t\tvar preview = document.getElementById(View_area); //div id\r\n");
      out.write("\t\tvar ua = window.navigator.userAgent;\r\n");
      out.write("\r\n");
      out.write("\t\t//ie일때(IE8 이하에서만 작동)\r\n");
      out.write("\t\tif (ua.indexOf(\"MSIE\") > -1) {\r\n");
      out.write("\t\t\ttargetObj.select();\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\tvar src = document.selection.createRange().text; // get file full path(IE9, IE10에서 사용 불가)\r\n");
      out.write("\t\t\t\tvar ie_preview_error = document\r\n");
      out.write("\t\t\t\t\t\t.getElementById(\"ie_preview_error_\" + View_area);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (ie_preview_error) {\r\n");
      out.write("\t\t\t\t\tpreview.removeChild(ie_preview_error); //error가 있으면 delete\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar img = document.getElementById(View_area); //이미지가 뿌려질 곳\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//이미지 로딩, sizingMethod는 div에 맞춰서 사이즈를 자동조절 하는 역할\r\n");
      out.write("\t\t\t\timg.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\"\r\n");
      out.write("\t\t\t\t\t\t+ src + \"', sizingMethod='scale')\";\r\n");
      out.write("\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\tif (!document.getElementById(\"ie_preview_error_\" + View_area)) {\r\n");
      out.write("\t\t\t\t\tvar info = document.createElement(\"<p>\");\r\n");
      out.write("\t\t\t\t\tinfo.id = \"ie_preview_error_\" + View_area;\r\n");
      out.write("\t\t\t\t\tinfo.innerHTML = e.name;\r\n");
      out.write("\t\t\t\t\tpreview.insertBefore(info, null);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//ie가 아닐때(크롬, 사파리, FF)\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar files = targetObj.files;\r\n");
      out.write("\t\t\tfor (var i = 0; i < files.length; i++) {\r\n");
      out.write("\t\t\t\tvar file = files[i];\r\n");
      out.write("\t\t\t\tvar imageType = /image.*/; //이미지 파일일경우만.. 뿌려준다.\r\n");
      out.write("\t\t\t\tif (!file.type.match(imageType))\r\n");
      out.write("\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\tvar prevImg = document.getElementById(\"prev_\" + View_area); //이전에 미리보기가 있다면 삭제\r\n");
      out.write("\t\t\t\tif (prevImg) {\r\n");
      out.write("\t\t\t\t\tpreview.removeChild(prevImg);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar img = document.createElement(\"img\");\r\n");
      out.write("\t\t\t\timg.id = \"prev_\" + View_area;\r\n");
      out.write("\t\t\t\timg.classList.add(\"obj\");\r\n");
      out.write("\t\t\t\timg.file = file;\r\n");
      out.write("\t\t\t\timg.style.width = '200px';\r\n");
      out.write("\t\t\t\timg.style.height = '200px';\r\n");
      out.write("\t\t\t\tpreview.appendChild(img);\r\n");
      out.write("\t\t\t\tif (window.FileReader) { // FireFox, Chrome, Opera 확인.\r\n");
      out.write("\t\t\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\t\t\treader.onloadend = (function(aImg) {\r\n");
      out.write("\t\t\t\t\t\treturn function(e) {\r\n");
      out.write("\t\t\t\t\t\t\taImg.src = e.target.result;\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t})(img);\r\n");
      out.write("\t\t\t\t\treader.readAsDataURL(file);\r\n");
      out.write("\t\t\t\t} else { // safari is not supported FileReader\r\n");
      out.write("\t\t\t\t\t//alert('not supported FileReader');\r\n");
      out.write("\t\t\t\t\tif (!document.getElementById(\"sfr_preview_error_\"\r\n");
      out.write("\t\t\t\t\t\t\t+ View_area)) {\r\n");
      out.write("\t\t\t\t\t\tvar info = document.createElement(\"p\");\r\n");
      out.write("\t\t\t\t\t\tinfo.id = \"sfr_preview_error_\" + View_area;\r\n");
      out.write("\t\t\t\t\t\tinfo.innerHTML = \"not supported FileReader\";\r\n");
      out.write("\t\t\t\t\t\tpreview.insertBefore(info, null);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/footer.jsp", out, false);
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/item/modify.jsp(107,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemSecadd != 'null' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<label> <input name=\"itemSecadd\" readonly\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemSecadd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"> \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t주소2 : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemSecadd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/item/modify.jsp(161,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/item/content/${item.itemNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}