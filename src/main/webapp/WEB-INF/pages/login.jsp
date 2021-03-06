<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="app" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css"
	href="${app}/staticfile/css/style.css" />
</head>

<%@include file="_head.jsp"%>
<body>
	<div id="wrap">

		<div class="center_content">
			<div class="left_content">
				<div class="title">
					<span class="title_icon"><img
						src="${app}/staticfile/images/bullet1.gif" alt="" title="" /></span>LOGIN
				</div>

				<div class="feat_prod_box_details">
					<p class="details">欢迎来到Book Store</p>

					<div class="contact_form">
						<div class="form_subtitle">登录</div>


						<div class="details">
							<c:if test="${!empty errorInfo}">
					${errorInfo}
				</c:if>
						</div>


						<form name="register" action="tologin.action">
							<div class="form_row">
								<label class="contact"><strong>用户名:</strong></label> <input
									name="username" type="text" class="contact_input"
									value="${cookie.remname.value }" />
							</div>


							<div class="form_row">
								<label class="contact"><strong>密码:</strong></label> <input
									name="password" type="password" class="contact_input" />
							</div>


							<div class="form_row">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; <input
									type="checkbox" name="remname" value="true"
									${empty cookie.remname?"":"checked='checked'" } />记住用户名
								<!-- <input type="checkbox" name="rememberMe" value="true"/>30天内自动登陆 -->


							</div>


							<div class="form_row">
								<input type="submit" class="register" value="登录" />
							</div>
						</form>
					</div>

				</div>






				<div class="clear"></div>
			</div>
			<!--end of left content-->

			<div class="right_content">


				<div class="cart">
					<div id="view_cart">
						<span><img src="${app}/staticfile/images/cart.gif" alt=""  /> &nbsp;&nbsp;<a href="/search/toborrow"
							style="text-align: center; font-family: 微软雅黑; font-size: 22px;color:#860606">我的借阅</a></span>
					</div>
				</div>
				<div class="title">
					<span class="title_icon"><img
						src="${app}/staticfile/images/bullet3.gif" alt="" title="" /></span>Welcome
					to our Book Store!
				</div>
				<div class="about">
					<p>
						<%@include file="graphCopy.jsp"%>
					</p>
				</div>
			</div>
		</div>
		<!--end of right content-->
		<div class="clear"></div>
	</div>
	<!--end of center content-->
	</div>
</body>

<%@include file="_foot.jsp"%>

</html>