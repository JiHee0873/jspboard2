<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>로그인 화면</h2>
  <form action="<%=request.getContextPath()%>/loginUser" method="post">
    <div class="form-group">
      <label for="email">아이디 : </label>
      <input type="text" class="form-control" id="mem_id" placeholder="Enter id" name="mem_id">
    </div>
    <div class="form-group">
      <label for="pwd">비밀번호 : </label>
      <input type="password" class="form-control" id="mem_pass" placeholder="Enter password" name="mem_pass">
    </div>
    <button type="submit" class="btn btn-default">로그인</button>
  </form>
</div>

</body>
</html>