<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>GANGWHA_HOME</title>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!--부트스트랩 css 추가-->
<link rel="stylesheet" href="/css/lib/bootstrap.min.css">
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/css/app/gangwha_home.css">

</head>
<body>
	<!-- top -->
	<nav
		class="navbar navbar-expand-sm bg-light  navbar-light justify-content-center fixed-top">
		<a class="navbar-brand" href="#"> <img src="/image/home/logo.png"
			alt="Logo" style="" />
		</a>
	</nav>

	<div id="demo" class="carousel slide" data-ride="carousel">
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
		</ul>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="/image/home/main_img_01.png" alt="Los Angeles" width="100%" height="100%">
				<div class="carousel-caption">
					<h3>루지</h3>
					<p>루지설명</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="/image/home/main_img_02.png" alt="Chicago" width="100%" height="100%">
				<div class="carousel-caption">
					<h3>관광 곤돌라</h3>
					<p>곤돌라설명</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="/image/home/main_img_03.png" alt="New York" width="100%" height="100%">
				<div class="carousel-caption">
					<h3>회전 전망대</h3>
					<p>전망대설명</p>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#demo" data-slide="prev"> 
			<span class="carousel-control-prev-icon"></span>
		</a> 
		<a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>


	GANGWHA_HOME!!



	<!-- bottom -->
	<nav class="navbar navbar-expand bg-light navbar-light fixed-bottom">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="#">멤버십소개</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">교환권구매</a></li>
			<li class="nav-item"><a class="nav-link" href="#">구매내역</a></li>
			<li class="nav-item"><a class="nav-link" href="#">마이페이지</a></li>
			<li class="nav-item"><a class="nav-link" href="#">고객센터</a></li>
		</ul>
	</nav>





	<!--부트스트랩 js, jquery 추가-->
	<script src="/js/lib/jquery.min.js"></script>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script> -->

	<script src="/js/lib/bootstrap.min.js"></script>
	<!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script> -->

	<!--custom js 추가-->
	<script src="/js/app/main.js"></script>


</body>
</html>