<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- メタデータ -->
<meta charset="UTF-8">

<!-- タイトル -->
<title>入力内容確認</title>

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="../protected/static/css/style.css"></link>

<!-- JavaScript -->
<script type="text/javascript" src="../public/static/js/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="../protected/static/js/B001.js"></script>
</head>
<body>
	<main>
		
		<div id="screen-size">
		
			<h2 class="title">入力内容確認</h2>
			
			<hr>
			
			<div class="result">
				<div class="wrap">
					<span>氏　　名</span>
					<label id="r-name-kanji"></label>
				</div>
				<div class="wrap">
					<span>カ　　ナ</span>
					<label id="r-name-kana"></label>
				</div>
				<div class="wrap">
					<span>性　　別</span>
					<label id="r-sex"></label>
				</div>
				<div class="wrap">
					<span>生年月日</span>
					<label id="r-birthday"></label>
				</div>				
				<div class="wrap">
					<span>年　　齢</span>
					<label id="r-age"></label>
				</div>
			</div>
			
			<a class="btn btn-radius-solid js-back-btn" href="#">戻る<i class="fas fa-angle-right fa-position-right"></i></a>
			
		</div>
	
	</main>
	<script>
		$(function() {
			do_show();
		});
	</script>
</body>
</html>