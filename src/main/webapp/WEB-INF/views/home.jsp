<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!--부트스트랩 css 추가-->
    <link rel="stylesheet" href="/css/lib/bootstrap.min.css">



</head>
<body>
	<div class="container">
		<button type="button" class="btn btn-success">네이버로그인</button>
	</div>

















    <!--부트스트랩 js, jquery 추가-->
    <script src="/js/lib/jquery.min.js"></script>
    
    <script src="/js/lib/bootstrap.min.js"></script>
    
    <!--custom js 추가-->
<!--     <script src="/js/app/home.js"></script> -->

<script type="text/javascript">
$(".btn").click(function() {
	location.href = "/naverlogin";
		
});
</script>
</body>
</html>