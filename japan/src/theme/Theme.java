package theme;

public class Theme {
	
}
/*
 ・Packageを2つ作ってください
 	Package名：Japan ←ここで実行します
 	Package名：JapanSub
 	
 ・Package名：Japanの中にクラスJapanを作成してください
 	mainメソッドを作成してください
 	①②の順番で書いてください
 	①コンソールに出力する文字列
 		「出力回数の数字 +「,」+ 「-1」か「0」を入力してください」
	②JapanSub.main()の記述

 ・Package名：JapanSubで新規クラスを5つ作成し下記作業をしてください
	条件 アクセス修飾子：public	クラス名：JapanSub
	条件 アクセス修飾子：public クラス名：JapanMap
	条件 アクセス修飾子：public クラス名：JapanBean
	条件 アクセス修飾子：public クラス名：JapanMapProcess 継承：JapanBean
	条件 アクセス修飾子：public クラス名：JapanProgress

・クラス：JapanSubでフィールドを3つ作成してください
	条件 アクセス修飾子：public クラス変数：static 戻り値無し クラス名：main
	6つのインスタンスの生成をしてください
		Scanner
		JapanProgress
		JapanMap
		JapanMapProcess
		ArrayList(Integer)
		HashMap(Integer,String)
		
	ArrayListにJapanProgressのinfoを入れてください
	infoの引数：Scanner
	
	HashMapにJapanMapのnameInfoを入れてください
	nameInfoの引数：ArrayList
	
	JapanMapProcessのjapanを呼んでください
	japanの引数：HashMap
	
・クラス：JapanBeanでフィールドを3つ作成してください
	条件 アクセス修飾子：private String型 フィールド名：name
	条件 アクセス修飾子：private double型 フィールド名：width
	条件 アクセス修飾子：private String型 フィールド名：prefecturalCapital

	各フィールドのsetterとgetterを作成してください
	条件 アクセス修飾子：public メソッド名：set○○
	条件 アクセス修飾子：public メソッド名：get○○
	○○の先頭文字は大文字で命名すること
	例：sushi→Sushi
	thisを使うこと
	
	処理に必要なフィールド作成してsetterとgetterを作ってください
	
・クラス：JapanProgressでメソッドを作成してください
	条件 アクセス修飾子：public 戻り値：List<Integer> メソッド名：info 引数：Scanner型 scan
	
	String型に引数を入れてください
	String型[]にString型で受け取った文字列を「,」区切りで格納してください
	
	List<Integer>のArrayListを宣言してください
	
	int型のflagとint型のscLenを宣言して
	flagに-1、scLenに0入れてください
	if文でString型[]の1つめが0と等しい場合はflagを0にしてください
	scLenにtxt[0]の値を入れてください
	for文でscLenの値未満で作ってください
	nextLineしてlistにaddしてください
	
	if文でflagが-1ならlistを昇順にしてください
	違う場合は降順にしてください
	returnでlistを返してください
	
・クラス：JapanMapでメソッドを作成してください
	条件 アクセス修飾子：protected 戻り値：Map<Integer,String>
	メソッド名：nameInfo 引数：List<Integer>
	インスタンスの生成を2つしてください
	HashMap Integer,String ：name
	HashMap Integer,String ：names
	
	mapに下記の値を追加してください
	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
	
	for文でlistから受け取った数だけnameの値をnamesに追加してください
	returnでnamesを返してください
	
・クラス：JapanMapProcessでメソッドを作成してください
	条件 アクセス修飾子：public 戻り値無し メソッド名：japan 引数：Map<Integer, String> map
 	JapanBeanのインスタンスの生成をしてください
 	for文でmapの数だけ実行する文を書いてください
 	String[]をfor文の中で作成しmapの値を「：」区切りで配列に入れてください
 	左から順番にsetを使いName、PrefecturalCapital、Widthに配列の中身を入れていってください
 	setしたものをspeakの引数に入れてください
 
 	メソッドを作成してください
 	条件 アクセス修飾子：public 戻り値無し メソッド名：speak 引数：JapanBean jp
	下記4行の例のようにコンソールで出力されるように作成してください
  	
  	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	※ここに改行をいれる
	
	
 */
 