<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

   <div class="col-sm-3 col-md-2 sidebar">
     <ul class="nav nav-sidebar">
     	<li><a href="${pageContext.request.contextPath}/noticeUser">게시판 관리</a></li>
     	<c:forEach items="${listNoticeVO }" var="noticeVO">
          <c:choose>
          	 <c:when test="${noticeVO.notice_yn=='Y'}">
          		<li><a href="${pageContext.request.contextPath}/boardUser?notice_seq=${noticeVO.notice_seq}&notice_title=${noticeVO.notice_title }">${noticeVO.notice_title }</a></li>
          	 </c:when>
          </c:choose>
          </c:forEach>
     </ul>
   </div>
