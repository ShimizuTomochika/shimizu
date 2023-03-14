/**********************************************************************************
 * [概要] 初期表示
 * [詳細] 
 **********************************************************************************/
function do_show() {
	
	// 氏名を設定
	$('#r-name-kanji').text(sessionStorage.getItem("name-kanji"));	// 氏名(漢字)
	$('#r-name-kana').text(sessionStorage.getItem("name-kana"));	// 氏名(カナ)
	
	// 性別を取得
	let sex = sessionStorage.getItem("sex") == "1" ? "男性" : "女性";
	
	// 性別を設定
	$('#r-sex').text(sex);
	
	// 生年月日を取得
	let birthday = sessionStorage.getItem("birthday");
	let year     = birthday.substr(0, 4);
	let month    = birthday.substr(4, 2);
	let day      = birthday.substr(6, 2);
	
	// 生年月日を設定
	$('#r-birthday').text(year + "年" + month + "月" + day + "日");
	
	// 現在日付を取得
	let today = new Date();
	
	// 年齢を取得
	let age = today.getFullYear() - year;
	
	// 誕生日を迎えていない場合
	if(today.getMonth() > month && today.getDay() > day) {
		age = age - 1;
	}
	
	// 年齢を設定
	$('#r-age').text(age + "歳");
	
	/*-------------------------------------------------------------------------
	  [概要] 戻るボタンイベント
	 -------------------------------------------------------------------------*/
	$('.js-back-btn').on('click', function() {
		
		sessionStorage.clear();
		
		$(this).attr("href", "./A001.jsp");
	});
}