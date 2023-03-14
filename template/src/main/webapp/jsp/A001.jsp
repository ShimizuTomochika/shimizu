<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- メタデータ -->
<meta charset="UTF-8">

<!-- タイトル -->
<title>個人情報入力</title>

<!-- CSS -->
<link rel="stylesheet" type="text/css" href="../protected/static/css/style.css"></link>

<!-- JavaScript -->
<script type="text/javascript" src="../public/static/js/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="../public/static/js/jquery.autoKana.js"></script>
<script type="text/javascript" src="../protected/static/js/A001.js"></script>
</head>
<body>
	<main>
		
		<div id="screen-size">
		
			<h2 class="title">個人情報入力</h2>
			
			<hr>
			
			<input type="text" class="c-form-text js-input" id="name-kanji" value="" placeholder="氏名">
			<input type="text" class="c-form-text js-input" id="name-kana" value="" placeholder="カナ">

			<div class="c-form-radio">
				<label>
					<input type="radio" name="sex" value="1" checked />
					<span class="c-form-radio-name">
						<span class="c-form-radio-text">男性</span>
					</span>
				</label>
				<label>
					<input type="radio" name="sex" value="2" />
					<span class="c-form-radio-name">
						<span class="c-form-radio-text">女性</span>
					</span>
				</label>
			</div>
				
			<label>生年月日</label>
			<% 
			function getAge(birthday) {
		
			//今日
			var today = new Date();
		
			//今年の誕生日
			var thisYearsBirthday = new Date(today.getFullYear(), birthday.month - 1, birthday.date);
		
			//年齢
			var age = today.getFullYear() - birthday.year;
		
			if (today < thisYearsBirthday) {
				//今年まだ誕生日が来ていない
				age--;
			}
		
			return age;
		}
		%>
			<div id="birthday">
				<div class="c-form-select">
					<select class="js-birth" id="year">
						<option value=""></option>
					<%
						for(int year = 1990; year < 2023; year++) {
					%>
						<option value="<%= year %>"><%= year %></option>
					<%
						}
					%>
					</select>
				</div>
				<label>年</label>
				<div class="c-form-select">
					<select class="js-birth" id="month">
						<option value=""></option>
					<%
						for(int cnt = 1; cnt < 13; cnt++) {
							String month = cnt < 10 ? "0" + cnt : "" + cnt;
					%>
							<option value="<%= month %>"><%= month %></option>
					<%
						}
					%>
					</select>
				</div>
				<label>月</label>
				<div class="c-form-select">
					<select class="js-birth" id="day">
						<option value=""></option>
					</select>
				</div>
				<label>日</label>
			</div>
						
			<h2 class="title">親権者入力</h2>
						
			<input type="text" class="c-form-text js-input" id="name-kanji" value="" placeholder="氏名">
			<input type="text" class="c-form-text js-input" id="name-kana" value="" placeholder="カナ">

			<div class="c-form-radio">
				<label>
					<input type="radio" name="sex_v" value="1" checked />
					<span class="c-form-radio-name">
						<span class="c-form-radio-text">男性</span>
					</span>
				</label>
				<label>
					<input type="radio" name="sex_v" value="2" />
					<span class="c-form-radio-name">
						<span class="c-form-radio-text">女性</span>
					</span>
				</label>
			</div>
			<select class="zoku" id="zoku" style="width: 200px; text-align: center;">			
				<option value=""></option>
				<option value="父">父</option>
				<option value="母">母</option>
			</select><br>
			<a class="btn btn-radius-solid js-next-btn" href="#">確認<i class="fas fa-angle-right fa-position-right"></i></a>
		
		</div>
			
			<a class="btn btn-radius-solid js-next-btn" href="#">確認<i class="fas fa-angle-right fa-position-right"></i></a>
		
		</div>
	
	</main>
	<script>
		$(function() {
			do_show();
		});
	</script>
</body>
</html>