/**********************************************************************************
 * [概要] 初期表示
 * [詳細] 
 **********************************************************************************/
function do_show() {
	
	// 初期化処理
	init_show();

	$.fn.autoKana('#name-kanji', '#name-kana', { katakana: true });

	/*-------------------------------------------------------------------------
	  [概要] テキストボックス入力時イベント
	 -------------------------------------------------------------------------*/
	$('.js-input').on('input', function() {

		// 全角文字以外削除
		$(this).val(ctrl_name(this));
	});

	/*-------------------------------------------------------------------------
	  [概要] 生年月日プルダウンイベント
	-------------------------------------------------------------------------*/
	$('.js-birth').on('change', function() {

		let DAY_MAP = {
			"01": 31, "02": 28, "03": 31, "04": 30, "05": 31, "06": 30, "07": 31, "08": 31, "09": 30, "10": 31, "11": 30, "12": 31
		};

		// 年または月がブランクの場合
		if ($('#year').val() == "" || $('#month').val() == "") {
			
			// 日の子要素を削除
			$('#day').empty();
			
			// 以下処理を行わない
			return;
		}
		
		// 年または月を変更した場合
		if($(this).attr("id") != "day") {
			
			// 年を取得
			let year = parseInt($('#year').val(), 10);
			// 月を取得
			let month = $('#month').val();
			
			// 閏年チェック
			if((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
				DAY_MAP["02"] = 29;
			}
			
			// 日を取得
			let day_value = $('#day').val();
			
			$('#day').empty();
			$('#day').append('<option value=""></option>');
			
			// 日プルダウンに値を設定
			for(let cnt = 1; cnt <= DAY_MAP[month]; cnt++) {
				
				let day = cnt < 10 ? "0" + cnt : "" + cnt;
				
				$('#day').append(
					'<option value="' + day + '">' + day + '</option>'
				);
			}
			
			// 変更前の値がブランクではない場合
			if(day_value != "" && day_value != null) {
				
				let int_day = parseInt(day_value,10);
				
				// 変更前の値が月末以下の場合、値を設定
				if(int_day <= DAY_MAP[month]) {
					$('#day').val(day_value);
				} else {
					$('#day').val("01");
				}
			}
		}
	});
	
	/*-------------------------------------------------------------------------
	  [概要] 確認ボタンイベント
	-------------------------------------------------------------------------*/
	$('.js-next-btn').on('click', function() {
		
		// エラーチェック
		if(!check_error()) {
			return;
		}
		
		sessionStorage.setItem("name-kanji", $('#name-kanji').val());
		sessionStorage.setItem("name-kana", $('#name-kana').val());
		sessionStorage.setItem("sex", $('[name=sex]:checked').val());
		sessionStorage.setItem("birthday", $('#year').val() + $('#month').val() + $('#day').val());
		
		$(this).attr("href", "./B001.jsp");
	});
}

/**********************************************************************************
 * [概要] 初期化処理
 * [詳細]
 **********************************************************************************/
function init_show() {
	
	$('#name-kanji, #name-kana, #year, #month, #day').val("");
	$('[name=sex]').val(["1"]);
}

/**********************************************************************************
 * [概要] 全角文字制御処理
 * [詳細] 半角文字が入力された場合、削除する。
 **********************************************************************************/
function ctrl_name(e) {
	
	let str_array = e.value.split("");
	let tmp_array = [];
	let str       = "";
	
	for(let cnt = 0; cnt < str_array.length; cnt++) {
		
		str = str_array[cnt];
		
		if(str.match(/^[A-Za-z0-9]*$/)) {
			continue;
		}
		
		tmp_array.push(str);
	}
	
	return tmp_array.join("");
}

/**********************************************************************************
 * [概要] エラーチェック処理
 * [詳細]
 * return true 正常, false エラー
 **********************************************************************************/
function check_error() {
	
	if($('#name-kanji').val() == "" || $('#name-kana').val() == "") {
		window.confirm( "氏名を入力してください。" );
		return false;
	}
	
	if($('#year').val() == "" || $('#month').val() == "" || $('#day').val() == "") {
		window.confirm( "生年月日を入力してください。" );
		return false;
	}
	
	return true;
}