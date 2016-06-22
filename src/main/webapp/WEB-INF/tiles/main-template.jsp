<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<title>${title}</title>
		
		<meta charset="utf-8">
		<meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, 
									   user-scalable=no" />
									   
		<tiles:insertAttribute name="meta" />

		<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/base/bootstrap.min.css'/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/base/font-awesome.min.css'/>" />

		<script type="text/javascript" src="<c:url value='/resources/script/base/jquery-1.11.3.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/resources/script/base/jquery.mb.browser.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/resources/script/base/bootstrap.min.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/resources/script/base/angular.min.js'/>"></script>
		
		<tiles:insertAttribute name="head-resources" />
	</head>
	
	<body>
		<div id="wrapper" class="container-fluid">
			<tiles:insertAttribute name="main-header"/>
			<tiles:insertAttribute name="body"/>
			<tiles:insertAttribute name="main-footer"/>
		</div>
		
		<tiles:insertAttribute name="foot-resources" />
	</body>
</html>