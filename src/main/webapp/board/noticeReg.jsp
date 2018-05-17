<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
    <title>Dashboard Template for Bootstrap</title>
	
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath }/css/dashboard.css" rel="stylesheet">

    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <%@ include file="/include/jQuery.jsp"%>
    <script>
    	$(function(){
    		$('#notice_title').focus();
    		
    		$('#noticeReg').click(function(){
    			if($('#notice_title').val().trim() == ''){
    				alert("게시판명을 입력하지 않았습니다.");
    				$('#notice_title').focus();
    				return false;
    			}
    			
    			$('#frm').submit();
    			
    		})
    		
    	});
    
    </script>
    
  	<style>
  		#btnYN{
  			font-size: 12px;
  		}
  	</style>
    
  </head>

  <body>
	<%@ include file="/layout/header.jsp" %>
    <div class="container-fluid">
      <div class="row">
        <%@ include file ="/layout/left.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         	<form id="frm" action="${pageContext.request.contextPath }/insertNotice" method="post" class="form-horizontal" 
         	  role="form">
				<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">사용자 아이디</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="notice_title" name="notice_title"
							placeholder="게시판 명">
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button id="noticeReg" type="button" class="btn btn-default">게시판 추가</button>
					</div>
				</div>
			</form>
		</div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="<%=request.getContextPath() %>/bootstrap.min.js"></script>
  </body>
</html>
