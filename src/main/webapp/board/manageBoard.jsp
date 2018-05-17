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
    		
    		$("#btnYN").click(function(){
    			
    		})
    		
    		$("#noticeReg").click(function(){
    			document.location="${pageContext.request.contextPath}/board/noticeReg.jsp";
    			
    		});
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
         <h2 class="sub-header">게시판</h2>
          <div class="table-responsive">
            <form action="<%=request.getContextPath()%>/boardUser" method="post" >
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>게시판번호</th>
                  <th>게시판명 </th>
                  <th>작성자</th>
                  <th>작성일시</th>
                  <th>활성여부</th>
                </tr>
              </thead>
              <tbody>
              	<c:forEach items="${listNoticeVO }" var="noticeVO">
                	<tr>
                		<td>${noticeVO.notice_seq }</td>
                		<td>${noticeVO.notice_title }</td>
                		<td>${noticeVO.notice_mem_id }</td>
                		<td><fmt:formatDate value="${noticeVO.notice_dt}" pattern="yyyy-MM-dd"/></td>
                		<td>
                		<c:choose>
                			<c:when test="${noticeVO.notice_yn=='Y'}">
                				<input type="radio" name="${noticeVO.notice_seq }" value='Y' checked="checked">활성화
                				<input type="radio" name="${noticeVO.notice_seq }" value='N'>비활성화
                			</c:when>
                			<c:when test="${noticeVO.notice_yn=='N'}">
                				<input type="radio" name="${noticeVO.notice_seq }" value='Y' >활성화
                				<input type="radio" name="${noticeVO.notice_seq }" value='N' checked="checked">비활성화
                			</c:when>
                		</c:choose>
                   			 <button type="button" id="btnYN" class="btn btn-info">활성변경</button>
                		</td>
                	</tr>
                </c:forEach>
              </tbody>
            </table>
                  <button id="noticeReg" type="button"  class="btn btn-primary">게시판추가</button>
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
