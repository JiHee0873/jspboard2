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
	
    <title>Dashboard Template for Bootstrap</title>
	
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath }/css/dashboard.css" rel="stylesheet">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <%@ include file="/include/jQuery.jsp"%>
    <%@ include file="/include/commonCss.jsp"%>
    <script>
		$(function(){
			
		})    
    
    </script>
  </head>

  <body>
		<%@ include file="/layout/header.jsp" %>
  
    <div class="container-fluid">
      <div class="row">
        <%@ include file ="/layout/left.jsp" %>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <h2 class="sub-header">${notice_title }</h2>
          <div class="table-responsive">
                <form action="<%=request.getContextPath()%>/boardUser" method="post">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>게시글 번호</th>
                  <th>부모글 번호</th>
                  <th>제목</th>
                  <th>작성자</th>
                  <th>작성일시</th>
                </tr>
              </thead>
              <tbody>
              	<c:forEach items="${listBoardVO }" var="boardVO">
	               	<tr>
	               		<td>${boardVO.board_seq }</td>
	               		<td>${boardVO.pboard_seq }</td>
	               		<td>${boardVO.board_title }</td>
	               		<td>${boardVO.board_mem_id }</td>
	               		<td><fmt:formatDate value="${boardVO.board_dt}" pattern="yyyy-MM-dd"/></td>
	               	</tr>
                </c:forEach>
              </tbody>
            </table>
                ${pageNav }
                <button type="button"  class="btn btn-primary">게시글추가</button>
                </form>
          </div>
        </div>
      </div>
    </div>
   
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
