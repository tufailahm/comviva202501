<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean 
		id="product" 	
		scope="session" 
		class="com.training.comviva.model.Product" >

<jsp:setProperty property="productId" name="product" param="productId"/>

<jsp:setProperty property="productName" name="product" param="productName"/>
<jsp:setProperty property="quantityOnHand" name="product" param="quantityOnHand"/>
<jsp:setProperty property="price" name="product" param="price"/>

</jsp:useBean>

<h2>Your product is saved with Us.. Checkout for billing</h2>

<a href="CheckoutControlller">Checkout</a>
</body>
</html>